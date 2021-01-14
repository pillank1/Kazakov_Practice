package ru.ssau.tk.pillank1.Kazakov_Practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchingMostMeetingNumberTest {

    @Test
    public void testMostMeetingNumber() {
        double[] massive1 = new double[]{1, 2, 3, 2, 1, 2, 3};
        double[] massive2 = new double[]{1, 2, 3, 2, 1, 2, 3, 1};

        assertEquals(SearchingMostMeetingNumber.mostMeetingNumber(massive1), 2);
        assertEquals(SearchingMostMeetingNumber.mostMeetingNumber(massive2), 1);
    }
}