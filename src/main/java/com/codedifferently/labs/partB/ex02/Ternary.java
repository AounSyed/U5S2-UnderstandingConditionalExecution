package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
        int x = 20, y = 0;
        y = (y / x < 3) ? (int) (x * 4.5) : x;
        response += "Value of y is: " + y;

        y = (x == 20) ? (x + 41) : x;
        response += "\nValue of y is: " + y;


        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
