package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(long id) {

        super(id);
    }

    public Instructor(long id, String name)
    {
        super(id);
        this.setName(name);
    }

    public void Teach(Learner learner, double numberOfHours) {

        learner.Learn(numberOfHours);

    }

    public void Lecture(Learner[] learners, double numberOfHours) {

        double  numberOfHoursPerLearner = numberOfHours / learners.length;
for (int i=0;i<learners.length;i++){

    learners[i].Learn(numberOfHoursPerLearner);
}



        }


    }

