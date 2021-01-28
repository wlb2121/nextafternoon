package com.tts;
import java.util.*;
import java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        toPower(4, 2);

    }
    public static int[] toPower(int size, int power) {
         int[] numbersList = new int[size];
        Arrays.fill(numbersList, 0);
        for (int i = 0; i < size; i++) {
            numbersList[i] = (int) Math.pow(i, power);

        }
        System.out.println(Arrays.toString(numbersList)
        );
          return numbersList;
    }

};








