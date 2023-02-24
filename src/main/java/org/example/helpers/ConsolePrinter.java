package org.example.helpers;

public class ConsolePrinter implements Printer{
    @Override
    public void info(String message) {
        System.out.println(message);
    }
}
