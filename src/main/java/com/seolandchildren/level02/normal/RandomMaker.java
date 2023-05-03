package com.seolandchildren.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlpabet(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = (char) ((int) (Math.random() * 26) + 65);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        String str = "";
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                str = "가위";
                break;
            case 1:
                str = "바위";
                break;
            case 2:
                str = "보";
                break;
        }
        return str;
    }

    public static String tossCoin() {
        int random = (int) (Math.random() * 2);
        if (random == 0) return "앞면";
        return "뒷면";
    }
}
