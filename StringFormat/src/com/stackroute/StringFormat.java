package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFormat {
    /*Main class to Format the string*/

    public static void main(String[] args) {

        /*Creating Array List*/
        List<Integer> list = new ArrayList<Integer>();
        list.add(101);
        list.add(44);

        System.out.println(findStringFormat(list));
    }

    /*Method to format the string according to odd or even*/
    public static String findStringFormat(List<Integer> list) {
        String out = null;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    out = "Give Proper Input not negative Numbers!";
                    break;
                } else {
                    String odd = list.stream().filter(n -> n % 2 != 0).map(s -> "Odd" + String.valueOf(s)).collect(Collectors.joining());
                    String even = list.stream().filter((n -> n % 2 == 0)).map(s -> "Even" + String.valueOf(s)).collect(Collectors.joining());
                    out = odd + "," + even;
                }

            }
        } else
            out = "Give proper input not empty list";


        return out;
    }
}
