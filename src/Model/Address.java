package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class sets up the address variables for 
 * the Business and Person Contact
 */

public class Address extends BaseContact
{
	public Address(String streetName, String city, String state, String zipCode, String country)
	{
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	public Address()
	{
		this.streetName = "2013 Fitzgerald Way";
		this.city = "Brentwood";
		this.state = "CA";
		this.zipCode = "94513";
		this.country = "USA";
	}
	
	public String toString()
	{
		return this.streetName + " " + this.city + ", " + this.state + " " + this.zipCode +
				"[ " + this.country + "]";
	}

	@Override
	public int compareTo(BaseContact o) 
	{		
		return 0;
	}
}
