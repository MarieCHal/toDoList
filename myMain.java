import java.util.Scanner;

public class myMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the following command are avaliable: ");
        System.out.println("NEW LIST - create a new list");
        System.out.println("VIEW LIST - to view all your lists");
        System.out.println("EXIT - to exit the program");

        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        while (userInput.equals("EXIT") == false)
        {
            System.out.println("You entered 1: " + userInput);
            if (userInput.equals("NEW LIST")) {
                System.out.println("You entered 2: " + userInput);
                System.out.println("Give it a title! - ");
                userInput = sc.nextLine();
                toDoList newList = new toDoList(userInput);
                System.out.println("This is your new TODO list: ");
                newList.displayList();
            }
        }
        // toDoList list = new toDoList("what to do");
        // list.displayList();
    }
}