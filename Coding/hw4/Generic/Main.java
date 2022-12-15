package org.example;

public class Main {
    public static void main(String[] args) {
        GenericSubject<String> a = new GenericSubject<>("A");
        System.out.println(a.getObj());

        GenericSubject<Integer> b = new GenericSubject<>(18);
        System.out.println(b.getObj());

        GenericSubject<Boolean> c = new GenericSubject<>(true);
        System.out.println(c.getObj());
    }
}
