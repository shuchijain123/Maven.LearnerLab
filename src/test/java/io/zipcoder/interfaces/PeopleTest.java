package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {
    ArrayList<Person> personlist = new ArrayList<Person>();
    @Test
    public void addTest() {

      //  People pl = new People();
       Person p1= new Person(123);
        Person p2 = new Person(789);
        Person p3= new Person(123);
        Person p4 = new Person(789);

       personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);
        personlist.add(p4);

      int expected =4;
      int  actual = personlist.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findByIdTest() {
        People people = Students.getINSTANCE();

        //  People pl = new People();
        Person p1= new Person(123);
        Person p2 = new Person(789);
        Person p3= new Person(123);
        Person p4 = new Person(789);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Person expected =p2;
        Person actual = people.findById(123);
        expected.equals(actual);

    }

    @Test
    public void remove() {



        People people = Students.getINSTANCE();
        people.clear();
        Person p1= new Person(123);
        Person p2 = new Person(789);
        Person p3= new Person(123);
        Person p4 = new Person(789);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);


        int expectedbefore =4;
       int  actualbefore = people.getCount();
        Assert.assertEquals(expectedbefore, actualbefore);
        people.remove(p1);
        int expectedafter =3;
        int  actualafter=people.getCount();


        Assert.assertEquals(expectedafter,actualafter);



    }

    @Test
    public void removeById() {
        People people = Students.getINSTANCE();
        people.clear();
        Person p1= new Person(123);
        Person p2 = new Person(789);
        Person p3= new Person(123);
        Person p4 = new Person(789);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);


        int expectedbefore =4;
        int  actualbefore = people.getCount();
        Assert.assertEquals(expectedbefore, actualbefore);
        people.removeById(123);
        int expectedafter =3;
        int  actualafter=people.getCount();


        Assert.assertEquals(expectedafter,actualafter);







    }


@Override
    public boolean equals(Object o){
        if(getClass() == o.getClass()){
            return true;
        }
        else{
            return false;}
    }


    }