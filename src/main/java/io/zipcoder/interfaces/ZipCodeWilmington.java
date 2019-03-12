package io.zipcoder.interfaces;

public class ZipCodeWilmington    {

    public static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.INSTANCE;
    private Instructors instructors = Instructors.INSTANCE;

    Person person;
    long id;





        private ZipCodeWilmington(){ }

    Instructor teacher = (Instructor) instructors.findById(id);



        public  void hostLecture(Teacher teacher, double numberOfHours) {



            teacher.Lecture( students.getArray(), numberOfHours);
        }



        public  static ZipCodeWilmington getINSTANCE() {

            return INSTANCE;

        }
    }












