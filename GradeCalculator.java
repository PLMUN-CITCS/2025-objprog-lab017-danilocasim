import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        int currentStudentScore = getStudentScore();
        System.out.printf("Your Grade is: %s\n", calculateGrade(currentStudentScore));
    }

    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int studentScore = scanner.nextInt();
        scanner.close();
        return studentScore;
    }

    public static String calculateGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}