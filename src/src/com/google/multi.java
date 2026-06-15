package com.google;
import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int  i=1; i<=10; i++){
            int c = n*i;
            System.out.println(n+"x"+i+"="+c);
        }
    }
}
