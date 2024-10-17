package Oct.Task.Task_15102024;

public class Task1 {
    // find the maximun of 3 number
    public static void main(String[] args) {
        int x = 8;
        int y = 4;
        int z = 76;

        int Maximum_number = x>y && x>z ? x : y> z ? y : z;
        System.out.println(" largest number " +Maximum_number);


    }
}
