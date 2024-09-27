package ru.netology;


import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static List<Integer> numberFiltering(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}