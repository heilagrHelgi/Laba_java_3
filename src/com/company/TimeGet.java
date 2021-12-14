package com.company;

import java.util.Collection;
import java.util.List;
import java.time.LocalTime; //библиотека джава со временем(имеет нано секунды)

/**
 * Класс для подсчета времени, затрачиваемое на тот или иной метод
 */
public class TimeGet {
    /**
     * N - вызов метода (кол-во раз)
     */
    private static int N = 100000;

    /**
     * Метод для оценки эффективности по времени добавления элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static long TestAdd(List<Integer> mass)
    {
        //LocalTime start;
        //LocalTime finish;
        //start = LocalTime.now();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            mass.add(i ^ 2);
        }
        long endTime = System.currentTimeMillis();
        //finish = LocalTime.now();



        //System.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
        return /*finish.getNano() - start.getNano();*/endTime - startTime;
    }

    /**
     * Метод для оценки эффективности по времени получения элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static long TestGet(List<Integer> mass)
    {
        //LocalTime start;
        //LocalTime finish;
        //start = LocalTime.now();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            mass.get(i);
        }
        long endTime = System.currentTimeMillis();
        //finish = LocalTime.now();
        //.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
        return endTime - startTime;
    }

    /**
     * Метод для оценки эффективности по времени удаления элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static long TestRemove(List<Integer> mass)
    {
        //LocalTime start;
        //LocalTime finish;
        //start = LocalTime.now();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            mass.remove(0);
        }
        long endTime = System.currentTimeMillis();
        //finish = LocalTime.now();
        //System.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
        return endTime - startTime;
    }

}
