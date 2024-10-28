package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab_058_Switch {
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
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THRUSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("INVALID");
                break;
        }
        System.out.println("end of the loop");
        sc.close();
    }

}
