package ru.ssau.tk.pillank1.Kazakov_Practice.exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CloningTest {

    @Test
    public void test(){
        ClonedObject clonedObject = new ClonedObject();
        NotClonedObject notClonedObject = new NotClonedObject();

        try {
            clonedObject.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Assert.assertThrows(CloneNotSupportedException.class,()->{ notClonedObject.clone(); });
    }
}
