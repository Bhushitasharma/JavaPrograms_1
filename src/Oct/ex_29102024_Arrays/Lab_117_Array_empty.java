package Oct.ex_29102024_Arrays;

import java.util.Scanner;

public class Lab_117_Array_empty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] number = new int [size];

        for (int i = 0 ; i< size ; i++){
            System.out.println("Enter the number "+ (i+1));
            number[i] = scanner.nextInt();
        }
        System.out.println("Enter the numbers");
        for (int i =0; i<size; i++){
            System.out.println(number[i]);
        }
    }




}
