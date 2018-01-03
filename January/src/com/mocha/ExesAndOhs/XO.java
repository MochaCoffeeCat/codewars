package com.mocha.ExesAndOhs;

public class XO {
    public static boolean getXO(String str) {
        char[] strArr = str.toCharArray();
        int xn = 0;
        int on = 0;
        for (char c : strArr) {
            if (c == 'x' || c == 'X') {
                xn++;
            } else if (c == 'o' || c == 'O') {
                on++;
            }
        }
        return xn == on;
    }

    public static void main(String[] args) {
        System.out.println(XO.getXO("XxxooO"));
    }
}
