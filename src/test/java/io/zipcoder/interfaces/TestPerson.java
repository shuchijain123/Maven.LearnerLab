package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestPerson {


 @Test

    public void testConstructor() {

    Person person = new Person(234L);

      long expected = 234;

      long actual = person.getId();

Assert.assertEquals(expected, actual);







    }

}
