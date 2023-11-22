package se.distansakademin;


public class Utilities {
    public static boolean numberIsOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean stringIsBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static Level getNoiseLevel(int decibel) {
        if (decibel <= 30) {
            return Level.LOW;
        } else if (decibel >= 70) {
            return Level.HIGH;
        } else {
            return Level.MEDIUM;
        }
    }

    public static String makeStringLowercase(String input){
        var output = input.toLowerCase();
        return output;
    }

    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
}

