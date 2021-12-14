package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.time.LocalTime; //библиотека джава со временем(имеет нано секунды)
import java.util.Scanner;

/**
 * Здесь происходит сравнение эффективности по времени ArrayList и LinkedList
 */
public class Main {
    /**
     * N - вызов метода (кол-во раз)
     */
    private static int N = 100000;

    public static void main(String[] args) {

        ArrayList<Integer> Array = new ArrayList<Integer>();
        LinkedList<Integer> Linked = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);

        //LocalTime start;
        //LocalTime finish;

        System.out.println("N: " + N + "\n");
        //int operat = 0;
        int n = 0;
        while (n != 2) {
            System.out.println("    ");
            System.out.println("1. Начать выполнение программы:  ");
            System.out.println("2. Завершить выполнение программы:  ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            } else {
                System.out.println("Вы ввели не целочисленное значение операции!  ");
                scanner.next();
            }

            switch (n) {
                case 1:
                {

                    System.out.println("add: ");
                    System.out.println("ArrayList:  |" + TimeGet.TestAdd(Array) );
                    //TimeGet.TestAdd(Array);
                    System.out.println("LinkedList: |" + TimeGet.TestAdd(Linked));
                    //TimeGet.TestAdd(Linked);

                    System.out.println("get: ");
                    System.out.println("ArrayList:  |" + TimeGet.TestGet(Array));
                    //TimeGet.TestGet(Array);
                    System.out.println("LinkedList: |" + TimeGet.TestGet(Linked));
                    //TimeGet.TestGet(Linked);

                    System.out.println("remove: ");
                    System.out.println("ArrayList:  |" + TimeGet.TestRemove(Array));
                    //TimeGet.TestRemove(Array);
                    System.out.println("LinkedList: |" + TimeGet.TestRemove(Linked));
                    //TimeGet.TestRemove(Linked);
                }
                ;
                break;

                case 2: break;

                default:
                    System.out.println("Вы ввели неверный номер операции! ");
                    break;
            }
        }

    }
}