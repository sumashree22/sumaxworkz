package com.xworkz.exceptionhandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchException {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
         int age=s.nextInt();
            System.out.println(age);

    }catch(InputMismatchException |ArithmeticException e){
          e.printStackTrace();
        }
        int  a=30/10;
        System.out.println(a);

    }



}
