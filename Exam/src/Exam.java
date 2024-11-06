import java.util.Scanner;

public class Exam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      //prompt the tutor to enter marks for each coursework
      System.out.println("Enter Marks for Assignment 1; ");
      int assignment1 = scanner.nextInt();

      System.out.println("Enter marks for Assignment 2: ");
      int assignment2 = scanner.nextInt();

      System.out.println("Enter marks for CAT 1: ");
      int cat1 = scanner.nextInt();

      System.out.println("Enter Marks for CAT 2: ");
      int cat2 = scanner.nextInt();


     int courseworkAverage = (assignment1 + assignment2 + cat1 + cat2) / 4;

     //determine the grade based on the coursework average
        String grade;
        if (courseworkAverage >= 40 && courseworkAverage <= 50) {
            grade = "A";
        } else if (courseworkAverage >= 30 && courseworkAverage <= 39) {
            grade = "B";
        } else if (courseworkAverage >= 20 && courseworkAverage <= 29){
            grade = "C";
        } else if (courseworkAverage >= 10 && courseworkAverage <= 19){
            grade = "D";
        } else {
            grade = "Fail";
        }

        //print the results
        System.out.println("Coursework: " + courseworkAverage);
        System.out.println("Grade: "+ grade );

        scanner.close();




    }

}
