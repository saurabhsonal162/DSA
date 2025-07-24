package com.lpu.dsa;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {

    int[] num={32,3,43,3,3,2,42,4,32,3223,76,32,87,32};


    HashSet<Integer> set = new HashSet<>();

    for(Integer num : arr){
        set.add(num);
    }
    System.out.println(set);

}
