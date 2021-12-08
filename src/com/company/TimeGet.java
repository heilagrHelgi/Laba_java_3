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
    private static int N = 10000;

    /**
     * Метод для оценки эффективности по времени добавления элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static void TestAdd(Collection<Integer> mass)
    {
        LocalTime start;
        LocalTime finish;
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            mass.add(i ^ 2);
        finish = LocalTime.now();
        System.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
    }

    /**
     * Метод для оценки эффективности по времени получения элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static void TestGet(List<Integer> mass)
    {
        LocalTime start;
        LocalTime finish;
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            mass.get(i);
        finish = LocalTime.now();
        System.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
    }

    /**
     * Метод для оценки эффективности по времени удаления элементов
     * @param mass нужен, чтобы передавать параметром ArrayList или LinkedList
     */
    public static void TestRemove(Collection<Integer> mass)
    {
        LocalTime start;
        LocalTime finish;
        start = LocalTime.now();
        for (int i = 0; i < N; i++)
            mass.remove(0);
        finish = LocalTime.now();
        System.out.println((finish.getSecond() - start.getSecond()) + "." + (finish.getNano() - start.getNano()));
    }

}
