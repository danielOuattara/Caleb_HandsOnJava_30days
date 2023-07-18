package day_4_reading_from_file_collections;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromFileToList {
    public static void main(String[] args) {

        // =======  Writing from file to a List

        //  create a List to store each student name
        List students_list = new ArrayList<String>();

        try {
            File file_1 = new File("src/students.txt");

            System.out.println("can read file ?: " + file_1.canRead());
            System.out.println("file exists ?: " + file_1.exists());
            System.out.println("file name ?: " + file_1.getName());
            System.out.println("can write to file ?: " + file_1.canWrite());
            System.out.println("file length: " + file_1.length());

            Scanner scanner_file = new Scanner(file_1);

            while (scanner_file.hasNextLine()) {
                students_list.add(scanner_file.nextLine());
            }
            scanner_file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
             e.printStackTrace();
        }
        System.out.println("---------------------------");

        for (int i = 0; i < students_list.size(); i++) {
            System.out.println(students_list.get(i));
        }

        System.out.println("---------------------------");

        for (Object item : students_list) {
            System.out.println(item);
        }

    }
}
