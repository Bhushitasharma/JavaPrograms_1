package Oct.ex_29102024_Arrays;

public class Lab_115_maxValueInArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_value = give_max(array);
        System.out.printf("Max Value is %d", max_value);



    }
    static int give_max(int[] array){
       int max =array[0];
       for (int i = 0; i<array.length; i ++)
       {
           if (array[i] >max)
           {
              max = array[i];
           }
       }
        return  max;
    }
    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min ){
                min = array[i];
            }
        }

        return min;
    }
}
