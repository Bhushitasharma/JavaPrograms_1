package Oct.ex_28102024_Strings_function_Arrays;

public class Lab_110_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("BHUSHITA");
        stringBuffer.append("Sharma");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Bhushita");
        stringBuilder.append("sharma");
        System.out.println(stringBuilder);
    }
}
