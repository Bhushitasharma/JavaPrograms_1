package Oct.Task.Task_18102024;

import java.util.Scanner;

public class Task_3_convert_units {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int value_of_m = scanner.nextInt();
        int num = 1000;
        int value_of_km = scanner.nextInt();


        switch(value_of_km){
            case 1 :
                value_of_km = value_of_m * num ;
                System.out.println("printed int km");

        // 1 km = 1000 m
        //
        // F = C * (9/5)+32
    }
}}
