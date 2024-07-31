package C1_cod_soft;


import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("--------------Student-Grade-Calculator--------------\n\n");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Input number of subjects: ");
        int num = scanner.nextInt();
        int[] marks = new int[num];
        
     
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // total marks and average percentage
        System.out.println("\n\n---------Score card---------\n  ");
        System.out.println("Total marks: " + num * 100);
        System.out.println("Total obtained marks: " + totalMarks);
        System.out.println("Average percentage: " + (double) totalMarks / num);
        
        // Grade assigning for each subject
        System.out.println("\n---------Subject-wise Grades---------\n");
        for (int i = 0; i < marks.length; i++) {
            int subjectMarks = marks[i];
            char subjectGrade = calculateGrade(subjectMarks);
            System.out.println("Grade obtained in subject number " + (i + 1) + " is: " + subjectGrade);
        }
        
    
        char overallGrade = calculateGrade(totalMarks / num);
        System.out.println("\nOverall Grade: " + overallGrade);

     
        scanner.close();
    }

    // Function to calculate grade based on marks
    private static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'S';
        } else if (marks >= 80) {
            return 'A';
        } else if (marks >= 70) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
