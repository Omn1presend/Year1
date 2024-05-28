package LAB_1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        int output = firstNum + secondNum;

        System.out.println(output);
    }
}