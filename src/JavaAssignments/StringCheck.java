package JavaAssignments;
import java.util.Scanner;

public class StringCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to search for: ");
        String requiredWord = scanner.next();

        String[] s = sentence.split(" ");


        boolean found = false;
        for (String word : s) {
            System.out.print(word + " ");
            if (word.equals(requiredWord)) {
                found = true;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Given string, \"" + requiredWord + "\" is present in the list.");
        } else {
            System.out.println("Given string, \"" + requiredWord + "\" is not present in the list.");
        }
    }
}

