/*
 * @autor Debora Correa Batista Bastos ID 6213122
 * 
 * @version December 5th 2022
 */

package TestOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FamilyTreeMain extends Person {

  public FamilyTreeMain(String personName, String motherName, String fatherName) {
    super(personName, motherName, fatherName);
  }

  public static void main(String[] args) {

    List<Person> person = new ArrayList<Person>();

    person.add(new Person(personName, motherName, fatherName));

  }

}

// not enough time :( !