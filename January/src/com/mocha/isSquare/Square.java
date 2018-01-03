package com.mocha.isSquare;

public class Square {
    public static boolean isSquare(int n) {
        int sn = (int) Math.sqrt(n);
        return n == (int) (Math.pow(sn, 2));
    }

    public static void main(String[] args) {
        System.out.println(Square.isSquare(5));
    }
}
