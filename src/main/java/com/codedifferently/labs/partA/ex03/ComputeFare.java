package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static String compute (int age){
        /* Put your code in between these comments : Top */
        String s = "";
        if (age < 11)
        {
            s = "fare=3$";
        } else if (age > 11 && age < 65) {
            s = "fare=5$";
        }
        else
        {
            s = "fare=3$";
        }

        /* Put your code in between these comments : Bottom */



        return s;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = input.nextInt();

        /* Put your code in between these comments : Bottom */

        String computeOutput = compute(age);
        System.out.println(computeOutput);


    }
}
