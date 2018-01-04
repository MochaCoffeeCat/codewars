package com.mocha.SumOfOddNumbers;

public class RowSumOddNumbers {
    private static int rowSumOddNumbers(int n) {
//        return (int) ((Math.pow(((Math.pow(n, 2) + n) / 2), 2)) - (Math.pow(((Math.pow((n - 1), 2) + (n - 1)) / 2), 2)));
        return (int) (Math.pow(n, 3));
    }

    public static void main(String[] args) {
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(42));
    }
}
