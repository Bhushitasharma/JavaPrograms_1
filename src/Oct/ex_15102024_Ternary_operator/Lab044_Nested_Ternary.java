package Oct.ex_15102024_Ternary_operator;

public class Lab044_Nested_Ternary {
    public static void main(String[] args) {




        // Nested Ternary :
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        //90 - A
        // 80- B
        // 70- C
        //60 - D
        //50 -E

        int grade = 87;
        String score = (grade >= 90)? "A" :(grade >= 80)? "B" :(grade >= 70)? "C" : (grade >= 60)? "D" : (grade >= 50)? "E":"F";
        System.out.println("your score is >: "+score);

    }
}
