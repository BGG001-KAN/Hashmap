package org.example;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<Integer, String> bps = new TreeMap<>();
        bps.put(1, "new one");
        bps.put(2, "try ones");
        bps.put(3, "thressa");
        bps.put(4, "asdasd");
        bps.putIfAbsent(5, "whaat");
        //   bps.computeIfAbsent(3);
        System.out.println(bps.keySet());
        System.out.println(bps.entrySet());
        bps.replace(4,"asdasd","sdsdas");
        String holdvalue = bps.remove(4);
        bps.put(99,holdvalue);
        System.out.println(bps);
        System.out.println(bps.containsKey(3));
        int nums[]={85,0,6,55,1,3,9};
        int ascending[]= {1,2,3,9,10,15,17,22};
        Arrays.sort(nums);
   //     for(int i=0;i<nums.length;i++){
   //      System.out.print(nums[i]);
    //}
        int value[]= new int[11];
       for (int i=0;i<11;i++){
           System.out.println(value[i]=2*i);
       }

      System.out.println(Arrays.binarySearch(ascending,5));
}}