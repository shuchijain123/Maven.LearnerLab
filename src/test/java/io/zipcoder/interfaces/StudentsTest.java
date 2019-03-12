package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getINSTANCE() {



        Students instance1 = Students.INSTANCE;
        Students instance2 = Students.INSTANCE;
        Assert.assertEquals(instance1.getINSTANCE(),instance2.getINSTANCE());




    }



}