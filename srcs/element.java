package srcs;
public class element {
    boolean done = false;   // is the task done
    String title;

    public element(String taskTitle) { // constructor
        title = taskTitle;
    }

    public void displayElement() {
        char squared;   // is done or not, ticked for true 
        if (done == true) {
            squared = '\u221A'; // unicode for square ticked 
        }
        else
        squared = '\u25A1'; // unicode for square unticked
        
        System.out.print(title);
        System.out.println(" " + squared);
    }

    public void copyValue(element other) {
        done = other.done;
        title = other.title;
    }

    public void tickElement() {
        done = true;
    }

    public void unTickElement() {
        done = false;
    }
}