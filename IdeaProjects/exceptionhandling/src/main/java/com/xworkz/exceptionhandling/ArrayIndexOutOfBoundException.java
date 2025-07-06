package com.xworkz.exceptionhandling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int pincodes[]={123,124,125,126};
        try{
        System.out.println(pincodes[7]);
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound");
        }
    }
}
