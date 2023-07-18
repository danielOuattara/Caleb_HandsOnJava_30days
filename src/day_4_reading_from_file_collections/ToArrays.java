package day_4_reading_from_file_collections;

import java.util.Scanner;

// Reading from a file Collections
public class ToArrays {
    public static void main(String[] args) {

        /* Collections : Arrays
         * ===================== */

        int[] grades;  // OK
        int scores[];  // OK , C-language legacy

        System.out.print("Enter your array size : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        // int [] student_grades = new int[5];
        int[] student_grades = new int[size]; // dynamic array size

        for (int i = 0; i < size; i++) {
            System.out.print("enter a grade : ");
            student_grades[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < size; i++) {
            System.out.println(student_grades[i]);
        }
    }
}
