//create checked exception:
//InvalidLengthException

//define a class public class Authenticator with
//a parameterized constructor which takes String as a password.
//this class also will have "done()" method with "successful authentication" message.
//Parameterized constructor should check the length of the password passed if it is less than 5 or 
//more that 9 , it should raise "InvalidLengthException" [ constructor shouldn't handle the exception]
//create a class "Demo" with main
//inside main function create the object of "Authenticator" class and invoke "done()" method.



class InvalidLengthException extends Exception {
    public InvalidLengthException(String message) {
        super(message);
    }
}

class Authenticator {
    private String password;

    public Authenticator(String password) throws InvalidLengthException {
        if (password.length() < 5 || password.length() > 9) {
            throw new InvalidLengthException("Password length must be between 5 and 9 characters.");
        }
        
        this.password = password;
    }
    
    public void done() {
        System.out.println("Successful Authentication");
    }
}

public class Demo { // Renamed class to Demo
    public static void main(String[] args) {
        try {
            Authenticator auth = new Authenticator("password"); 
            auth.done();
        } catch (InvalidLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
