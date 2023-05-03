package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        int a = (int)(Math.random()*(max-min+1) + (min));
        return a;
    }
    public static String randomUpperAlphabet(int length){
        String str = "";
        for(int i=0; i<length;i++){
            char A = (char)(Math.random()*(90-65+1) + 65);
            str += (char)A;
        }
        return str;
    }
    public static String rockPaperScissors(){
        int a = (int)(Math.random()*3);
        if (a == 0) return "가위";
        else if(a ==1) return "바위";
        else return "보";
    }
    public static String tossCoin(){
        String Coin = ((int)(Math.random()*2) == 0)? "앞면":"뒷면";
        return Coin;
    }
}