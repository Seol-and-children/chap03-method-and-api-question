package com.ohgiraffers.level01.basic.chap3;
public class Application {
    public static void main(String[] args){
        Calculator check = new Calculator();

        check.checkMethod();
        System.out.println("1부터 10까지의 합:" + check.sum1to10());
        check.checkMaxNumber(10, 20);
        System.out.println("둘의 합은 :" + check.sumTwoNumber(10, 20) + "이다.");
        System.out.println("둘의 차는 :" + check.minusTwoNumber(10, 5) + "이다.");

    }
}
