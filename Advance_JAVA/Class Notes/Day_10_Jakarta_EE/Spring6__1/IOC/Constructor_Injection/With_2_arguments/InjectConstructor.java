package mypack;
public class InjectConstructor
{
    private String message=null;
    private int num;
    public String getMessage() {
        return message;
    }
    public int getNum() {
        return num;
    }

    public InjectConstructor(String message,int num)
    {
        this.message=message;
        this.num=num;
        System.out.println("inside string and int constructor");
    }
    
}
