package C1_cod_soft;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class QuizQuestion {
    private String question;
    private String[] options;
    private int correctOption;

    public QuizQuestion(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

class Quiz {
    private QuizQuestion[] questions;
    private int userScore;
    private ScheduledExecutorService executorService;

    public Quiz(QuizQuestion[] questions) {
        this.questions = questions;
        this.userScore = 0;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            QuizQuestion currentQuestion = questions[i];

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());

            String[] options = currentQuestion.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((char) ('A' + j) + ". " + options[j]);
            }

            // Set up a timer for 20 seconds
            executorService.schedule(() -> {
                System.out.println("\nTime's up! Moving to the next question.\n");
            }, 20, TimeUnit.SECONDS);

            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Cancel the timer task
            executorService.shutdownNow();
            executorService = Executors.newSingleThreadScheduledExecutor();

            int userOption = userAnswer - 'A';

            if (userOption >= 0 && userOption < options.length) {
                if (userOption == currentQuestion.getCorrectOption()) {
                    System.out.println("Correct!\n");
                    userScore++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + (char) ('A' + currentQuestion.getCorrectOption()) + "\n");
                }
            } else {
                System.out.println("Invalid option. Skipping to the next question.\n");
            }
        }

        System.out.println("Quiz completed. Your final score: " + userScore + "/" + questions.length);
    }
}

public class C4_buffer {
    public static void main(String[] args) {
        // Example quiz questions
        QuizQuestion[] quizQuestions = {
                new QuizQuestion("What is the capital of France?", new String[]{"Paris", "Berlin", "Madrid", "Rome"}, 0),
                new QuizQuestion("Which planet is known as the Red Planet?", new String[]{"Mars", "Jupiter", "Venus", "Saturn"}, 0),
                new QuizQuestion("What is the largest mammal?", new String[]{"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"}, 1)
        };

        Quiz quiz = new Quiz(quizQuestions);
        quiz.startQuiz();
    }
}
