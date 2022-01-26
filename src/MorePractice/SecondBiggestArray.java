package MorePractice;

import day49_encapsulation.Example;

import java.util.*;

public class SecondBiggestArray {

//    Given an Array of numbers. Find and print the 2ndbiggest number. Note the 2ndbiggest should be unique meaning it should be different from the max number
//    Example:
//    Input: [4,3,1,4,5,2,4,8,4,8]
//    Output: 5

    public static void main(String[] args) {
        Integer [] arr = {4,3,1,4,5,2,4,8,4,8};
        List<Integer>list = new ArrayList<>(Arrays.asList(arr));
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
        list.clear();
        list.addAll(set);
        System.out.println(list.get(list.size()-2));




    }
}
