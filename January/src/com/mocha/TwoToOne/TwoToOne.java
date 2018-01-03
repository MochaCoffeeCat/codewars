package com.mocha.TwoToOne;

import java.util.Arrays;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String res = "";
        char[] sOne;
        char[] sTwo;
        if (s1.equals(s2)) {
            res = s1;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                sOne[i] = s1.substring(i,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        char[] test = {'a', 'b', 'd', 'c'};
        Arrays.sort(test);
        System.out.println(test);
    }
}
