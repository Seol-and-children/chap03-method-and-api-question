package com.ohgiraffers.level02.normal.chap03;

public class RandomMaker {

    public int randomNumber(int min, int max){
        int random1 = (int) (Math.random() * max + 1) + min;
        return random1;
    }

    public String randomUpperAlpabet(int length){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            int random2 = (int) (Math.random() * 26) + 65;

            char ch1 = (char) random2;
            sb.append(ch1);
        }
        return sb.toString();
    }

    public String rockPaperScissors(){
        String str = "";
        int random3 = (int) (Math.random() * 3);

        if( random3 == 0) {
            str = "Rock";
        }
        else if( random3 == 1) {
            str = "Scissors";
        }
        else str = "Paper";

        return str;
    }

    public String tossCoin(){
        int random4 = (int) (Math.random() * 2);
        String str1 = "앞면";
        if( random4 == 0){
            str1 = "뒷면";
        }
        return str1;
    }
}
