package Chapter3;

public class Discussion3 {
    public static void main(String[] args) {
        java.util.Scanner scnr = new java.util.Scanner(System.in);
        int userNum;
        System.out.println("Enter a number: ");
        userNum = scnr.nextInt();
        if (userNum < 0) {
            System.out.println("Your number " + userNum + " is Negative");
        }
        else if (userNum == 1){
            System.out.println("Number is one.");
        }
        else if (userNum >= 100){
            System.out.println("Your Number " + userNum + " is greater than or equal to 100.");
        }
        else {
            System.out.println("Your number " + userNum + " is Positive.");
        }
        scnr.close();
    }
}
