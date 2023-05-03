package com.ohgiraffers.level02.normal.chap03;

public class Application {
    public static void main(String[] args) {
        RandomMaker fc = new RandomMaker();

        System.out.println(fc.randomNumber(-40, 40));
        System.out.println(fc.randomUpperAlpabet(20));
        System.out.println(fc.rockPaperScissors());
        System.out.println(fc.tossCoin());
    }
}
