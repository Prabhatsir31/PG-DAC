package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Book
{
    @Autowired
    private Author author;
    private String isbn;
    private String year;
    public Book()
    {
    	isbn="70";
    	year="2010";
    }
   	public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString()
    {
	System.out.println("Author's address is\t"+author.getAddress());
        return author+"\t"+isbn+"\t"+year;
    }
}
