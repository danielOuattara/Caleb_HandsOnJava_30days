package day_4_reading_from_file_collections;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Reading from a file Collections
public class Main {
    public static void main(String[] args) {


        /* Collections
         * ================= */

        // --> 1 Arrays

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

        // ===================================  Writing from file

        List<String> students_list = new ArrayList<String>();
        try {
            File file_1 = new File("src/students.txt");

            System.out.println("can read file ?: " + file_1.canRead());
            System.out.println("file exists ?: " + file_1.exists());
            System.out.println("file name ?: " + file_1.getName());
            System.out.println("can write to file ?: " + file_1.canWrite());
            System.out.println("file length: " + file_1.length());

            Scanner scanner_file = new Scanner(file_1);

            //  create a List to store each student name


            while (scanner_file.hasNextLine()) {
                System.out.println(scanner_file.nextLine());
                // students_list.add(scanner_file.nextLine());
            }
            scanner_file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e);
            // e.printStackTrace();
        }

        for (int i = 0 ; i < students_list.size(); i++) {
            System.out.println(students_list.get(i));
        }

//        for (String item : students_list) {
//            System.out.println(item);
//        }


    }
}
