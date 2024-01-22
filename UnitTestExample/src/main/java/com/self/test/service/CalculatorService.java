package com.self.test.service;

public class CalculatorService {
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int productTwoNumbers(int a , int b){
        return a*b;
    }

    public static int divideTwoNumbers(int a , int b){
        return a/b;
    }

    public static int sumAnyNumbers(int ...number){
        int s = 0;
        for(int n:number) {
            s+=n;
        }
        return s;
    }
}
