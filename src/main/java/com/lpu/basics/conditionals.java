package com.lpu;

public class conditionals {

    public static void main(String[] args)
    {
        int x=90;
//        if(x%2==0)
//        {
//            System.out.println("Even");
//        }else {
//            System.out.println("ODD");
//        }

        if((x & 1)==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
