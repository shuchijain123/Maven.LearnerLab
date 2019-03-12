package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void getInstructor() {


    }

    @Test
    public void teach() {
       Educator ed1= Educator.LEON;



        Student st = new Student(234);


        ed1.Teach(st,12);
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

        Educator ed1= Educator.LEON;
        Educator ed2= Educator.FROILAN;
        Educator ed3 = Educator.WILHEM;

        ed1.Teach(st,12);
        ed2.Teach(st2,14);
        ed3.Teach(st3,16);

        ed1.Lecture(sta,12);
        double expected =20;
        double actual = st.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);
    }
}