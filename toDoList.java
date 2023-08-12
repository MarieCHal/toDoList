import java.util.Date;

/** first attempt of a class that displays the name and time at which 
the to do list was created */
public class toDoList {

    String name;    // name of list
    Date data;      // date

    // constructor
    public toDoList(String newList) {
        name = newList;
    }

    public void displayList() {
        System.out.println("name; " + name + " " + data);
    }

    public static void main(String[] args) {
        toDoList list = new toDoList("what to do");
        list.displayList();
    }
}