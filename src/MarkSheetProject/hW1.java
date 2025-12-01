package MarkSheetProject;

import java.util.Scanner;

public class hW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Input basic details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Full Marks: ");
        int fullMarks = sc.nextInt();

        System.out.print("Enter Pass Marks: ");
        int passMarks = sc.nextInt();

        // Input marks of subjects
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

        // Calculate results
        int obtainMarks = eco + acc + eng + nep + math + comp;
        int totalfullMarks = (75*5)+50;
        float percentage = (obtainMarks*100)/totalfullMarks;
        double gpa = obtainMarks/100;

        String result;
        if (eco >= passMarks && acc >= passMarks &&  eng >= passMarks && nep >= passMarks && math >= passMarks && comp >= passMarks ){
            result = "PASS";
        } else {
            result = "FAIL";
        }
        // Display marksheet
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
        System.out.println(" Total Obtain Marks: " + obtainMarks );
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("GPA : " + gpa);
        System.out.println("Result: " + result);
        System.out.println("********** Keep It Up! ********** ");
        sc.close();
    }
}
