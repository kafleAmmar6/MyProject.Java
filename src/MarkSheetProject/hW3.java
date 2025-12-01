package MarkSheetProject;

import java.util.Scanner;
public class hW3 {

    // Function to calculate percentage
    public static float calculatePercentage(int obtained, int totalFullMarks) {
        return (obtained * 100f) / totalFullMarks;
    }

    // Function to calculate GPA
    public static double calculateGPA(int obtained) {
        return obtained / 100.0;
    }

    // Function to print the marksheet
    public static void printMarksheet(String name, int roll, int fullMarks, int passMarks,
                                      int eco, int acc, int eng, int nep, int math, int comp,
                                      int obtainedMarks, float percentage, double gpa, String result) {

        System.out.println("\n----- MARKSHEET -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Full Marks : " + fullMarks);
        System.out.println("Pass Marks : " + passMarks);
        System.out.println("---------------------");
        System.out.println(" ****THIS IS YOUR MARKS****");
        System.out.println("Economics: " + eco);
        System.out.println("Account: " + acc);
        System.out.println("English: " + eng);
        System.out.println("Nepali: " + nep);
        System.out.println("Maths: " + math);
        System.out.println("Computer: " + comp);
        System.out.println("---------------------");
        System.out.println("Total Obtain Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("GPA : " + gpa);
        System.out.println("Result: " + result);
        System.out.println("********** Keep It Up! ********** ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Basic details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Full Marks: ");
        int fullMarks = sc.nextInt();

        System.out.print("Enter Pass Marks: ");
        int passMarks = sc.nextInt();

        // Subject marks
        System.out.print("Enter marks in Economics: ");
        int eco = sc.nextInt();

        System.out.print("Enter marks in Account: ");
        int acc = sc.nextInt();

        System.out.print("Enter marks in English: ");
        int eng = sc.nextInt();

        System.out.print("Enter marks in Nepali: ");
        int nep = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int comp = sc.nextInt();

        // Calculations
        int obtainedMarks = eco + acc + eng + nep + math + comp;
        int totalFullMarks = (75 * 5) + 50;

        float percentage = calculatePercentage(obtainedMarks, totalFullMarks);
        double gpa = calculateGPA(obtainedMarks);

        // RESULT PASS/FAIL
        String result;
        if (eco >= passMarks && acc >= passMarks && eng >= passMarks &&
                nep >= passMarks && math >= passMarks && comp >= passMarks) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // LOOP CHOICE
        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1 = Show Percentage");
            System.out.println("2 = Show GPA");
            System.out.println("3 = Show Marksheet");
            System.out.println("4 = Exit Program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Percentage = " + percentage + "%");
                    break;

                case 2:
                    System.out.println("GPA = " + gpa);
                    break;

                case 3:
                    printMarksheet(name, roll, fullMarks, passMarks,
                            eco, acc, eng, nep, math, comp,
                            obtainedMarks, percentage, gpa, result);
                    break;

                case 4:
                    System.out.println("Program Closed. Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
        sc.close();
    }
}



