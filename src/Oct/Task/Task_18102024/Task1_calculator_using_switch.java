package Oct.Task.Task_18102024;

import java.util.Scanner;

//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements
public class Task1_calculator_using_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value for num1");
        int num1 = scanner.nextInt();
        System.out.println("enter the value for num2");
        int num2 = scanner.nextInt();
        System.out.println("enter the oparetor");
        
        switch ( num1 +num2){
            case 1 :
                System.out.println("addition");

        }
    }

}
