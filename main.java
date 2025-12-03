import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stack Stack = new stack();
        int choice = 0;

        while (true) {

            System.out.println("\n===== STACK MENU =====");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Size");
            System.out.println("5 - Display Stack");
            System.out.println("6 - Exit");
            System.out.print("Enter choice: ");

            if (in.hasNextInt()) {
                choice = in.nextInt();
                in.nextLine();
            } else {
                System.out.println("Invalid input! Enter a number 1-6.");
                in.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    String val = in.nextLine();
                    Stack.push(val);
                    break;

                case 2:
                    String popped = Stack.pop();
                    if (popped != null)
                        System.out.println(""+ popped);
                    else
                        System.out.println("Stack is empty!");
                    break;

                case 3:
                    String top = Stack.peek();
                    if (top != null)
                        System.out.println(""+ top);
                    else
                        System.out.println("Stack is empty!");
                    break;

                case 4:
                    System.out.println("" + Stack.size());
                    break;

                case 5:
                    System.out.println(Stack);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 1-6.");
            }
        }


    }
}
