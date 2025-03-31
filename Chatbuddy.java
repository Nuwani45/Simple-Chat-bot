import java.util.Scanner;

public class Chatbuddy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbuddy: Hello, I'm your chatbot. Type 'exit' to end chat.");
        System.out.print("Chatbuddy: What's your name? ");
        String userName = scanner.nextLine();

        while (true) {
            System.out.print(userName + ": ");
            String userInput = scanner.nextLine().toLowerCase();  // Convert input to lowercase for better matching

            if (userInput.contains("hi")) {
                System.out.println("Chatbuddy: Hey " + userName + "! What's up?");
            } else if (userInput.contains("i'm fine")) {
                System.out.println("Chatbuddy: Glad to hear that! Need any help?");
            } else if (userInput.contains("yes")) {
                System.out.println("Chatbuddy: What is it?");
            } else if (userInput.contains("calculations")) {
                System.out.println("Chatbuddy: Select an option:");
                System.out.println("1 - Addition");
                System.out.println("2 - Subtraction");
                System.out.println("3 - Multiplication");
                System.out.println("4 - Division");

                int choice = scanner.nextInt();
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
				
                switch (choice) {
                    case 1 -> System.out.println("Result: " + (num1 + num2));
                    case 2 -> System.out.println("Result: " + (num1 - num2));
                    case 3 -> System.out.println("Result: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } else if (userInput.contains("bye")) {
                System.out.println("Chatbuddy: Goodbye! Have a nice day.");
            } else if (userInput.contains("exit")) {
                System.out.println("Chatbuddy: Chat ended. See you soon!");
                break;
            } else {
                System.out.println("Chatbuddy: Sorry, I didn't understand that.");
            }
        }
        scanner.close();
    }
}
