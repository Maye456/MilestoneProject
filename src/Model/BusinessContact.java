package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/14/2020
 * This Class extends BaseContact class and essentially gains
 * their variables as well. This class is setup to create a 
 * Business Contact for the user.
 */

import java.util.ArrayList;

public class BusinessContact extends BaseContact
{
	private String businessName;
	private String description;
	private String opening;
	private String closing;
	private Boolean[] daysOfWeekOpen;
	private String url;
	
	public BusinessContact(int userID, String name, String phoneNumber, String email, 
			String streetName, String city, String state, String zipCode, String country, 
			String photoName, String businessName, String description, String opening, String closing, Boolean[] 
			daysOfWeekOpen, String url)
	{
		super(userID, name, phoneNumber, email, streetName, city, state, zipCode, country, photoName);
		this.businessName = businessName;
		this.description = description;
		this.opening = opening;
		this.closing = closing;
		this.daysOfWeekOpen = daysOfWeekOpen;
		this.url = url;
	}
	
	// Default Constructor
	public BusinessContact()
	{
		this.userID = 2;
		this.name = "Lena Luthor";
		this.phoneNumber = "(625) 859-0036";
		this.email = "lluthor@gmail.com";
		this.streetName = "489 National Ave";
		this.city = "National City";
		this.state = "CA";
		this.zipCode = "28193";
		this.country = "USA";
		this.photoName = "lena.jpg"; 
		this.businessName = "L-Corp";
		this.description = "CEO of L-Corp";
		this.opening = "9:00 A.M.";
		this.closing = "10:00 P.M.";
		this.daysOfWeekOpen = new Boolean [] {false, true, true, true, true, true, true};
		this.url = "http://www.inmydreams.com";
	}
	
	
	public String getBusinessName() 
	{
		return businessName;
	}

	public void setBusinessName(String businessName) 
	{
		this.businessName = businessName;
	}

	public String getOpening() 
	{
		return opening;
	}

	public void setOpening(String opening) 
	{
		this.opening = opening;
	}

	public String getClosing() 
	{
		return closing;
	}

	public void setClosing(String closing) 
	{
		this.closing = closing;
	}

	public Boolean[] getDaysOfWeekOpen() 
	{
		return daysOfWeekOpen;
	}

	public void setDaysOfWeekOpen(Boolean[] daysOfWeekOpen) 
	{
		this.daysOfWeekOpen = daysOfWeekOpen;
	}

	public String getUrl() 
	{
		return url;
	}

	public void setUrl(String url) 
	{
		this.url = url;
	}

	@Override
	public int compareTo(BaseContact other) 
	{		
		return 0;
	}
	
	@Override
	public String toString() // Will return a string when .toString() is used
	{
		return "[User ID: " + this.userID + "]" + "\n[Name: " + this.name + "]" + 
				"\n[Phone #: " + this.phoneNumber + "]" + "\n[Email: " + this.email + "]" 
				+ "\n[Address: "+ this.streetName + " " + this.city + ", " + this.state + 
				" " + this.zipCode +" (" + this.country + ")]"+ "\n[Photo: " + this.photoName 
				+ "]\n" + "[Company Name: " + this.businessName + "]\n" + "[Description: " + this.description + 
				"]\n" + "[Business Hours: " + this.opening + " - " + this.closing + "]\n" + "[URL: " + this.url + "]\n\n";
	}
}
