package MarkSheetProject;

public class MarksheetPrinter {

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
}