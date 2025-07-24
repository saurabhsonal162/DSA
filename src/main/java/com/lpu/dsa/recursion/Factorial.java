package com.lpu.basics;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factRecursive(6));
    }


    static long factRecursive(long num)// with recursion
    {
        if(num==0 || num==1){
            return 1;
        }
        return num*factRecursive(num-1);

    }
    public static long factorial(int num) { //without recursion
        if (num < 0) {
            return -1;
        }

        long answer = 1;
        for (int i = num; i >= 1; i--) {
            answer *= i;
        }
        return answer;
    }
}
