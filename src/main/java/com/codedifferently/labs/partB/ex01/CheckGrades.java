package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.println("What was your grade in Math?");
        int math = input.nextInt();
        System.out.println("What was your grade in Science?");
        int science = input.nextInt();
        System.out.println("What was your grade in Geography?");
        int geography = input.nextInt();
        System.out.println("What was your grade in English?");
        int english = input.nextInt();
        System.out.println("What was your grade in Java?");
        int java = input.nextInt();

        double grade = math + science + geography + english + java;
        System.out.println("Total grade in five subjects: " + grade);
        double percentage = (grade / 5);
        response += percentage;

        System.out.print("My percentage: ");

        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}