package com.bridgelabz.logicalproblems;
//Fibonacci Series
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 1, b = 0 ,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get fibonacci series: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; ++i){
            c = a + b;
            a = b;
            b = c;
            System.out.println( a );
        }
    }
}
