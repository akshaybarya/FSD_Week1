package tech.codingclub;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {/*
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack();
        int n = sc.nextInt();

        for(int i = 0 ; i<n ; i++){
            st.push(sc.nextInt());
        }

        int f = sc.nextInt();

        System.out.println(st.search(f));

        while(!st.empty()){
            System.out.print(st.pop() + " ");
        }

        System.out.println();
*/
        Scanner sc=new Scanner(System.in);
        String s=sc.next();



        String[] arr = s.split(" ");

        System.out.println(arr.length);
        for(String x : arr){
            System.out.println(x);
        }
    }
}
