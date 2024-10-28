package Oct.ex_18102024_IfCondition_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab_060 {
    // we automation
    // i will ask user which browser you want to run the code.
    //chrome > execyute crome
    // firefox > execute of firefox
    // edge > edge browser cases.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser");
        String browser = scanner.next();
        browser =browser.toLowerCase();
        switch (browser) {
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "chrome":
                System.out.println("starting the chrome");
                break;

            case "firefox":
                System.out.println("starting the firefox");
                break;
            case "edge":
                System.out.println("starting the edge code");
                break;


        }
    }
}
 // if we enter small case chrome then it will fine if we enter uppercse chorme the we use the "browser =browser.toLowerCase();"