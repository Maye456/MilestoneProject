package DataAccess;

import BusinessServices.ContactAppBusinessService;
import Model.AddressBook;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an interface that retains the
 * data from the File Access Service class
 */

public interface DataAccessService 
{
	public AddressBook readAllData();
	void writeAllData(ContactAppBusinessService bs);
}
