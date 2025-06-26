package mypack;

import org.springframework.stereotype.Component;

@Component
public class Author
{
    private String name,address;
    public Author()
    {
    	name="abc";
    	address="pune";
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString()
    {
        return name+"\t"+address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
