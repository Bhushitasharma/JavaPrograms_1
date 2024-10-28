package Oct.ex_17102024_ConditionLoops;

import java.util.Scanner;

public class Lab_055_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the num");
        int num = sc.nextInt();
         // modulus > %
        // 10% 2== even > 1
        // 10% 2 == odd > 1
         if (num % 2==0) {
            System.out.println("num is even");
        }
        else
        {
            System.out.println("num is odd");
        }


        }
}
