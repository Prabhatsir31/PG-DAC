package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Book
{
	@Autowired
	public Book(Author author) 
	{
		super();
		this.author = author;
		isbn="85";
    		year="2000";
	}

	private Author author;
    private String isbn;
    private String year;
   
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
        return author+"\t"+isbn+"\t"+year;
    }
}
