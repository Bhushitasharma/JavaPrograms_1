package Oct.ex_29102024_Arrays;

public class Lab_112_Array_creation_Without_pre_defined_elements {
    public static void main(String[] args) {
        //before creation the array we have to give pre-defined array
        int [] marks = new int[5]; // provide the fixed sized
        System.out.println(marks.length);
        marks[0] = 11;
        marks[1] = 19;
        marks[2] = 03;
        marks[3] = 66;
        marks[4] = 14;
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


    }
}
