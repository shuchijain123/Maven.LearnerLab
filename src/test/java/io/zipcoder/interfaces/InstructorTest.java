package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {


    @Test
    public void instructorinheritanceTest() {
        Instructor it = new Instructor(234);

        Assert.assertTrue(it instanceof Person);
    }

    @Test
    public void instructorimplementationTest() {
        Instructor it = new Instructor(234);

        Assert.assertTrue(it instanceof Teacher);
    }



    @Test
    public void teachTest(){
        Student st = new Student(234);
       Instructor it = new Instructor(123);

       it.Teach(st,12);
       double expected =16;
       double actual = st.getTotalStudyTime();

       Assert.assertEquals(expected,actual,0);


    }

    @Test
    public void lecture() {
        Student st = new Student(234);
        Student st2 = new Student( 123);
        Student st3 = new Student( 456);

        Student[] sta = new Student[3];
        sta[0]=st;
        sta[1]=st2;
        sta[2]=st3;

        Instructor it = new Instructor(123);

        it.Teach(st,12);
        it.Teach(st2,14);
        it.Teach(st3,16);

        it.Lecture(sta,42);
        double expected =32;
        double actual = st2.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);


    }
}