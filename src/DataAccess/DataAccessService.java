package DataAccess;

import java.util.ArrayList;

import BusinessServices.ContactAppBusinessService;
import Model.AddressBook;
import Model.BaseContact;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an interface that retains the
 * data from the File Access Service class
 */

public interface DataAccessService 
{
	public ContactAppBusinessService readAllData();
	public void writeAllData(ContactAppBusinessService list);
}
