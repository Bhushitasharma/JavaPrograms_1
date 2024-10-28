package Oct.ex_22102024_While;

public class Lab_087_user_input {
    public static void main(String[] args) {
        //Task a user input for the age and print the output
        //30 , 29,28....

        String arg_age_string = args[0];
        // arguments
        //string> int

        int age = Integer.parseInt(arg_age_string);
       // System.out.println(age);
        while (age>=0){
            System.out.println(age);

            age--;

        }


    }

}
