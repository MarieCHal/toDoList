package srcs;
import java.util.Date;

/** first attempt of a class that displays the name and time at which 
the to do list was created */
public class toDoList {

    String name;    // name of list
    Date date;      // date
    element elements[];
    int numberOfElement;

    // constructor
    public toDoList(String newList) {
        name = newList;
        date = new Date();
    }

    /** @summary displays the elements of the list */
    public void displayListWithElements() {
        System.out.println("\u001B[33m------------------------------------------------------------------\u001B[0m\n");
        System.out.println("\u001B[33m              Name: " + name.toUpperCase() + "\u001B[0m\n");
        for (int i = 0; i < numberOfElement; i++) {
            System.out.print((i + 1) + ". ");
            this.elements[i].displayElement();
        }
        System.out.println("\n\u001B[33m   time at which it was created: " + date + "\u001B[0m\n");
        System.out.println("\u001B[33m-------------------------------------------------------------------\u001B[0m\n");
    }

    /** @summary deep copy of the list (with its elements) */
    public void copyValue(toDoList other) {
        this.name = other.name;
        this.date = other.date;
        this.numberOfElement = other.numberOfElement;
        element newElements[] = new element[numberOfElement];
        for (int i = 0;  i < numberOfElement; i++) { 
            newElements[i] = new element(null);
            newElements[i].copyValue(elements[i]);
        }
    }

    /** @summary add a new element to the list */
    public void addElement(element newElement) {
        numberOfElement++;
        element newElements[] = new element[numberOfElement];
        for (int i = 0;  i < numberOfElement - 1; i++) { // number of list -1
            newElements[i] = new element(null);
            newElements[i].copyValue(elements[i]);
        }
        newElements[numberOfElement - 1] = new element(null);
        newElements[numberOfElement - 1].copyValue(newElement);
        elements = newElements;
    }

    public int tickElement(int index) {
        if (index <= numberOfElement) {
            this.elements[index - 1].tickElement();
            return (0);
        }
        return 1;
    }
}