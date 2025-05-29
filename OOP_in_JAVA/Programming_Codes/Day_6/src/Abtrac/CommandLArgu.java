package Abtrac;

public class CommandLArgu {
	public static void main(String[] args) {
		// Check if exactly 3 arguments are provided
		if (args.length != 3) {
			System.out.println("Please provide exactly 3 arguments.");
			return;
		}

		// Call the method to calculate the sum
		int sum = calculateSum(args);

		// Display the result
		System.out.println("The Sum is: " + sum);
	}

	// Method to calculate the sum of the arguments
	private static int calculateSum(String[] args) {
		int sum = 0;
		for (String arg : args) {
			try {
				sum += Integer.parseInt(arg); // Parse and add each argument
			} catch (NumberFormatException e) {
				System.out.println("Please ensure all arguments are valid integers.");
				System.exit(1); // Exit if any argument is invalid
			}
		}
		return sum;
	}
}