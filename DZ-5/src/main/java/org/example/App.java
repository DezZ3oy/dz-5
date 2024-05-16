package org.example;

public class App {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;
        int num3 = 2;
        int num4 = 5;
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        int sum1 = num1 + num2;
        int sum2 = num3 + num4;
        System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2);
        if (sum1 > sum2){
            System.out.println("true");
        }
        sum1 += 1;
        sum2 -= 2;
        System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2);
        if (sum1 > sum2){
            System.out.println("true");
        }
        if (sum1 % 2 == 0) {
            System.out.println("true");
        } else if (sum2 % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
