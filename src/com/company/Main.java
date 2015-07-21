package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] rollNo = new int[9];
        rollNo[0] = 1;
        rollNo[2] = 2;
        rollNo[3] = 41;
        rollNo[4] = 31;
        rollNo[5] = 12;
        rollNo[6] = 13;
        rollNo[7] = 132;
        rollNo[8] = Integer.parseInt("78");


        for (int i = 0; i <= rollNo.length - 1; i += 1) {

            System.out.printf(rollNo[i] + " ");
            System.out.println("i = " + i);

        }


    }
}
