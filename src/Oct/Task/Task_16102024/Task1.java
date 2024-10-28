package Oct.Task.Task_16102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name :");
        System.out.println("Enter the age :");
        System.out.println("Enter the salary:");
        String name = scanner.next();
        int age = scanner.nextInt();
        float salary = scanner.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        scanner.close();
    }
}
