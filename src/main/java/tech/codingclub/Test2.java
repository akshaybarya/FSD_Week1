package tech.codingclub;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello \nThis side is Akshay");

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("My Youtube");
        arrayList.add("4");

        for(int i = 0 ; i< arrayList.size() ; i++)
            System.out.println(arrayList.get(i));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        LinkedList<Integer> ll = new LinkedList();
        ll.add(69);
        ll.remove(0);

       Iterator<String> it = arrayList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
