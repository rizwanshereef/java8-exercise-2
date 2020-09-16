package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberUtility {

    public static void main(String[] args) {
/*Creating list and adding values*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(12);

        System.out.println("Even Number Count: "+getEvenNumberCount(list));
        System.out.println("Even Multiples of 3: "+getEvenMuliplesOfThree(list));
        System.out.println("Maximum of Odd Numbers: "+getMaximumOfOddNumbers(list));

    }

    /*Method to get EvenNumberCount using streamAPI*/
    public static long getEvenNumberCount(List<Integer> list){
        Long count =null;
        if(!list.isEmpty()&&!list.contains(null))
        count = list.stream().filter(i->i%2==0).count();
        else
            count =(long)0;

        return count;
    }

    /*Method to get Maximum of Odd Numbers using streamAPI*/


    public static int getMaximumOfOddNumbers(List<Integer> list){
        int max;
        if(!list.isEmpty()&&!list.contains(null)) {
             max = list.stream().filter(i -> i % 2 != 0).max(Integer::compare).get();
        }
        else
            max =0;

        return max;
    }

    /*Method to get Even Multiples of 3 using streamAPI*/

    public static List<Integer> getEvenMuliplesOfThree(List<Integer> list){
        List<Integer> listNew= new ArrayList<Integer>();
        if(!list.isEmpty()&&!list.contains(null))
            listNew = list.stream().filter(i->i%2==0).filter(i->i%3==0).collect(Collectors.toList());
        return listNew;
    }
}
