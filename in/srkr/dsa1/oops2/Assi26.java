package in.srkr.dsa1.oops2;

import java.util.Scanner;

public class Assi26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        int sum = 0;
        int count = 0;

        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number: " + number);
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}