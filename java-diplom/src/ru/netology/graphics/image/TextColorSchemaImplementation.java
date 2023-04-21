package ru.netology.graphics.image;

public class TextColorSchemaImplementation implements TextColorSchema {
    private char[] symbols = {'#', '$', '@', '%', '*', '+', '-', '\''};

    public TextColorSchemaImplementation() {

    }

    public TextColorSchemaImplementation(char[] symbols) {
        this.symbols = symbols;
    }

    public char[] getSymbols() {
        return symbols;
    }

    @Override
    public char convert(int color) {
        return symbols[(int) Math.floor(color / 256. * symbols.length)];
    }
}
