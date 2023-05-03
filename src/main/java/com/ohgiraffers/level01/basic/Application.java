package com.ohgiraffers.level01.basic;
public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethod();
        System.out.println(cal.sum1to10());
        cal.checkmaxNumber(10, 20);
        System.out.println(cal.sumTwoNumber(10, 20));
        System.out.println(cal.minusTwoNumber(10, 5));
    }
}
