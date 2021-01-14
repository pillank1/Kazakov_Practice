package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringWithMassiveOfStingsTest {
    @Test
    public void testNthSymbols() {
        String[] str = {"Road", "to", "the", "dream"};

        assertEquals(StringWithMassiveOfStings.nthSymbols(str, 1), new String[]{"o", "o", "h", "r"});

        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(StringWithMassiveOfStings.nthSymbols(str, 2),
                        new String[]{"a", "", "e", "e"}));

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(StringWithMassiveOfStings.nthSymbols(null, 0)));

        String[] str1 = {null, "null"};

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(StringWithMassiveOfStings.nthSymbols(str1, 0)));
    }
}
