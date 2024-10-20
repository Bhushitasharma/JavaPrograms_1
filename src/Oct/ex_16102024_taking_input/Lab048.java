package Oct.ex_16102024_taking_input;
// Taking Input :
// by Argument console
public class Lab048 {

    public static void main(String[] args) {
        //int age = 26 // hardcoded input
        // taking input by console arg
        int age = Integer.parseInt(args[3]);// convert string into int
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        // To check all the input print the value
        System.out.println(age > 25 ? "allowed to goa" : "not allowed");
// arg[0] = 1
// arg [1] = 2


    }
}
      // create a program to check weher a girl will go to goa por not
        // take a input age
        // age > 25 -> Drinking - Goa
        // Ternary operator




