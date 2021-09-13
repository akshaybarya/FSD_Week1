package tech.codingclub;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello EveryOne");
        System.out.println("I am Akshay Kumar Barya");

        Random r = new Random();

        int x = r.nextInt();
        System.out.println(x);
        System.out.println(r.nextInt(100));

        System.out.println("String");

        String s = "Hello";
        System.out.println(s);
        s += " world";
        System.out.println(s);
    }
}
