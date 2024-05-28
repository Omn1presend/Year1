package LAB_1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secodNum = scanner.nextInt();

        int sumOfNums = firstNum + secodNum;
        int diffOfNum = firstNum - secodNum;

        System.out.println("Output: " + sumOfNums +
                ", " + diffOfNum
        );
    }
}