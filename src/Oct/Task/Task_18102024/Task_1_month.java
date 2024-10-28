package Oct.Task.Task_18102024;
//Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.

import java.util.Scanner;

public class Task_1_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" Enter the Month");
        int Month = scanner.nextInt();

        switch (Month){
            default:
                System.out.println("INVALID");
                break;
            case 1 :
                System.out.println("JAN");
                break;
            case 2 :
                System.out.println("FEB");
                break;
            case 3 :
                System.out.println("MARCH");
                break;
            case 4 :
                System.out.println("APRIL");
                break;
            case 5 :
                System.out.println("MAY");
                break;
            case 6 :
                System.out.println("JUNE");
                break;
            case 7 :
                System.out.println("JULY");
                break;
            case 8 :
                System.out.println("AUG");
                break;
            case 9 :
                System.out.println("SEPT");
                break;
            case 10 :
                System.out.println("OCT");
                break;
            case 11 :
                System.out.println("NOV");
                break;
            case 12 :
                System.out.println("DEC");
                break;
        }
    }
}
