package com.hillel.pustovit.homework_7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        System.out.println("������� ���� ������� � ��������� ������� �� 18 - 40 ������ ������� : ");

        int min = 18;
        int max = 40;
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[25];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        System.out.println();
        System.out.println("������� ���� ������� � ��������� ������� �� 18 - 40 ������ ������� : ");
        System.out.println(Arrays.toString(array2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < array.length; i++) {
            average1 += array[i];
            average2 += array2[i];
        }
        average1 /= array.length;
        average2 /= array2.length;

        System.out.println();
        System.out.println("������� �������������� 1 ������� = " + average1);
        System.out.println("������� �������������� 2 ������� = " + average2);


//        any changes
//                   here i type
    }
}


