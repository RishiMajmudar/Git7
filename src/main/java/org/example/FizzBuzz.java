package org.example;


public class FizzBuzz {
    public static String play(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

