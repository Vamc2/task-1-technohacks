import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    toDoList.add(itemToAdd);
                    System.out.println("Item added to the list.");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the number of the item to remove: ");
                        int itemToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (itemToRemove >= 1 && itemToRemove <= toDoList.size()) {
                            toDoList.remove(itemToRemove - 1);
                            System.out.println("Item removed from the list.");
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
