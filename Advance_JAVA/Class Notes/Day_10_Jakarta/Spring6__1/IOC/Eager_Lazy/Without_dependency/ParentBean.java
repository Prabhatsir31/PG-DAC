package mypack;
public class ParentBean
{
    public ParentBean()
    {
        System.out.println("ParentBean no-arg constructor");
    }
    public void setAbn(AnotherBean abn) 
    {
        System.out.println("inside setter method of ParentBean");
        this.abn = abn;
    }
    private AnotherBean abn;
    public void perform()
    {
        if(abn!=null)
        System.out.println(abn.disp());
    }
}
