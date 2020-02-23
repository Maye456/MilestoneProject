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
		this.setList(list);
	}

	public ContactAppBusinessService()
	{
		super();
		this.setList(new AddressBook());
	}

	public void saveAllLists() // Write all data to the file/database
	{
		DataAccessService das = new FileIOService();
		das.writeAllData(this);
	}
	
	public ContactAppBusinessService loadAllLists() // Read data from file/database
	{
		DataAccessService das = new FileIOService();
		return das.readAllData();
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
