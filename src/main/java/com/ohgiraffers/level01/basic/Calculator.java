package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("함수 호출 완료");
    }

    public int sum1to10(){
        int a = 5*(1+10);
        return a;
    }

    public void checkmaxNumber(int a, int b){
        System.out.println(Math.max(a,b));
    }

    public int sumTwoNumber(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int minusTwoNumber(int a, int b){
        int sub = a-b;
        return sub;
    }
}
