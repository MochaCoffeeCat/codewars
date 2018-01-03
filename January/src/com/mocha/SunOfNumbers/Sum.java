package com.mocha.SunOfNumbers;

public class Sum {
    public int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.GetSum(-1,2));

    }
}
