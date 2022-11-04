import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ListOfPerson listOfPerson;

        System.out.println("Please enter how many people you have");
        int total= inp.nextInt();
        listOfPerson= new ListOfPerson(total);

        for(int i =0;i<total;i++){
            Person person = new Person();
            System.out.println("Please enter an ID");
            person.setPersonID(inp.nextInt());
            System.out.println("Please enter an age");
            person.setAge(inp.nextInt());
            System.out.println("Please enter a name");
            person.setPersonName(inp.next());

            listOfPerson.inputPerson(person, i);
        }
        listOfPerson.displayAllPersons();
    }
}
