package srcs;
import java.util.Scanner;
import java.util.InputMismatchException;

public class myMain {

    static int numberOfList = 0; // number of object of type toDoList
    static toDoList toDoList;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        //  instructions
        System.out.println("the following command are avaliable: ");
        System.out.println("ADD ELEMENT - to add a new element tou your list");
        System.out.println("TICK ELEMENT - to validate one of your task");
        System.out.println("EXIT - to exit the program");

        System.out.println("\u001B[1mTo start enter the title of your todo list - \u001B[0m");
        userInput = sc.nextLine();
        toDoList = new toDoList(userInput);

        
        while (true) {
            toDoList.displayListWithElements();
            userInput = sc.nextLine();
            userInput = userInput.toUpperCase();
            if (userInput.equals("EXIT")){
                System.out.println("\n\u001B[1mSee you next time! :)\u001B[0m");
                break;
            }
            else if (userInput.equals("ADD ELEMENT")){
                System.out.println("\n\u001B[1mEnter the title of the new element\u001B[0m");
                userInput = sc.nextLine();
                System.out.println("This is the user input: " + userInput);
                element newElement = new element(userInput);
                toDoList.addElement(newElement);
                }
            else if (userInput.equals("TICK ELEMENT")) {
                System.out.println("\n\u001B[1mChoose an element by entering an index\u001B[0m");
                while (true) {
                    try{
                        int userInputIndex = sc.nextInt();
                        sc.nextLine();
                        System.out.println("This is the index you typed: " + userInputIndex);
                        if (toDoList.tickElement(userInputIndex) == 0) {
                            break;
                        }
                        else {
                            //sc.nextLine();
                            System.out.println("\n\u001B[1mInvalid index! Please enter a valid integer.\u001B[0m");
                        }
                    }
                    catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("\n\u001B[1mInvalid input! Please enter a valid integer.\u001B[0m");
                    }
                }
            }
            else if (userInput != null) {
                System.out.println(userInput + "\n\u001B[1mIsn't a valid command! Please enter a valid command\u001B[0m");
            }
        }
        sc.close();
    }
}