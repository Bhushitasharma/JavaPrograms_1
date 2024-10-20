package Oct.ex_16102024_taking_input;

import java.util.Scanner;

// scanner class
public class Lab049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the age \n");
        int age = scanner.nextInt();
        // float age = scanner.nextfloat ();
        System.out.println(age > 25 ? "allowed to goa" : "not allowed");
    }
}
