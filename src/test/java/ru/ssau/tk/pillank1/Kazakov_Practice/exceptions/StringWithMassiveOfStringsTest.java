package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringWithMassiveOfStringsTest {
    @Test
    public void testNthSymbols() {
        String[] str = {"Road", "to", "the", "dream"};

        assertEquals(StringWithMassiveOfStrings.nthSymbols(str, 1), new String[]{"o", "o", "h", "r"});

        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> assertEquals(StringWithMassiveOfStrings.nthSymbols(str, 2),
                        new String[]{"a", "", "e", "e"}));

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(StringWithMassiveOfStrings.nthSymbols(null, 0)));

        String[] str1 = {null, "null"};

        Assert.assertThrows(NullPointerException.class,
                () -> assertNull(StringWithMassiveOfStrings.nthSymbols(str1, 0)));
    }
}
