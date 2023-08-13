import java.util.Scanner;

public class myMain {

    static int numberOfList = 0; // number of object of type toDoList
    static toDoList toDoLists[];

    // adds a new list to the list of lists 'toDoLists'
    public static void addList(toDoList newElement) {
        toDoList newToDoList[] = new toDoList[numberOfList];
        for (int i = 0;  i < numberOfList - 1; i++) { // number of list -1
            newToDoList[i] = new toDoList(null);
            newToDoList[i].copyValue(toDoLists[i]);
        }
        newToDoList[numberOfList - 1] = new toDoList(null);
        newToDoList[numberOfList - 1].copyValue(newElement);
        toDoLists = newToDoList;
    }

    public static void displayAllList() {
        System.out.println("Here are your lists:");
        for (int i = 0; i <= numberOfList - 1; i++) {
            System.out.print((i + 1) + ". ");
            toDoLists[i].displayList();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the following command are avaliable: ");
        System.out.println("NEW LIST - create a new list");
        System.out.println("VIEW LIST - to view all your lists");
        System.out.println("EXIT - to exit the program");

        String userInput;
        //userInput = userInput.toUpperCase();
        
        while (true) {
            userInput = sc.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.equals("EXIT")){
                System.out.println("See you next time! :)");
                break;
            }
            else if (userInput.equals("NEW LIST")) { // creating a new toDoList
                System.out.println("Give it a title! - ");
                userInput = sc.nextLine();
                numberOfList++;
                toDoList newList = new toDoList(userInput);
                addList(newList);
                displayAllList();
                userInput = null;
                System.out.println("Enter a command");
            }
            else if (userInput.equals("VIEW LIST")) {
                displayAllList();
                System.out.println("Enter an index to view one");
                userInput = sc.nextLine();
                //while (userInput)
            }
            else if (userInput != null) {
                System.out.println("Please enter a valid command");
            }
        }
        sc.close();
    }
}