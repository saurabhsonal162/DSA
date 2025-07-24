package com.lpu;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int options;

        outer: while (true) {
            System.out.println("Enter an option (1-4), or 0 to exit:");
            options = sc.nextInt();

            switch (options) {
                case 1: {
                    System.out.println("avocado");
                    break;
                }
                case 2: {
                    System.out.println("breakfast");
                    break;
                }
                case 3: {
                    System.out.println("lunch");
                    break;
                }
                case 4: {
                    System.out.println("dinner");
                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    break outer;
                }
                default: {
                    System.out.println("nothing to eat");
                }
            }
        }

        sc.close();
    }
}