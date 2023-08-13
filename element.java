public class element {
    boolean done = false;   // is the task done
    String title;

    public element(String taskTitle) { // constructor
        title = taskTitle;
    }

    public void displayElement() {
        System.out.println(title);
    }

    public void copyValue(element other) {
        done = other.done;
        title = other.title;
    }
}