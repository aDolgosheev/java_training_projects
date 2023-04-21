package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextColorSchemaImplementation;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImplementation;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImplementation();
//        char[] symbols = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
//        TextColorSchema textColorSchema = new TextColorSchemaImplementation(symbols);// Создайте тут объект вашего класса конвертера
//        converter.setTextColorSchema(textColorSchema);
        converter.setMaxHeight(1080);
        converter.setMaxWidth(1920);
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

//        TextColorSchema test = new TextColorSchemaImplementation();
//        for (int i = 0; i < 256; i += 5) {
//            System.out.print(test.convert(i));
//        }

        // Или то же, но с выводом на экран:
        //String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
    }
}
