package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/12/2020
 * This Class will store all Person & Business Contact
 * in an array. It will add, delete, edit, and search for
 * the contacts.
 */

import java.util.ArrayList;  
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBook // Main Data Storage for entire app. Demonstrates use of generic.
{
	private ArrayList<BaseContact> contactList = new ArrayList<BaseContact>();

	public AddressBook(ArrayList<BaseContact> contactList)
	{
		super();
		this.contactList = contactList;
	}
	
	// Default Constructor creates empty list of Base Contacts
	public AddressBook()
	{
		this.contactList = new ArrayList<BaseContact>();
	}

	// Getters & Setters
	public ArrayList<BaseContact> getContactList()
	{
		return this.contactList;
	}

	public void setContactList(ArrayList<BaseContact> contactList)
	{
		this.contactList = contactList;
	}
	
	// Add one person/business contact to the list
	// Duplicate overloaded methods for each class (Person and Business)
	public <T extends BaseContact> void addOne(T contact)
	{
		this.contactList.add(contact);
	}

	// Remove a Contact from main list. Return true for success, false for failure
	public <T extends BaseContact> boolean deleteOne(T contact)
	{
		if(this.contactList.contains(contact))
		{
			this.contactList.remove(contact);
			return true;
		}
		else
		{
			return false;
		}
	}

	// Search Contact List by Letter
	public ArrayList<BaseContact> searchContactList(String character)
	{
		ArrayList<BaseContact>searchList = new ArrayList<BaseContact>();

		for(int i = 0; i < this.contactList.size(); i++)
		{
			if(this.contactList.get(i).getName().startsWith(character) || 
					this.contactList.get(i).getCity().matches(character) || 
					this.contactList.get(i).getStreetName().matches(character) || 
					this.contactList.get(i).getCountry().matches(character) ||
					this.contactList.get(i).getState().matches(character))
			{
				searchList.add(this.contactList.get(i));
			}
		}
		if(!searchList.isEmpty())
		{
			return searchList;
		}
		else
		{
			return null;
		}
	}
	
	// Search Contact List by ID#
	public ArrayList<BaseContact> searchContactList(int id)
	{
		ArrayList<BaseContact>searchList = new ArrayList<BaseContact>();
		
		for(int i = 0; i < this.contactList.size(); i++)
		{
			if(this.contactList.get(i).getUserID() == id)
			{
				searchList.add(this.contactList.get(i));
			}
		}
		if(!searchList.isEmpty())
		{
			return searchList;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteContact(String character) 
	{
		for(int i = 0; i < this.contactList.size(); i++)
		{
			if(this.contactList.get(i).getName().matches(character))
			{
				this.contactList.remove(i);
			}
		}
	}

	public void updateContact(int id, int section, String updateTo) 
	{
		for(int i = 0; i < this.contactList.size(); i++) 
		{
			if(this.contactList.get(i).getUserID() == id) 
			{
				// Create new contact
				BaseContact newContact = this.contactList.get(i);
				switch(section) 
				{
					case 0: // UserID
						newContact.setUserID(Integer.parseInt(updateTo));
						break;

					case 1: // Name
						newContact.setName(updateTo);
						this.contactList.set(i, newContact);
						break;

					case 2: // phoneNumber
						newContact.setPhoneNumber(updateTo);
						break;

					case 3: // email
						newContact.setEmail(updateTo);
						break;

					case 4: // streetName
						newContact.setStreetName(updateTo);
						break;

					case 5: // city
						newContact.setCity(updateTo);
						break;

					case 6: // state
						newContact.setState(updateTo);
						break;

					case 7: // zipCode
						newContact.setZipCode(updateTo);
						break;

					case 8: // country
						newContact.setCountry(updateTo);
						break;

					case 9: // photoName
						newContact.setPhotoName(updateTo);
						break;
				}
				this.contactList.set(i, newContact);
				break;
			}
		}
	}
}
