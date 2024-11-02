package Oct.Task.Task_231012024;
//Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(" Enter the two number");

        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        float result = sum(a,b);
        System.out.println("sum of two number is :" +result);

        result = sub(a,b);
        System.out.println("sub of two number is :" +result);
        result = multiplication(a,b);
        System.out.println("multiplication of two number is :" +result);
        result = divide(a,b);
        System.out.println("division of two number is :" +result);



    }

    static int sum (int a ,int b) {
        return a+b;

    }
    static int sub (int a ,int b) {
        return a - b;
    }
    static int multiplication (int a ,int b) {
        return a * b;
    }
    static float divide ( float a ,float b) {
        return a / b;
    }


}
