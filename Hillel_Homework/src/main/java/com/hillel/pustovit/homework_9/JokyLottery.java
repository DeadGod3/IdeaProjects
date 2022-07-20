package com.hillel.pustovit.homework_9;

import java.util.Arrays;
import java.util.Scanner;

public class JokyLottery {
    public static void main(String[] args) {

        int first[] = new int[7];
        for (int i = 0; i < first.length; i++) {

            first[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(first);


        int second[] = new int[7];
        for (int i = 0; i < second.length; i++) {
            second[i] = (int) (Math.random() * 10);

        }
        Arrays.sort(second);
        System.out.print(Arrays.toString(first));
        System.out.println();
        System.out.print(Arrays.toString(second));


        int count = 0;
        for (int i = 0; i < second.length; i++) {
            if (first[i] == second[i]) count++;
        }
        System.out.println();
        System.out.println("Количество совпадений с лотерейной компанией = " + count);
    }


}

