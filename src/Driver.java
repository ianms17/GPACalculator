import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Welcome to the GPA Calculator");
        System.out.println("Let's Start with some basic information");

        // create new scanner object for standard input
        Scanner sc = new Scanner(System.in);

        // take in data about student to construct a prior info object
        System.out.println("What is your Current GPA? ");
        double currentGPA = sc.nextDouble();
        System.out.println("How many hours have you completed? ");
        int completedHours = sc.nextInt();
        PriorInfo prior = new PriorInfo(currentGPA, completedHours);

        // Ask user for current semester info
        System.out.println("How many classes are you currently taking");
        int numCourses = sc.nextInt();

        // create arrayList to store course information
        Course[] courses = new Course[numCourses];

        System.out.println("Now let's get some current information");

        // iterate through numCourses to take in course info
        for (int i = 0; i < numCourses; ++i) {

            // take in class grade
            System.out.println("Enter course grade as a letter ");
            char letter = sc.next().charAt(0);

            // take in course hours
            System.out.println("Enter the number of hours for this course ");
            int hours = sc.nextInt();

            // construct a new course and add it to the array
            Course addedCourse = new Course(hours, letter);
            courses[i] = addedCourse;

        }

        // construct new calculator to perform computations
        Calculator calc = new Calculator(courses, prior);
        System.out.println("Your GPA is: " + calc.CalculateGPA());
    }
}
