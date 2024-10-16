package Oct.Task.Task_11102024;

public class Task2_operators {
    public static void main(String[] args) {
       int A= 10;
       int B = 3;

        //Airthmetic Operators
        System.out.println(A+ B);
        System.out.println(A- B);
        System.out.println(A% B);
        System.out.println(A/ B);
        System.out.println(A* B);

        // Assignment Operators
        //single
        System.out.println(A);
        System.out.println(B);
        // compound
        System.out.println("A+=B = "+(A+=B)); // += , A=A+10 VALUE OF A = 13
        System.out.println("A-=B = "+(A-=B)); // -= , A=A-B  VALUE OF A = 10
        System.out.println("A*=B = "+(A*=B)); // *= , A = A*B VALUE OF A = 30
        System.out.println("A/=B = "+(A/=B)); // /= , A=A/B VALUE OF A= 10
        System.out.println("A%=B = "+(A%=B)); // %= , A=A%B VALUE OF A=1


        // RELATIONAL OPERATORS : TRUE OR FALSE
        System.out.println("A==B = "+(A==B));  // == COMPARISON Operator
        System.out.println("A!=B = "+(A!=B)); // !=  NOT EQUAL TO operator
        System.out.println("A<=B = "+(A<=B)); // <=  LESS THAN EQUAL TO operator
        System.out.println("A>=B = "+(A>=B));  // >= GREATER THAN EQUAL TO operator
        System.out.println("A>B = "+(A>B));   // > GREATER operator
        System.out.println("A<B = "+(A<B));  // < LESS operator

        // LOGICAL OPERATORS: AND , OR , NOT < GATE>

        System.out.println((4 > 5) && (6>5)); // FALSE <AND GATE>
        System.out.println((4 > 5) || (6>5)); // true < or gate >
        System.out.println(!(9>=5)); // false



        //
    }
}
