import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator();
    }

    static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        double num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number:");
        double num2 = Integer.parseInt(scanner.nextLine());

        final DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Choose your operation type (add subtract, multiply or divide):");
        String operation = scanner.nextLine();

        switch (operation) {
            case "add" -> {
                System.out.println("First value: ");
                double finalVal = Double.parseDouble(String.valueOf(num1 + num2));
                System.out.println(finalVal);
            }
            case "subtract" -> {
                double finalVal = Double.parseDouble(String.valueOf(num1 - num2));
                System.out.println(finalVal);
            }
            case "multiply" -> {
                double finalVal = Double.parseDouble(String.valueOf(num1 * num2));
                System.out.println(finalVal);
            }
            case "divide" -> {
                double finalVal = Double.parseDouble(String.valueOf(num1 / num2));
                System.out.println(finalVal);
            }
            case null, default -> System.out.println("Invalid operation.");
        }
    }
}