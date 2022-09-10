package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOFStudents = in.nextInt();
        Student[] students = new Student[numOFStudents];

        // Create n number of new students
        for (int n = 0; n < numOFStudents; n++){
            students [n] = new Student();
            students [n].enroll();
            students [n].payTuition();
        }

        for (int n = 0; n < numOFStudents; n++){
            System.out.println(students[n].toString());
        }
    }
}
