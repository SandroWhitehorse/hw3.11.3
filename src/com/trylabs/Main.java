package com.trylabs;

public class Main {

    public static void main(String[] args) {
        for (int i=0;i<9;i++)
        {
            for (int k=10;k>(int)i/2;k--){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
            System.out.print("*");
            }

            System.out.println("");
        }
    }
}
