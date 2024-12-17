import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator(1.0, 2.0);
    }

    static void Calculator(double num1,double num2) {
        final DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your operation type (add subtract, multiply or divide):");
        String operation = scanner.nextLine();

        switch (operation) {
            case "add" -> {
                double finalVal = num1 + num2;
                System.out.println(finalVal);
            }
            case "subtract" -> {
                double finalVal = num1 - num2;
                System.out.println(finalVal);
            }
            case "multiply" -> {
                double finalVal = num1 * num2;
                System.out.println(finalVal);
            }
            case "divide" -> {
                double finalVal = num1 / num2;
                System.out.println(finalVal);
            }
            case null, default -> System.out.println("Invalid operation.");
        }
    }
}