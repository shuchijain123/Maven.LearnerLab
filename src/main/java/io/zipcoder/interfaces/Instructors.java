package io.zipcoder.interfaces;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Instructors extends People<Instructor>{
    long id;

    private String[] myarray = new String[]{"Leon", "Froilan", "Kris"};


    static final Instructors INSTANCE = new Instructors();


    private Instructors() {
       // People pr = new People();
        Person ps = new Person(id);

        for (int i = 0; i < myarray.length; i++) {

           // pr.add(ps);

             //long myid= pr.personlist.get(i).getId();
            ps.setName(myarray[i]);
            System.out.println("Name : " + ps.getName() + "id : "+ps.getId());


        }
    }

    public static Instructors getINSTANCE() {

        return INSTANCE;
    }

    public Instructor[] getArray() {

        return personlist.toArray(new Instructor[personlist.size()]);
    }

}





