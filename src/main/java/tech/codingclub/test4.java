package tech.codingclub;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("akshaybarya@gmail.com");
        al.add("akshaybarya@gmail.com");
        al.add("akshaybarya@gmail.com9");
        al.add("akshaybarya@gmail.com6");
        al.add("akshaybarya@gmail.com69");
        al.add("akshaybarya@gmail.com69");

        //Collections.sort(al);

        Iterator it1 = al.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
        System.out.println("\n");

        Set<String> st = new TreeSet<String>();

        st.add("badde@gmail.com");
        st.addAll(al);

        Iterator it2 = st.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        int arr[] = {1,2,69,7,5,69,5,2,3,69};
        Arrays.sort(arr);
    }
}
