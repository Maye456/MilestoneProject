package DataAccess;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an interface that retains the
 * data from the File Access Service class
 */

import BusinessServices.ContactAppBusinessService;

public interface DataAccessService 
{
	public ContactAppBusinessService readAllData();
	boolean writeAllData(ContactAppBusinessService contactApp);
}
