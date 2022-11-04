import java.util.Scanner;

public class ListOfPerson {
    private Person[] persons;
    private int totalNumberOfPersons;

    //Creates an array of persons
    public ListOfPerson(int totalNumberOfPersons) {
        this.totalNumberOfPersons = totalNumberOfPersons;
        persons = new Person[totalNumberOfPersons];
    }

    //Display person
    public void displayAllPersons() {
        for(int index=0;index<totalNumberOfPersons;index++) {
            System.out.println(persons[index].getPersonID()+" "+persons[index].getPersonName()+" "+persons[index].getAge());
        }
    }

    //Input person
    public void inputPerson(Person person, int i) {
        persons[i]=person;
    }
}

