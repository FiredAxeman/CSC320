package Labs;

import java.util.Scanner;

public class BruteForceEquationSolver {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        
        boolean foundSolution = false;
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                if (a1 * x + b1 * y == c1 && a2 * x + b2 * y == c2) {
                    System.out.println(x + " " + y);
                    foundSolution = true;
                    break;
                }
            }
            if (foundSolution) {
                break;
            }
        }

        if (!foundSolution) {
            System.out.println("No solution");
        }

        scanner.close();
    }
}
