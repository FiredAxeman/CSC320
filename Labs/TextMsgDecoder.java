package Labs;

import java.util.Scanner;

public class TextMsgDecoder {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter text:");
        String input = scnr.nextLine();
        System.out.println("You entered: " + input);
        String[] abbreviations = {"BFF", "IDK", "JK", "TMI", "TTYL"};
        String[] meanings = {"best friend forever", "I don't know", "just kidding", "too much information", "talk to you later"};

        for (int i = 0; i < abbreviations.length; i++) {
            int index = input.indexOf(abbreviations[i]);
            if (index != -1) {
                System.out.println(abbreviations[i] + ": " + meanings[i]);
            }
        }
        scnr.close();
    }
}
