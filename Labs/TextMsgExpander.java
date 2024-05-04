package Labs;

import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
        
        // Task 1: Get user input
        System.out.println("Enter text:");
        String input = scnr.nextLine();
        System.out.println("You entered: " + input +"\n");
        
        // Task 2: Expand common text message abbreviations
        String[] abbreviations = {"BFF", "IDK", "JK", "TMI", "TTYL"};
        String[] meanings = {"best friend forever", "I don't know", "just kidding", "too much information", "talk to you later"};
        
        for (int i = 0; i < abbreviations.length; i++) {
            String abbreviation = abbreviations[i];
            String meaning = meanings[i];
            if (input.contains(abbreviation)) {
                System.out.println("Replaced \"" + abbreviation + "\" with \"" + meaning + "\".");
                input = input.replaceAll("\\b" + abbreviation + "\\b", meaning);
            }
        }
        
        // Output the expanded line
        System.out.println("\nExpanded: " + input);
        scnr.close();
     }
}
