package ru.netology.graphics.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TextGraphicsConverterImplementation implements TextGraphicsConverter {
    private int width = 20;
    private int height = 20;
    private double maxRatio = 0.0;
    private TextColorSchema schema = new TextColorSchemaImplementation();


    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        BufferedImage img = ImageIO.read(new URL(url));

        if (maxRatio != 0.0) {
            double ratio = (double) img.getWidth() / img.getHeight();
            if (ratio > maxRatio) throw new BadImageSizeException(ratio, maxRatio);
        }

        double newWidthDouble = img.getWidth();
        double newHeightDouble = img.getHeight();
        if (img.getWidth() > width) {
            double coefficientWidth = (double) img.getWidth() / width;
            newWidthDouble = width;
            newHeightDouble = img.getHeight() / coefficientWidth;
            if (newHeightDouble > height) {
                double coefficientHeight = newHeightDouble / height;
                newHeightDouble = height;
                newWidthDouble = newWidthDouble / coefficientHeight;
            }
        }
        if (img.getHeight() > height) {
            double coefficientHeight = (double) img.getHeight() / height;
            newHeightDouble = height;
            newWidthDouble = img.getWidth() / coefficientHeight;
        }
        int newWidth = (int) newWidthDouble;
        int newHeight = (int) newHeightDouble;

        Image scaledImage = img.getScaledInstance(newWidth, newHeight, BufferedImage.SCALE_SMOOTH);
        BufferedImage bwImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D graphics = bwImg.createGraphics();
        graphics.drawImage(scaledImage, 0, 0, null);
        ImageIO.write(bwImg, "png", new File("out.png"));
        WritableRaster bwRaster = bwImg.getRaster();

        char[][] array = new char[newHeight][newWidth];
        for (int h = 0; h < array.length; h++) {
            for (int w = 0; w < array[h].length; w++) {
                int color = bwRaster.getPixel(w, h, new int[3])[0];
                char c = schema.convert(color);
                array[h][w] = c; //запоминаем символ c, например, в двумерном массиве или как-то ещё на ваше усмотрение
            }
        }

        StringBuilder symbolImg = new StringBuilder();
        for (char[] chars : array) {
            for (char aChar : chars) {
                symbolImg.append(aChar);
                symbolImg.append(aChar);
            }
            symbolImg.append("\n");
        }

        return symbolImg.toString(); // Возвращаем собранный текст.
    }

    @Override
    public void setMaxWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void setMaxHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void setMaxRatio(double maxRatio) {
        if (maxRatio > 0.0) {
            this.maxRatio = maxRatio;
        }
    }

    public double getMaxRatio() {
        return maxRatio;
    }

    @Override
    public void setTextColorSchema(TextColorSchema schema) {
        this.schema = schema;
    }
}
