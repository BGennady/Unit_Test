package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class NumberFilterTest {


    @Test
    public void testEvenNumbers() {
        List<Integer> input = Arrays.asList(-25, -20, -17, -8, -5, -1, 0, 1, 2, 7, 10, 19, 26);
        List<Integer> expected = Arrays.asList(-20, -8, 0, 2, 10, 26);
        List<Integer> result = NumberFilter.numberFiltering(input);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> result = NumberFilter.numberFiltering(input);
        assertEquals(expected, result);
    }

    @Test
    public void testNoEvenNumbers() {
        List<Integer> input = Arrays.asList(-9, -7, -3, -1, 1, 7, 19, 29);
        List<Integer> expected = Arrays.asList();
        List<Integer> result = NumberFilter.numberFiltering(input);
        assertEquals(expected, result);

    }
}