package day_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("daniel")) {
            System.out.println("Welcome " + name + "!");
        } else {
            System.out.println("Welcome to you !");
        }
        scanner.close();

        System.out.println("-------------------------");
        int counter = 0;
        while (counter < 10) {
            System.out.println("counter is :" + counter);
            counter++;
        }

        System.out.println("-------------------------");
        int counter_2 = 0;
        for (; counter_2 <= 10; counter_2++) {
            System.out.println("Counter is : " + counter_2);
        }

        System.out.println("-------------------------");
        int inc = 0;
        do {
            System.out.println("Hello world");
            inc++;
        } while (inc < 5);
    }
}