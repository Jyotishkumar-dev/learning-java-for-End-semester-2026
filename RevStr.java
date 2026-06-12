// Experiment number 1
// write a java program to reverse the given string.

 import java.util.Scanner;

public class RevStr {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter String: ");
        String original = sc.nextLine();

        // Store reversed string
        String reverse = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Display output
        System.out.println("Reverse of a string: " + reverse);

        // Close scanner
        sc.close();
    }
}