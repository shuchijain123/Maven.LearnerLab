package io.zipcoder.interfaces;

public class Student extends Person implements Learner {



    private double totalStudyTime=4;


    public Student(long id) {
        super(id);
    }


    public void Learn(double numberOfHours)
    {

        totalStudyTime= totalStudyTime+numberOfHours;
    }


    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    //public  Student[] getArray() {

        //return (Person[]) personlist.toArray();
   // }
}
