public class PrimeCheck {
    public static void main(String[] args) {

        // Check if command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        // Prime numbers must be greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
    }
}
