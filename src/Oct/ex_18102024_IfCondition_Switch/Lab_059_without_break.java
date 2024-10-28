package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab_059_without_break {
    public static void main(String[] args) {
        // Switch Condition
        // ask User - enter int number from 1 to 7
        // which day ?
        // 1 > monday , 8,9 ... > Invalid

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day (1-7):");
        int day = sc.nextInt();
        switch (day){

            case 1:
                System.out.println("MONDAY");

            case 2:
                System.out.println("TUESDAY");

            case 3:
                System.out.println("WED");

            case 4:
                System.out.println("THRUSDAY");

            case 5:
                System.out.println("FRIDAY");

            case 6:
                System.out.println("SAT");

            case 7:
                System.out.println("SUNDAY");

            default:
                System.out.println("INVALID");

        }
        System.out.println("end of the loop");
        sc.close();
    }

}
//output
//4
//THRUSDAY
//FRIDAY
//SAT
//SUNDAY
//INVALID
//end of the loop
