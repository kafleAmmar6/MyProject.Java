package CalculatorProject;
import java.util.*;

// ===============================
//   CLASS : History
//   → Stores calculation history
// ===============================
class History {

    // List that stores all history text
    private ArrayList<String> historyList = new ArrayList<>();

    // Add new history text
    public void add(String record) {
        historyList.add(record);
    }

    // Show saved history
    public void show() {
        if (historyList.isEmpty()) {
            System.out.println("No history available.");
            return;
        }

        System.out.println("\n===== Your History is Here =====");
        for (int i = 0; i < historyList.size(); i++) {
            System.out.println((i + 1) + ". " + historyList.get(i));
        }
    }
}

// ===============================
//   CLASS : Calculator
//   → Does all math functions
// ===============================
class Calculator {

    // Addition of all values
    public double addition(double[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    // Subtraction (first - others)
    public double subtraction(double[] nums) {
        double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result -= nums[i];
        }
        return result;
    }

    // Multiplication of all numbers
    public double multiplication(double[] nums) {
        double mul = 1;

        for (int i = 0; i < nums.length; i++) {
            mul = mul * nums[i];
        }

        return mul;
    }

    // Division (first / others)
    public double division(double[] nums) {

        double result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return Double.NaN;
            }

            result /= nums[i];
        }
        return result;
    }

    // Percentage (x% of y)
    public double percentage(double num, double per) {
        return (num * per) / 100.0;
    }

    // Average
    public double average(double[] nums) {
        return addition(nums) / nums.length;
    }

    // Mean (same as average)
    public double mean(double[] nums) {
        return average(nums);
    }

    // Median (middle value)
    public double median(double[] nums) {

        Arrays.sort(nums); // sort first

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }

    // Mode (most repeated number)
    public double mode(double[] nums) {

        HashMap<Double, Integer> freq = new HashMap<>();

        // Count each number
        for (double n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        double mode = nums[0];
        int highest = 0;

        for (double key : freq.keySet()) {

            if (freq.get(key) > highest) {
                highest = freq.get(key);
                mode = key;
            }
        }
        return mode;
    }

    // Leap Year Check
    public boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// ===============================================
//   MAIN CLASS : MyCalculator
//   → Shows menu, takes input, runs operations
// ===============================================
public class MyCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        History history = new History();

        while (true) {

            // ----- MENU -----
            System.out.println("\n===== Welcome to Ammar's Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Average");
            System.out.println("7. Mean");
            System.out.println("8. Median");
            System.out.println("9. Mode");
            System.out.println("10. Leap Year Check");
            System.out.println("11. Show History");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            // ---------------------
            // INVALID CHOICE FIX ✔
            // ---------------------
            if (choice < 0 || choice > 11) {
                System.out.println("❌ Invalid choice! Please choose between ( 0 to 11 )");
                continue; // go back to menu
            }

            double[] numbers = null;
            double result = 0;
            String record = "";

            // -----------------------------------
            // Ask numbers only for valid options
            // (except: percentage, leap year, history)
            // -----------------------------------
            if (choice >= 1 && choice <= 4 ||
                    choice >= 6 && choice <= 9) {

                System.out.print("Enter numbers separated by space: ");
                String[] input = sc.nextLine().trim().split("\\s+");

                numbers = new double[input.length];

                for (int i = 0; i < input.length; i++) {
                    numbers[i] = Double.parseDouble(input[i]);
                }
            }

            switch (choice) {

                case 1:
                    result = calc.addition(numbers);
                    record = "Addition = " + result;
                    break;

                case 2:
                    result = calc.subtraction(numbers);
                    record = "Subtraction = " + result;
                    break;

                case 3:
                    result = calc.multiplication(numbers);
                    record = "Multiplication = " + result;
                    break;

                case 4:
                    result = calc.division(numbers);
                    record = "Division = " + result;
                    break;

                case 5:
                    // Percentage requires two inputs
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();

                    System.out.print("Enter percentage: ");
                    double per = sc.nextDouble();

                    result = calc.percentage(num, per);
                    record = "Percentage = " + result;
                    break;

                case 6:
                    result = calc.average(numbers);
                    record = "Average = " + result;
                    break;

                case 7:
                    result = calc.mean(numbers);
                    record = "Mean = " + result;
                    break;

                case 8:
                    result = calc.median(numbers);
                    record = "Median = " + result;
                    break;

                case 9:
                    result = calc.mode(numbers);
                    record = "Mode = " + result;
                    break;

                case 10:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();

                    boolean isLeap = calc.leapYear(year);
                    record = year + " is " + (isLeap ? "" : "not ") + "a leap year";

                    System.out.println(record);
                    history.add(record);
                    continue;

                case 11:
                    history.show();
                    continue;

                case 0:
                    System.out.println("Exiting program...");
                    return;
            }

            // Print result after calculation
            System.out.println(record);

            // Save result in history
            history.add(record);
        }
    }
}

