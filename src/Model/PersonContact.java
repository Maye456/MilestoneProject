package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/14/2020
 * This Class extends BaseContact class and essentially gains
 * their variables as well. This class is setup to create a 
 * Personal Contact for the user.
 */

public class PersonContact extends BaseContact
{
	String dateOfBirth;
	String description;
	
	public PersonContact(int userID, String name, String dateOfBirth, 
			String phoneNumber, String email, String streetName, String city, 
			String state, String zipCode, String country, String photoName, String description)
	{
		super(userID, name, phoneNumber, email, streetName, city, state, zipCode, country, photoName);
		this.dateOfBirth = dateOfBirth;
		this.description = description;
	}
	
	// Default Constructor
	public PersonContact()
	{
		this.userID = 1;
		this.name = "Jeanna Maye E. Benitez";
		this.dateOfBirth = "09/06/2001";
		this.phoneNumber = "(510) 731-8854";
		this.email = "benitezjeanna@yahoo.com";
		this.streetName = "2013 Fitzgerald Way";
		this.city = "Brentwood";
		this.state = "CA";
		this.zipCode = "94513";
		this.country = "USA";
		this.photoName = "mypicture.jpg"; 
		this.description = "I Go To GCU in Arizona and am pursuing a Bachelor's Degree in Computer"
				+ " programming";
	}

	public String getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	@Override
	public int compareTo(BaseContact other) 
	{		
		return 0;
	}
	
	@Override
	public String toString() // Will return a string when .toString() is used
	{
		return "[User ID: " + this.userID + "]" + "\n[Name: " + this.name + "]" + "\n[Date of Birth: " + this.dateOfBirth + "]" +
				"\n[Phone #: " + this.phoneNumber + "]" + "\n[Email: " + this.email + "]" 
				+ "\n[Address: "+ this.streetName + " " + this.city + ", " + this.state + 
				" " + this.zipCode +" (" + this.country + ")]"+ "\n[Photo: " + this.photoName 
				+ "]" + "\n[Description: " + this.description + "]\n\n";
	}
}
