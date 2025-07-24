package com.lpu.dsa.Set;
import java.util.HashMap;
public class HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map= new HashMap<>();
        map.put(2,"suman");
        map.put(7,"Akhil");
        map.put(10,"saurabh");
        map.put(43,"ravi");

        System.out.println(map);
        map.put(7,"Riya");
        System.out.println(map);

        System.out.println(map.containsKey(11));

}
