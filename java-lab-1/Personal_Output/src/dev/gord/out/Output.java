package dev.gord.out;

/*
This class provides a more compact output methods
*/

public class Output {
    public static void printf(String caption, String val) {
        System.out.printf(caption, val);
    }

    public static void printf(String caption, String val, String val2) {
        System.out.printf(caption, val, val2);
    }

    public static void printf(String caption, long val) {
        System.out.printf(caption, val);
    }

    public static void printf(String caption, long val, long val2) {
        System.out.printf(caption, val, val2);
    }

    public static void print() {
        System.out.print("");
    }

    public static void print(String s) {
        System.out.print(s + " ");
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void println() {
        System.out.println();
    }

    public static void print(int n) {
        System.out.print(n + " ");
    }

    public static void println(int n) {
        System.out.println(n);
    }
}
