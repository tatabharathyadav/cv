package in.srkr.dsa1.oops2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assi28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.err.println("Divisor cannot be zero!");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please enter integers.");
        }
    }
}