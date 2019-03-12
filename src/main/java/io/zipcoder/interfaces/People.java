package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {

    ArrayList<E> personlist = new ArrayList<E>();



    public void add(E person)
    {
        personlist.add(person);
 }

    public E findById(long myid) {

        // Person  myperson = new Person (myid);
        E myperson=null;
        for (int i = 0; i < personlist.size(); i++) {

            if (personlist.get(i).getId() == myid) {
                System.out.println(personlist.get(i).getId());
                myperson = personlist.get(i);


            }
        }
        return myperson;

    }





    public void remove(Person person) {
        personlist.remove(person);
    }


    public void removeById(long myid) {

        personlist.remove(findById(myid));
    }



    public int getCount() {

       return personlist.size();
    }
    public abstract E[] getArray() ;

       // return (Person[]) personlist.toArray();

    public void removeAll(Person person) {

        personlist.removeAll(personlist);
    }
    public void clear() {
        personlist.clear();
    }








}
