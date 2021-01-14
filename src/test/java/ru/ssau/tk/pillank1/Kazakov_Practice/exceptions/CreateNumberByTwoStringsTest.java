package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateNumberByTwoStringsTest {

    @Test
    public void testGetIntOfString() {
        assertEquals(CreateNumberByTwoStrings.getIntByTwoStrings("10","5"), 2);

        Assert.assertThrows(ArithmeticException.class,
                () ->   CreateNumberByTwoStrings.getIntByTwoStrings("18","0"));

        Assert.assertThrows(NumberFormatException.class,
                () ->    CreateNumberByTwoStrings.getIntByTwoStrings("w","3"));

        Assert.assertThrows(NumberFormatException.class,
                () ->    CreateNumberByTwoStrings.getIntByTwoStrings("a","z"));
    }
}