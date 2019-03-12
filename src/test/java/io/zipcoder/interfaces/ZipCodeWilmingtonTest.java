package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        //Given

        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();


        People people = Students.getINSTANCE();
        People ipeople = Instructors.getINSTANCE();
        people.clear();
        Student p1= new Student(123);
        Student p2 = new Student(789);
        //Student p3= new Student(456);
        Instructor p4 = new Instructor(900);
        Educator ed = Educator.FROILAN;


        people.add(p1);
        people.add(p2);
       // people.add(p3);

        ipeople.add(p4);

        //When
        zipCodeWilmington.hostLecture(p4, 10);
        ZipCodeWilmington.getINSTANCE().hostLecture(ed, 10);

        double expected = 14;
        double actual = p1.getTotalStudyTime();

        //Then

        Assert.assertEquals(expected, actual, 1);

    }

    @Test
    public void getINSTANCE() {
        ZipCodeWilmington instance1 = ZipCodeWilmington.INSTANCE;
        ZipCodeWilmington instance2 = ZipCodeWilmington.INSTANCE;
        Assert.assertEquals(instance1.getINSTANCE(),instance2.getINSTANCE());

    }
}