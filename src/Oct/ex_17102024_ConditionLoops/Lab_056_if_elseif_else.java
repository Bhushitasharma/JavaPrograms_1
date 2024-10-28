package Oct.ex_17102024_ConditionLoops;

import java.util.Scanner;

public class Lab_056_if_elseif_else {
    public static void main(String[] args) {


        // conditions - 2 outputs,
        // can we have two or more outputs?
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for num1");

        int num1 = sc.nextInt();
        System.out.println("enter the value of num2");
        int num2 = sc.nextInt();
        // 1: num 1>num 2
        // 2: num2 > num1
        // 3 : num1 == num2

        if (num1 > num2){
            System.out.println("num1> num2" );
        }
        else if (num2>num1) {
            System.out.println("num2 > num1");
        }
        else{
            System.out.println("num1 =num2 ");
        }


    }
}