// Custom Checked Exception
class InvalidLengthException extends Exception {
    public InvalidLengthException(String message) {
        super(message);
    }
}

// Authenticator class
class Authenticator {
    private final String password; // Making it final for better immutability

    // Constructor that checks password length
    public Authenticator(String password) throws InvalidLengthException {
        if (password.length() < 5 || password.length() > 9) {
            throw new InvalidLengthException("Password length must be between 5 and 9 characters.");
        }
        this.password = password;
    }

    // Method that prints successful authentication
    public void done() {
        System.out.println("Successful authentication");
    }
}

// Demo class with main method
class Demo {
    public static void main(String[] args) {
        try {
            Authenticator auth = new Authenticator("secure1"); // Valid password
            auth.done();
        } catch (InvalidLengthException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Another example with invalid password
        try {
            Authenticator auth = new Authenticator("abc"); // Invalid password
            auth.done();
        } catch (InvalidLengthException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
