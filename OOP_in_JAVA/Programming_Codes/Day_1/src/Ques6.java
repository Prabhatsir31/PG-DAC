public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers between 3 and 30 are:");
		for (int num = 3; num <= 30; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
	}

}
	// Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It is a prime number
    }
}
