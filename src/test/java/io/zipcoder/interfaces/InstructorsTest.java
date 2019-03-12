package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getINSTANCE() {
        //People pl = new People();


        Person p1 = new Person(123);
        Person p2 = new Person(789);
        Person p3= new Person(123);
        Person p4 = new Person(789);






        Instructors instance1 = Instructors.INSTANCE;
        Instructors instance2 = Instructors.INSTANCE;
       // instance1.add(p1);
       // instance2.add(p1);

        Assert.assertEquals(instance1.findById(123),instance2.findById(123));


    }


}