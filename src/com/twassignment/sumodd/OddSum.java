package com.twassignment.sumodd;

/**
 * Created by alisonps on 8/10/14.
 */
public class OddSum {
    public static void main(String[] args) {

        int total = 0;
        int x = 1;

        while (x < 100) {
            total = total + x;
            x = x + 2;
        }

        System.out.println(total);
    }
}
