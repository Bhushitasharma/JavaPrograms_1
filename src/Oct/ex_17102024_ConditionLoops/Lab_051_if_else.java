package Oct.ex_17102024_ConditionLoops;

import java.util.Scanner;

public class Lab_051_if_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age >18){
            System.out.println("allowed to vote" );

        }
        else {
            System.out.println("not allowed");
        }
    }
}
