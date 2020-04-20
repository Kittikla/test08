package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        for (int i = 0; i < C; i++) {
            System.out.print("*");
        }
        System.out.println();
            for (int i = 0; i < R - 2; i++) {
                for (int j = 0; j < C; j++) {
                    if (j == 0 || j == C - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < C; i++) {
                System.out.print("*");

            }

    }
}







