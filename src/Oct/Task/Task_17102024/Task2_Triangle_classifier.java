package Oct.Task.Task_17102024;

import java.util.Scanner;

//Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
public class Task2_Triangle_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the side 1:");
        int a = sc.nextInt();
        System.out.println(" enter the side 2:");
        int b = sc.nextInt();
        System.out.println(" enter the side 3 :");
        int c = sc.nextInt();

        if (a== b && b==c && c==a) {
            System.out.println("Equilateral");
        }
        else if( ( a==b && b!=c && c!=a)  ||  (a!=b && b==c && c!=a ) ||  (a!=b && b!=c && c==a ))
        {
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }



    }
}

// step 1: input > 3 side > data tyoe > int
// step 2 : output : 3 type

// logic : if (a== b && b==c && c==a)
// else if ( a==b && b==c && c!=a ) || ( a==b && b!=c && c==a ) || ( a!=b && b==c && c==a )
// else ( " scalene)



