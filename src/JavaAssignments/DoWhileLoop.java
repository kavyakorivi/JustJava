package JavaAssignments;

public class DoWhileLoop {

    public static void main(String[] args) {
        int[] n = {121, 123421};

        int i = 0;
        do {
            int num = n[i];
            if (isPalindrome(num)) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num + " is not a palindrome number.");
            }
            i++;
        } while (i < n.length);
    }

    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int r = 0;

        while (n > 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n/= 10;
        }

        return originalNumber == r;
    }
}

