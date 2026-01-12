package com.airtribe.studentmanagement;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println(" Student Management System (Airtribe) ");
        System.out.println("  Backend Engineering Course  ");
        System.out.println(" \n");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    System.out.println("\n✓ Student Management - Add/List/Search/Delete students");
                    break;
                case 2:
                    System.out.println("\n✓ Course Management - Add/List/Search courses");
                    break;
                case 3:
                    System.out.println("\n✓ Enrollment & Grades - Enroll/Grade/View enrollments");
                    break;
                case 4:
                    System.out.println("\n✓ AI Features - Auto-grade, Recommendations, Sentiment, Prediction");
                    break;
                case 5:
                    System.out.println("\n✓ Save/Load Data - Persist data to files");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }

        System.out.println("\n✓ Goodbye! All data saved.\n");
    }

    private static void printMenu() {
        System.out.println("\n");
        System.out.println("MAIN MENU ");
        System.out.println(" ");
        System.out.println(" 1. Student Management ");
        System.out.println(" 2. Course Management  ");
        System.out.println(" 3. Enrollment & Grades ");
        System.out.println(" 4. AI Features (Bonus) ");
        System.out.println(" 5. Save/Load Data      ");
        System.out.println(" 0. Exit                ");
        System.out.println(" ");
    }

    private static int readInt(String msg) {
        System.out.print(msg);
        while (!scanner.hasNextInt()) {
            System.out.print("Enter integer: ");
            scanner.next();
        }
        int val = scanner.nextInt();
        scanner.nextLine();
        return val;
    }
}
