package io.zipcoder.interfaces;

public enum Educator implements Teacher {

     LEON (123),
     WILHEM (456),
     KRIS (321),
     FROILAN (890)



;
     Educator(long id) {
        instructor = new Instructor(id, this.name());
        Instructors.getINSTANCE().add(instructor);

    }


    public Instructor getInstructor() {
        return instructor;
    }

    public final Instructor instructor;
    long id;
    double timeWorked;


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
