package com.google;
import java.util.Scanner;


public class year {
    public static void main (String[] args){
        Scanner in= new Scanner ( System.in);
        System.out.print("enter the number = ");
        int Y = in.nextInt();
        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
            System.out.println("This num is leap year");
        } else {
            System.out.println("This num is not a leap year ");
        }}}
//        if( Y % 4 ==0  ){
//            if( Y % 100 !=0){
//                System.out.println("This num is leap year");
//            }
//            else if(Y % 400 == 0){
//                System.out.println("This num is leap year");
//            }else{
//                System.out.println("This num is not a leap year ");
//            }
//        } else{
//            System.out.println("This num is not a leap year ");
//        }