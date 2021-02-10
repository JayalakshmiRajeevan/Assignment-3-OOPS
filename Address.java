package oopsAssignment;

class Ad
{
	private String AddressLine;
	private  String City;
	public Ad(String addressLine, String city) 
	{
		super();
		AddressLine = addressLine;
		City = city;
	}
	@Override
	public String toString()
	{
		return "Address :" + AddressLine + " "+getCity();
	}
	public void setAddressLine(String AddressLine)
	{
		this.AddressLine=AddressLine;
	}
	public String getAddressLine()
	{
		return AddressLine;
	}
	public void setCity(String City)
	{
		this.City=City;
	}
	public String getCity()
	{
		return City;
	}
	public String getAddressDetails()
	{
		return AddressLine + City;
	}
}
