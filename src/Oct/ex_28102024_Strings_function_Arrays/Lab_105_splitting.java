package Oct.ex_28102024_Strings_function_Arrays;

public class Lab_105_splitting {
    public static void main(String[] args) {
        String fruits= "apple , bana, cheery"; // delimeter
        String[]split_fruits = fruits.split(",");
        System.out.println(split_fruits [0]);
        System.out.println(split_fruits [1]);
        System.out.println(split_fruits [2]);


        String a= "ABC - XYZ - BAD"; // delimeter
        String[]split_a = a.split("-");
        System.out.println(split_a [0]);
        System.out.println(split_a [1]);
        System.out.println(split_a[2]);



    }
}
