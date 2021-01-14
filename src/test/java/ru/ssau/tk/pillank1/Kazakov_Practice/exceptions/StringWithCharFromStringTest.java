package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringWithCharFromStringTest {

    @Test
    public void testGetCharFromString() {
        String[] arrayStr = new String[]{"Road", "to", "the", "dream"};

        assertEquals(StringWithCharFromString.getCharFromString(arrayStr,3,4), 'm');

        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> StringWithCharFromString.getCharFromString(arrayStr,5,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> StringWithCharFromString.getCharFromString(arrayStr,0, 5));
    }
}