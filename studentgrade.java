import java.util.Scanner;

public class studentgrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        // Create an array to store the marks obtained in each subject.
        int[] marks = new int[numSubjects];

        // Get the marks obtained in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the marks obtained in subjet" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }

        // calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // calculate the average percentage
        double averagePercentage = (totalMarks / numSubjects);

        // Assign a grade based on the average percentage achieved
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "f";
        }

        // Display the results
        System.out.println("Total marks:" + totalMarks);
        System.out.println("Average percentage:" + averagePercentage);
        System.out.println("Grade:" + grade);
    }
}
