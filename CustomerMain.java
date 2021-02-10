package oopsAssignment;

public class CustomerMain 
{
	public static void main(String[] args) 
	{
	Ad a=new Ad("HSR Layout", "Banglore");
	TestCustomer c=new TestCustomer();
	c.setCustomerName("John");
	c.setResAddress(a);
	System.out.println(c.getCustomerName());
	System.out.println(c.getResAddress());
	}
}
