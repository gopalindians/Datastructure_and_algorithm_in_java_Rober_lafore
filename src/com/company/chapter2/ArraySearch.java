package com.company.chapter2;

/**
 * Created by gopalindians on 22-07-2015.
 */
public class ArraySearch {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        int term = 3;
        for (int i = 0; i <= num.length; i++) {


            if (i == num.length) {
                System.out.println("Not exists!");
                break;
            } else if (num[i] == term) {
                System.out.println("Exists at key " + i);
            }
        }
    }
}
