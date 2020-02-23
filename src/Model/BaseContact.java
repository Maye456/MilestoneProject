package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an abstract class that is an extension of
 * the Person and Business Contact classes. It sets up certain variables
 * to be used in the other classes.
 */
import java.util.Random;

public abstract class BaseContact implements Comparable<BaseContact>
{
	protected int userID;
	protected String name;
	protected String phoneNumber;
	protected String email;
	protected String streetName;
	protected String city;
	protected String state;
	protected String zipCode; // or postalCode
	protected String country;
	protected String photoName;
	
	public BaseContact(int userID, String name, String phoneNumber, String email, 
			String streetName, String city, String state, String zipCode, String country, 
			String photoName)
	{
		super();
		this.userID = userID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.photoName = photoName;
	}
	
	// Default Constructor
	public BaseContact()
	{
		this.userID = 1;
		this.name = "Jeanna Maye E. Benitez";
		this.phoneNumber = "(510) 731-8854";
		this.email = "benitezjeanna@yahoo.com";
		this.streetName = "2013 Fitzgerald Way";
		this.city = "Brentwood";
		this.state = "CA";
		this.zipCode = "94513";
		this.country = "USA";
		this.photoName = "mypicture.jpg"; 
	}
	
	public String toString() // Will return a string when .toString() is used
	{
		return "[User ID: " + this.userID + "]" + "\n[Name: " + this.name + "]" + 
				"\n[Phone #: " + this.phoneNumber + "]" + "\n[Email: " + this.email + "]" 
				+ "\n[Address: "+ this.streetName + " " + this.city + ", " + this.state + 
				" " + this.zipCode +"[" + this.country + "]"+ "\n[Photo: " + this.photoName 
				+ "]\n";
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() 
	{
		return streetName;
	}

	public void setStreetName(String streetName) 
	{
		this.streetName = streetName;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getZipCode() 
	{
		return zipCode;
	}

	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}

	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getPhotoName() 
	{
		return photoName;
	}

	public void setPhotoName(String photoName) 
	{
		this.photoName = photoName;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
}
