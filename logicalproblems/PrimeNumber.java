package com.bridgelabz.logicalproblems;
//Prime Numbers
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Prime number: ");
        int num = sc.nextInt();
        for(int i=2; i<=num/2; i++){
            if(num %i==0){
                System.out.println(num + " is not prime number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(num +" is prime number");
        }
    }
}