package Oct.Task.Task_16102024;

import java.util.Scanner;

//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        System.out.println("Enter number 2 :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 > num2 ? num1 : num2);
        scanner.close();
    }

}
