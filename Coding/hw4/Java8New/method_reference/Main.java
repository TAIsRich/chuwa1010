package org.example.MReference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        printHi ph = MethodReference::printHi;
        ph.printString();
    }
}
