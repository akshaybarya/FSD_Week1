package tech.codingclub;

import java.util.Date;

public class Datenow {
    public static void main(String[] args) {
        Date date = new Date();
        long t1 = date.getTime();
//        int w = 0;
        Date x = new Date(t1);
        System.out.println(x.toString());
        for(int i = 0 ; i<1000000; i++){
            for(int j = 1000 ; j>-1 ; j--){

            }
        }
        long t2 = new Date().getTime();
        long diff = t2-t1;
        System.out.println("Time Taken to perform 10^6 operations = "+diff);
        System.out.println(new Date().getTime());
        x = new Date(t2);
        System.out.println(x.toString());
    }
}
