import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable to track correct answers
        int score = 0;

        // Variable to store user answer
        char answer;

        System.out.println("=== Welcome to the Java Quiz Game ===\n");

        // QUESTION 1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("A. 2 bytes");
        System.out.println("B. 4 bytes");
        System.out.println("C. 8 bytes");
        System.out.println("D. 16 bytes");
        answer = getValidInput(input);

        if (answer == 'B') {
            score++;
        }

        // QUESTION 2
        System.out.println("\n2. Which keyword is used to define a class?");
        System.out.println("A. define");
        System.out.println("B. struct");
        System.out.println("C. class");
        System.out.println("D. object");
        answer = getValidInput(input);

        switch (answer) {
            case 'C':
                score++;
                break;
        }

        // QUESTION 3
        System.out.println("\n3. Which data type stores true or false?");
        System.out.println("A. int");
        System.out.println("B. boolean");
        System.out.println("C. char");
        System.out.println("D. float");
        answer = getValidInput(input);

        if (answer == 'B') {
            score++;
        }

        // QUESTION 4
        System.out.println("\n4. What symbol is used for single-line comments?");
        System.out.println("A. /* */");
        System.out.println("B. //");
        System.out.println("C. #");
        System.out.println("D. <!-- -->");
        answer = getValidInput(input);

        switch (answer) {
            case 'B':
                score++;
                break;
        }

        // QUESTION 5
        System.out.println("\n5. Which operator is used for addition?");
        System.out.println("A. -");
        System.out.println("B. *");
        System.out.println("C. /");
        System.out.println("D. +");
        answer = getValidInput(input);

        if (answer == 'D') {
            score++;
        }

        // Calculate percentage
        double percentage = (score / 5.0) * 100;

        // Display final result
        System.out.println("\n=== Quiz Completed ===");
        System.out.println("Correct Answers: " + score + "/5");
        System.out.println("Final Score: " + percentage + "%");

        input.close();
    }

    // Method for input validation
    public static char getValidInput(Scanner input) {
        char answer;

        while (true) {
            System.out.print("Enter your answer (A, B, C, or D): ");
            answer = input.next().toUpperCase().charAt(0);

            if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D') {
                return answer;
            } else {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        }
    }
}