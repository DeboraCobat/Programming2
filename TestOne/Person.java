/*
 * @autor Debora Correa Batista Bastos ID 6213122
 * 
 * @version December 5th 2022
 */

package TestOne;

public abstract class Person implements FamilyTreeInterface {

  private String personName;
  private String motherName;
  private String fatherName;

  public Person(String personName, String motherName, String fatherName) {
    this.personName = personName;
    this.motherName = motherName;
    this.fatherName = fatherName;

  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String toString() {
    return getPersonName() + "Person's name, " + getMotherName() + "mother's name, " + getFatherName()
        + "father's name, ";
  }
}
