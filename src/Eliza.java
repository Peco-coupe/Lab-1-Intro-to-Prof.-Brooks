import java.util.Scanner;

/* super simple chat bot.*/
public class Eliza {

    public static String getResponse(String input) {
        String[] food = {"cake", "apple", "rice"};
        if (input != null) {
            for (int i =0; i < 3; i++) {
                if (input.equals(food[i])) {
                    String Ilovex = "I love " + input + " !";
                    return Ilovex;
                } else {

                }
            }
            if (input.contains("joke")) {
                String joke = "Teacher: whoever answers my next question, can go home.\nOne boy throws his bag out the window.\nTeacher: who just threw that?!\nBoy: Me! I’m going home now.\n";
                return joke;
            } else {

            }
            if (input.contains("I am ")) {
                if (input.indexOf("I am ") != 0){
                    String r = input.substring(0,input.indexOf("I am ") - 1);// n+5.
                    int tail = 0;
                    if (input.indexOf(".") == -1) {
                        tail = input.length();
                    } else {
                        tail = input.indexOf(".");
                    }
                    String re = input.substring(input.indexOf("I am ") + 5, tail);
                    String rep = "Why are you " + re + " " + r + " ?";
                    return rep;
                } else {
                    // n+5.
                    int tail = 0;
                    if (input.indexOf(".") == -1) {
                        tail = input.length();
                    } else {
                        tail = input.indexOf(".");
                    }
                    String re = input.substring(input.indexOf("I am ") + 5, tail);
                    String rep = "Why are you " + re + " ?";
                    return rep;
                }

            } else {
                return "I don't know anything about that.";
            }
        } else {
            return "I don't know anything about that.";
        }
    }


    public static void main(String[] args) {
        String str, response;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?\n");
        str = scanner.nextLine();
        System.out.println("Nice to meet you, " + str + "\n");
        // loop here
        do {
            System.out.print("What would you like to talk about?\n");
            str = scanner.nextLine();
            if (str.equals("goodbye.") || str.equals("goodbye") || str.equals("Goodbye.") || str.equals("Goodbye")) {
                break;
            } else {
                response = Eliza.getResponse(str);
                System.out.println(response);
            }
        } while(1 == 1);
        System.out.println("Ok,goodbye.\n");
        }
}


