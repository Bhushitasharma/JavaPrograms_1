package Oct.Task.Task_28102024;

public class Task_String_function {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("I AM SUPER COOL");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        StringBuffer a = new StringBuffer("I AM SUPER COOL");
        stringBuffer.toString();
        System.out.println(a);
        StringBuffer b = new StringBuffer("I AM SUPER COOL");
        stringBuffer.charAt(2);
        System.out.println(b);
        StringBuffer c = new StringBuffer("I AM SUPER COOL");

        System.out.println(c);
        stringBuffer.append("But not so");

    }
}
