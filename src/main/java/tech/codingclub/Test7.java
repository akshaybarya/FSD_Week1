package tech.codingclub;

public class Test7 {
    public static void main(String[] args) {
        AbstractClass abs = new AbstractClass() {
            @Override
            public void m() {
                System.out.println("Hello");
            }
        };
        abs.m();
    }
}
