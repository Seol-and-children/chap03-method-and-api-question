package com.ohgiraffers.level01.basic.chap3;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 실행됨.");
    }

    public int sum1to10(){
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result += i;
        }

        return result;
    }
    public void checkMaxNumber(int a, int b) {
        if( a > b ) {
            System.out.println( "더큰수는 :" + a + "이다.");
        }
        else System.out.println( "더큰수는 :" + b + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        int sum = 0;
        sum = a + b;

        return sum;
    }

    public int minusTwoNumber(int a, int b){
        int imsub = 0;
        if( a > b ){
            imsub = a - b;
        }
        else imsub = b - a;

        return imsub;
    }

}
