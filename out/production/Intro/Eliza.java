import java.util.Scanner;

/* super simple chat bot.*/
public class Eliza {

    public static String getResponse(String input) {
     return "";
    }

    public static void main(String[] args) {
        String str, response;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        str = scanner.nextLine();
        System.out.println("Nice to meet you, " + str);
        // loop here
        System.out.print("What would you like to talk about?");
        str = scanner.nextLine();
        response = Eliza.getResponse(str);
        System.out.println(response);
    }

}
