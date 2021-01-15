package ru.ssau.tk.pillank1.Kazakov_Practice.strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task_3_4Test {

    @Test
    public void testPalindrome() {
        String str1 = "Kazakov";
        String str2 = "kazak";
        String str3 = "Kazak";

        assertFalse(Task_3_4.palindrome(str1));
        assertTrue(Task_3_4.palindrome(str2));
        assertFalse(Task_3_4.palindrome(str3)); //прописная или строчная буква - важно!
    }
}