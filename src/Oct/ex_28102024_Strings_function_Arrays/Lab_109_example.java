package Oct.ex_28102024_Strings_function_Arrays;

public class Lab_109_example {
    public static void main(String[] args) {
        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);
// d -> interger , + goes withh all the integers that replace all with space
    }
}
