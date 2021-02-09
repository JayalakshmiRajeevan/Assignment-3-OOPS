package oopsAssignment;

public class Book 
{
	private int BookNo;
	private String title;
	private String Author;
	private float Price;
	
	public String getAuthor()
	{
		return Author;
	}
	public void setAuthor(String author)
	{
		Author = author;
	}
	public int getBookNo()
	{
		return BookNo;
	}
	public void setBookNo(int bookNo)
	{
		BookNo = bookNo;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public float getPrice()
	{
		return Price;
	}
	public void setPrice(float price)
	{
		Price = price;
	}
}
