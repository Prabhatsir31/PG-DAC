package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="mybook")
public class Book
{
    public Author getAuthor() {
		return author;
	}
    	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}

	private Author author;
    private String isbn;
    private String year;
    public Book()
    {
    	isbn="70";
    	year="2010";
	System.out.println("Book constructor");
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
        return author+"\t"+isbn+"\t"+year;
    }
}
