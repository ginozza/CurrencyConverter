package com.aluracursos.converter.view;

public class LookAndFeel {
    private static final String RESET = "\u001B[0m";

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    private static final String BOLD = "\u001B[1m";
    private static final String ITALIC = "\u001B[3m";

    public String reset() {
        return RESET;
    }

    public String colorize(String text, String color) {
        return color + text + RESET;
    }

    public String red(String text) {
        return colorize(text, RED);
    }

    public String green(String text) {
        return colorize(text, GREEN);
    }

    public String blue(String text) {
        return colorize(text, BLUE);
    }

    public String cyan(String text) {
        return colorize(text, CYAN);
    }

    public String bold(String text) {
        return BOLD + text + RESET;
    }

    public String italic(String text) {
        return ITALIC + text + RESET;
    }

    public String boldColor(String text, String color) {
        return BOLD + color + text + RESET;
    }

    public String italicColor(String text, String color) {
        return ITALIC + color + text + RESET;
    }
}
