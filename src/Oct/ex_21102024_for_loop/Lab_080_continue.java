package Oct.ex_21102024_for_loop;

public class Lab_080_continue {
    public static void main(String[] args) {
        for (int i = 0; i<50 ; i++){
            if (i==5){
                continue; // skip and go back to above , move to top
            }
            System.out.println(i);
        }
    }

}
