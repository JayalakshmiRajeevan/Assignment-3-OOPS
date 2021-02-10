package oopsAssignment;

class TestCustomer 
{
	private String CustomerName;
	private Ad ResAddress;
	@Override
	public String toString()
	{
		return "TestCustomer [ResAddress=" + ResAddress + "]";
	}
	public TestCustomer()
	{
		super();
	}
	public void Customer(String CustomerName, Ad ResAddress)
	{	
		this.CustomerName = CustomerName;
		this.ResAddress = ResAddress;
	}
	public String getCustomerName()
	{
		return CustomerName;
	}
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName = CustomerName;
	}
	public Ad getResAddress()
	{
		return ResAddress;
	}
	public void setResAddress(Ad ResAddress)
	{
		this.ResAddress = ResAddress;
	}
	String getCustomerDetails()
	{
		return getCustomerName();
	}
}

