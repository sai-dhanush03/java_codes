package C1_cod_soft;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class C4_quizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define your quiz questions, options, and correct answers
        String[] questions = {"Who is father of India?", "What is the national anthem of India?", "Who is the first prime minister of India?"};
        String[][] options = {{"1. Mahatma Gandhi", "2. JawaharlalNehru", "3. B.R. Ambedkar"},
                              {"1. Vande Mataram", "2. Sare Jaha Se Accha", "3. Jana Gana Mana"},
                              {"1. Rajendra Prasad", "2. Jawaharlal Nehru", "3. Indira Gandhi"}};
        int[] correctAnswers = {1, 3, 2};

        int score = 0;

        // Set the timer duration in seconds
        int timerDuration = 10;

        // Display and process each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Start the timer
            long startTime = System.currentTimeMillis();

            // Get user input
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            // Stop the timer
            long endTime = System.currentTimeMillis();
            long elapsedTime = TimeUnit.MILLISECONDS.toSeconds(endTime - startTime);

            // Check if the answer is correct and within the time limit
            if (elapsedTime <= timerDuration) {
                if (userAnswer == correctAnswers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            } else {
                System.out.println("Time limit exceeded! answer will not be considered Moving to the next question.");
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your final score is: " + score);
    }
}
