import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TodoListImpl todoList = new TodoListImpl() {};
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nTodo List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Mark Item as Completed");
            System.out.println("4. View All Items");
            System.out.println("5. View Completed Items");
            System.out.println("6. View Pending Items");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item description: ");
                    String description = input.nextLine();
                    todoList.addItem(description);
                    break;
                case 2:
                    System.out.print("Enter item ID to remove: ");
                    int itemId = input.nextInt();
                    todoList.removeItem(itemId);
                    System.out.print("Item removed");
                    break;
                case 3:
                    System.out.print("Enter item ID to mark as completed: ");
                    int completedId = input.nextInt();
                    todoList.markItemAsCompleted(completedId);
                    break;
                case 4:
                    System.out.println("All items: ");
                    for (TodoItem items : todoList.getAllItems()) {
                        System.out.println(items);
                    }
                    break;
                case 5:
                    System.out.println("Completed items: ");
                    for (TodoItem completedItems : todoList.getCompletedItems()) {
                        System.out.println(completedItems);
                    }
                    break;
                case 6:
                    System.out.println("Pending items: ");
                    for (TodoItem pendingItems : todoList.getPendingItems()) {
                        System.out.println(pendingItems);
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}