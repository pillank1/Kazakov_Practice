package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PairwiseSummationOfNumbersOfMassiveTest {

    @Test
    public void testSummarizePairwise() {
        int[] massive1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] massive2 = new int[]{4, 3, 1, 5, 3, 4, 10, 1, 1};

        assertEquals(PairwiseSummationOfNumbersOfMassive.summarizePairwise(massive1), new int[]{3, 7, 11, 15});
        assertEquals(PairwiseSummationOfNumbersOfMassive.summarizePairwise(massive2), new int[]{7, 6, 7, 11, 1});
    }
}