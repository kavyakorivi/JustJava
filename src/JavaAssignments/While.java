package JavaAssignments;

public class While {

    public static void main(String[] args) {
        int n = 2;
        int count = 0;

        while (n <= 100) {
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                int d = 2;
                while (d <= n / 2) {
                    if (n % d == 0) {
                        isPrime = false;
                        break;
                    }
                    d++;
                }
            }

            if (isPrime) {
                count++;
            }
            n++;
        }

        System.out.println("Total prime numbers between 2 and 100: " + count);
    }
}
