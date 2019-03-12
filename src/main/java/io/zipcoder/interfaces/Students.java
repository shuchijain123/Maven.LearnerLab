package io.zipcoder.interfaces;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Students extends People<Student> {
    long id;

 private   String [] myarray= new String[]{ "Shuchi","Laxmi","Nirmala"};





    static final Students INSTANCE= new Students();

   private  Students(){
       //People pr = new People();
      Person ps= new Person(id);
       for (int i=0;i<myarray.length;i++){
          // pr.add(ps);

       // long myid= ps.getId();
        ps.setName(myarray[i]);




        System.out.println("Name : "+ps.getName()+" " + "id : "+ ps.getId());


       }

   }

    public static  Students getINSTANCE() {
        return INSTANCE;
    }


    public Student[] getArray() {
        return  personlist.toArray(new Student[personlist.size()]);
    }
}
