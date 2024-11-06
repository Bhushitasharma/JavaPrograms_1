package Oct.ex_28102024_Strings_function_Arrays;

public class Lab_108_other_functions {
    public static void main(String[] args) {
        String s = "BHUSHITA";
        System.out.println(s.indexOf("H"));
        System.out.println(s.indexOf("S"));
        System.out.println(s.indexOf("H"));//doubt

        String s1 = "BHUSHITA";
        System.out.println(s1.contains("IT"));
        System.out.println(s1.contains("HU"));
        System.out.println(s1.contains("HI"));

        String s2 = "Promoddutta";
        System.out.println(s2.lastIndexOf("d"));

        String s3 = "Bhushita";
        System.out.println(s3.replace("B","z"));
    }
}
