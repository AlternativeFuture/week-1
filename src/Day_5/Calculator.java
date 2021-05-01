package Day_5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number.  ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter second number. ");
        double secondNum = scanner.nextDouble();
        System.out.print("Enter an operator.   ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.print(firstNum + " " + operator + " " + secondNum + " = ");
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.print(firstNum + " " + operator + " " + secondNum + " = ");
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.print(firstNum + " " + operator + " " + secondNum + " = ");
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.print(firstNum + " " + operator + " " + secondNum + " = ");
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("Incorrect operator!!!");
        }
    }
}
