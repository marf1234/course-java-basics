package com.rakovets.course.javabasics.practice.conditionalstatements;

public class Test {
    public static void main(String[] args) {
        String charType = null;
        char symbol=  97;
        if (symbol>=97 && symbol<=122){
            charType = "Letter";
       } else charType = "something else";
        System.out.println(charType);
//        for (int i = 97; i <= 122; i++) {
//            System.out.println(symbol = (char) i);
//        }

    }

}
