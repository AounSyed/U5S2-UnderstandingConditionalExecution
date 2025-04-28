package com.codedifferently.labs.partA.ex01;

public class WatchMovie {
    public static String watchMovie() {
        String response ="";
        /* Your code goes here*/
        int price = 12;
        int rating = 5;
        if (price >= 12 && rating == 5)
        {
            response += "I’m interested in watching the movie";
        }
        else {
            response += ("I am not interested in watching the movie");
        }
        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}
