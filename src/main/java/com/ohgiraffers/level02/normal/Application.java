package com.ohgiraffers.level02.normal;

public class Application {
    public static void main(String[] args) {
        RandomMaker RM = new RandomMaker();
        System.out.println(RM.randomNumber(2,10));
        System.out.println(RM.randomUpperAlphabet(10));
        System.out.println(RM.rockPaperScissors());
        System.out.println(RM.tossCoin());
    }
}