package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void StudentinheritanceTest() {
        Student st = new Student(234);

        Assert.assertTrue(st instanceof Person);
    }




    @Test
    public void StudentimplementationTest() {
        Student st = new Student(234);




        Assert.assertTrue(st instanceof Learner);
    }



    @Test
    public void learnTest() {
        Student st = new Student(234);



        double expected = 9;

        st.Learn(5);

        double actual= st.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0);







    }

    @Test
    public void getTotalStudyTime() {
    }
}