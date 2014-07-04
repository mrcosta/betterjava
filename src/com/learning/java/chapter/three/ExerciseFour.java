package com.learning.java.chapter.three;

public class ExerciseFour {

    public static void main(String args[]) {

        for (int n = 1; n <= 10; n++) {

            int atual = n;
            while(atual != 1) {
                atual--;
                System.out.println(n * atual);
            }
        }
    }
}
