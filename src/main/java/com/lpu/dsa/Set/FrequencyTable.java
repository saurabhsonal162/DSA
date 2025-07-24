package com.lpu.dsa.Set;

import java.util.HashMap;

public class FrequencTable {

    int[] nums={23,32,45,65,32,23,2,6,756,45,65,2,2,6,23};


    HashMap<Integer, Integer> map = new HashMap<>();

    for(int num:nums){
        if(map.containsKey(num)){
            Integer val = map.get(num);
            val++;
            map.put(num,val);
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
