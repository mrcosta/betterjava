package com.learning.java.chapter.three;

public class ExerciseFive {

    public static void main(String args[]) {

        for (int n = 1; n <= 40; n++) {

            int fatorial = n;
            long total = n;
            while(fatorial != 1) {
                fatorial--;
                total*= fatorial;
            }

            System.out.println("Fatorial: " + total);
        }
    }
}
