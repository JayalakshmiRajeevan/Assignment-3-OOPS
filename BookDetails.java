package oopsAssignment;

import java.util.Scanner;

public class BookDetails
{
	public static void main(String[] args)
	{
		Book b=new Book();
		Scanner t=new Scanner(System.in);
		System.out.println("Book No: ");
		b.setBookNo(t.nextInt());
		System.out.println("Title: ");
		b.setTitle(t.next());
		System.out.println("Author: ");
		b.setAuthor(t.next());
		System.out.println("Price: ");
		b.setPrice(t.nextFloat());
		
		System.out.println("The Book No. is "+b.getBookNo());
		System.out.println("Name of book is "+b.getTitle());
		System.out.println("Author of "+b.getTitle()+" is "+b.getAuthor());
		System.out.println("Price of Book is "+b.getPrice());
	}

}
