package BusinessServices;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class stores the data from the Address Book
 * Class and puts it into a new array for the
 * program to use it in the Main Program. It will save it
 * and load the contacts.
 */

import DataAccess.DataAccessService; 
import DataAccess.FileIOService;
import Model.AddressBook;

public class ContactAppBusinessService 
{
	// An object to hold global variables & methods to persist data.
	public AddressBook list;
	
	public ContactAppBusinessService(AddressBook list)
	{
		super();
		this.list = list;
	}

	public ContactAppBusinessService()
	{
		super();
		this.list = new AddressBook();
	}

	public void saveAllContacts() // Write all data to the file/database
	{
		DataAccessService das = new FileIOService();
		das.writeAllData(this);
	}
	
	public void loadAllLists() // Read data from file/database
	{
		DataAccessService das = new FileIOService();
		das.readAllData();
		System.out.println(list.getContactList().toString());
	}

	public AddressBook getList()
	{
		return list;
	}
	
	public void setList(AddressBook list)
	{
		this.list = list;
	}
}
