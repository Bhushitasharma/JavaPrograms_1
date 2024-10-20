package Oct.Task.Task_15102024;

public class Task2 {
    public static void main(String[] args) {


        int a = 10;
        System.out.println(++a + a++ + a++);


        // line / A / exp
        // 7   / 10 / na
        //  8  /  10 / 11  a is 11
        //  8 /   11 / 11  a is 12
        // 8  /   12 /  12  a is 13
         // exp : 34

    }
}
