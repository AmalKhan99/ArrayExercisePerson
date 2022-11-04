public class Person {
   //Variable
    int personID, age;
    String personName;
    //Constructor
    public Person(int personID, int age, String personName) {
        this.personID = personID;
        this.age = age;
        this.personName = personName;
    }

    public Person(){

    }
    //GettersAndSetters
    public int getPersonID() {
        return personID;
    }
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
