import java.util.Date;

/** first attempt of a class that displays the name and time at which 
the to do list was created */
public class toDoList {

    String name;    // name of list
    Date date;      // date

    // constructor
    public toDoList(String newList) {
        name = newList;
        date = new Date();
    }

    public void displayList() {
        System.out.println("name: " + name + ", time at which it was created: " + date);
    }

    public void copyValue(toDoList other) {
        this.name = other.name;
        this.date = other.date;
    }

}