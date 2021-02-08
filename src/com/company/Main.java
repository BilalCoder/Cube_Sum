package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the last number");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Invalid Input");
            return;
        }
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(i%2==0)
                sum += (i*i*i);
        }
        System.out.println(sum);
    }
}
