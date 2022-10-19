package org.example.MReference;

public class Main {
    public static void main(String[] args) {
        PrintHi ph = MethodReference::printHi;
        ph.printString();
    }
}
