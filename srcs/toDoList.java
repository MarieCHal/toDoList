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

    // displays the list's name and date
    public void displayList() {
        System.out.println("name: " + name + ", time at which it was created: " + date);
    }

    /** @summary displays the elements of the list */
    public void displayListWithElements() {
        for (int i = 0; i < numberOfElement; i++) {
            this.elements[i].displayElement();
        }
    }

    /** @summary deep copy of the list (with its elements) */
    public void copyValue(toDoList other) {
        this.name = other.name;
        this.date = other.date;
        this.numberOfElement = other.numberOfElement;
        element newElements[] = new element[numberOfElement];
        for (int i = 0;  i < numberOfElement; i++) { // number of list -1
            newElements[i] = new element(null);
            newElements[i].copyValue(elements[i]);
        }
    }

    /** @summary add a new element to the list */
    public void addElement(element newElement) {
        element newElements[] = new element[numberOfElement];
        for (int i = 0;  i < numberOfElement - 1; i++) { // number of list -1
            newElements[i] = new element(null);
            newElements[i].copyValue(elements[i]);
        }
        newElements[numberOfElement - 1] = new element(null);
        newElements[numberOfElement - 1].copyValue(newElement);
        elements = newElements;
    }
}