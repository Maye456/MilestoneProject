
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.Preferences;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;

import BusinessServices.ContactAppBusinessService;
import DataAccess.FileIOService;
import Model.AddressBook;
import Model.BusinessContact;
import Model.PersonContact;

/* Jeanna Maye E. Benitez
 * Date: 02/14/2020
 * This Class is the main program where everything will be
 * executed. It will allow user input for if/when the 
 * user decides to add, remove, edit, or view their 
 * contacts.
 */

public class ConsoleApp
{
	public static void main(String[] args) throws Exception
	{	
		ContactAppBusinessService bs = new ContactAppBusinessService();		
				
		// Create A Current List of Contacts to input in the Address Book
		PersonContact p1 = new PersonContact();
		bs.list.addOne(p1);

		PersonContact p2 = new PersonContact(3, "Sharon Agcang", "03/23/1982", "510-862-1219",
				"s.agcang@gmail.com", "8025 Starbuck Way", "Roseville", "CA", "95747", "USA",
				"sharon.jpg", "Medical field worker");
		bs.list.addOne(p2);

		PersonContact p3 = new PersonContact(4, "Beca Mitchell", "03/28/1994", "389-880-8956",
				"bmitchell@gmail.com", "6936 Barden St", "Atltanta", "GA", "75926", "USA",
				"bmitchell.jpg", "Intern at local recording studio");
		bs.list.addOne(p3);

		BusinessContact b1 = new BusinessContact();
		bs.list.addOne(b1);

		// TESTING
		FileIOService fs = new FileIOService();
		fs.writeAllData(bs);
		AddressBook ab = new AddressBook();
		ab = fs.readAllData();
		System.out.println(ab.getContactList().toString());
		
//		bs.saveAllContacts();
//		bs.loadAllLists();

		
		boolean start = true;
		while(start == true)
		{
			// User Input to choose options
			Scanner input = new Scanner(System.in);
			System.out.println("(1) Add Personal or Business Contact");
			System.out.println("(2) View All Contacts");
			System.out.println("(3) Quit");
			int choose = input.nextInt();
			if(choose == 1) // Add Personal/Business Contact
			{
				// User Input to add a contact
				System.out.println("(1) To Make New Personal Contact");
				System.out.println("(2) To Make New Business Contact");
				System.out.println("(3) To Exit The Program");
				int makeContact = input.nextInt();
				if(makeContact == 1) // Create Personal Contact
				{
					System.out.println("Please Enter In The Following Information For Your New Contact");
					
					System.out.println("User ID: ");
					int userID = input.nextInt();
					System.out.println("Name: ");
					String name = input.nextLine();
					name = input.nextLine();
					System.out.println("Date Of Birth: (MM/DD/YYYY)");
					String dateOfBirth = input.nextLine();
					System.out.println("Phone #: ");
					String phoneNumber = input.nextLine();
					System.out.println("Email: ");
					String email = input.nextLine();
					System.out.println("Street Name: ");
					String streetName = input.nextLine();
					System.out.println("City: ");
					String city = input.nextLine();
					System.out.println("State: ");
					String state = input.nextLine();
					System.out.println("Zip Code: ");
					String zipCode = input.nextLine();
					System.out.println("Country: ");
					String country = input.nextLine();
					System.out.println("Image: ");
					String photoName = input.nextLine();
					System.out.println("Description: ");
					String description = input.nextLine(); 

					PersonContact entry = new PersonContact(userID, name, dateOfBirth, phoneNumber, email, streetName, city, 
							state, zipCode, country, photoName, description); 
					bs.list.addOne(entry);

					System.out.println("====== Updated List Of Contacts ======");
					System.out.println(bs.list.toString());
				}
				else if (makeContact == 2) // Create Business Contact
				{
					System.out.println("Please Enter In The Following Information For Your New Contact");
					
					System.out.println("User ID: ");
					int userID = input.nextInt();
					System.out.println("Name: ");
					String name = input.nextLine();
					name = input.nextLine();
					System.out.println("Phone #: ");
					String phoneNumber = input.nextLine();
					System.out.println("Email: ");
					String email = input.nextLine();
					System.out.println("Street Name: ");
					String streetName = input.nextLine();
					System.out.println("City: ");
					String city = input.nextLine();
					System.out.println("State: ");
					String state = input.nextLine();
					System.out.println("Zip Code: ");
					String zipCode = input.nextLine();
					System.out.println("Country: ");
					String country = input.nextLine();
					System.out.println("Image: ");
					String photoName = input.nextLine();
					System.out.println("Company Name: ");
					String businessName = input.nextLine();
					System.out.println("Description: ");
					String description = input.nextLine();
					System.out.println("Opening: ");
					String opening = input.nextLine();
					System.out.println("Closing: ");
					String closing = input.nextLine();
					System.out.println("Days of Week Open: ");
					Boolean[] daysOfWeekOpen = null;
					System.out.println("URL: ");
					String url = input.nextLine();

					BusinessContact entry = new BusinessContact(userID, name, phoneNumber, email, 
							streetName, city, state, zipCode, country, photoName, businessName, description, 
							opening, closing, daysOfWeekOpen, url);
					bs.list.addOne(entry);

					System.out.println("====== Updated List Of Contacts ======");
					System.out.println(bs.list.toString());
				}
				else if(makeContact == 3)
				{
					System.out.println("Program has ended...");
					System.exit(0);
				}
			}
			else if(choose == 2) // View Current List of Contact
			{
				System.out.println("====== List Of Contacts ======");
				System.out.println(bs.list.toString());

				// User Input to Edit Contacts
				System.out.println("(1) Search For Contact");
				System.out.println("(2) Delete A Contact");
				System.out.println("(3) Update A Current Contact");
				System.out.println("(4) To Exit The Program");
				int edit = input.nextInt();
				if(edit == 1) // Search For A Contact
				{
					System.out.println("Enter The First Letter of The Contact You Wish to Find, or Search by City, "
							+ "Street Address, Country, or State: ");
					String search = input.nextLine();
					search = input.nextLine();
					System.out.println(bs.getList().searchContactList(search));
				}
				else if(edit == 2) // Delete A Contact
				{
					// 3 - Delete
					System.out.println("Enter The Full Name of The Contact You Wish to Remove: ");
					String search = input.nextLine();
					search = input.nextLine();
					System.out.println(bs.getList().searchContactList(search));
					System.out.println("Do You Wish To Remove This Contact? (1) Yes (2) No");
					int pick = input.nextInt();
					if(pick == 1) // Remove Contact
					{
						bs.getList().deleteContact(search);
					
						System.out.println("====== New List Of Contacts ======");
						System.out.println(bs.list);
					}
					else if(pick == 2) // Don't Remove Contact
					{
						System.out.println("Program has ended. Restart the program to start again...");
						System.exit(0);
					}
				}
				else if(edit == 3) // Update A Current Contact
				{
					System.out.println("Enter The ID of The Contact You Wish to Edit: ");
					String search = input.nextLine();
					search = input.nextLine();
					if(!search.matches("")) 
					{
						int id = Integer.parseInt(search); // Changes String input to an int so program can read it
						if(bs.getList().searchContactList(id) != null) // If Contact is found...
						{
							System.out.println(bs.getList().searchContactList(id));
							System.out.println("Enter the number for what you want to edit:");
							System.out.println(" (1) User ID\n (2) Name\n (3) Phone Number\n (4) Email\n (5) Street Name\n "
									+ "(6) City\n (7) State\n (8) Zip Code"
									+ "\n (9) Country\n(10) Photo Name");
							int result = input.nextInt();
							
							System.out.println("Please enter the new data");
							String updateString = input.nextLine();
							updateString = input.nextLine();
					
							bs.getList().updateContact(id, result - 1, updateString);
						} 
						else 
						{	
							System.out.println("Error: ID was not found within the system");
						}
					} 
					else 
					{
						System.out.println("Error: ID was not found within the system");
					}
				}
				else if(edit == 4)
				{
					System.out.println("Program has ended...");
					System.exit(0);
				}
			}
			else if(choose == 3)
			{
				start = false;
				System.out.println("Program has ended...");
			}
		}
	}
}
