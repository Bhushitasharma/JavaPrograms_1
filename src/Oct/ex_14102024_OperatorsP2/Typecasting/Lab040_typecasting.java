package Oct.ex_14102024_OperatorsP2.Typecasting;

public class Lab040_typecasting {
    public static void main(String[] args) {
        //Type Casting - convert one data type into another

        //Widening - Implicit , Explicit - lossless
        // Narrowing - Implicit casting - JVM

        //widening
        byte b = 10;
        int a = b; // valid implicit casting
        int a1 = (int)b ;// explicit casting
        System.out.println(a1);
        //Narrowing - converting - Large datatype - small
        int val = 200;
        //byte b2 = val; implicit
        byte b3 = (byte)val;// value - explicit - user
        System.out.println(b3);

    }

}
