import java.util.Date;

/** first attempt of a class that displays the name and time at which 
the to do list was created */
public class toDoList {

    String name;    // name of list
    Date data;      // date

    // constructor
    public toDoList(String newList) {
        name = newList;
        data = new Date();
    }

    public void displayList() {
        System.out.println("name: " + name + " time at which it was created: " + data);
    }
}