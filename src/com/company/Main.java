package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int sum;
        int i = 0;
        System.out.print(a + " " + b + " ");
        while (i != 100) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
            i = i + 1;

        }
    }
}
