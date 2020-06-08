package com.company;

import java.util.HashSet;
import java.util.Set;

public class No3 {
    /**
     * 数组中重复的数
     */
    //1. 利用hash表 键的唯一性
    public static int findRepeatNumber(int[] nums){

        Set<Integer> set = new HashSet<Integer>();
        int res = -1;
        for(int num : nums){
            if(!set.add(num)) {
                res = num;
                break;
            }
        }
        return res;
    }

    public static int findRepeatNumber2(int[] nums){

        Set<Integer> set = new HashSet<Integer>();
        int res = -1;
        for(int num : nums){
            if(!set.add(num)) {
                res = num;
                break;
            }
        }

        return res;
    }


    public static void main(String args[]){
        int[] nums = {2,3,1,0,2,5,3};
        int res = findRepeatNumber(nums);
        System.out.println(res);
    }

}
