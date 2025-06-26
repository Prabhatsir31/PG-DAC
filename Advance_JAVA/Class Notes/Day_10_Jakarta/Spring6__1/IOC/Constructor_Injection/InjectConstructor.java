package mypack;
public class InjectConstructor
{
    private String message=null;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public InjectConstructor(String message)
    {
        this.message=message;
    }
}
