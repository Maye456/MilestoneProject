package DataAccess;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an interface that implements 
 * the Data Access Service class to read and 
 * write the data
 */

import BusinessServices.ContactAppBusinessService;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileIOService implements DataAccessService 
{
	@Override
	public ContactAppBusinessService readAllData() 
	{
		ContactAppBusinessService list = new ContactAppBusinessService();
		
		try 
		{
			list = new ObjectMapper().readerFor(ContactAppBusinessService.class).readValue(new File("contactList.json"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean writeAllData(ContactAppBusinessService contactApp) 
	{
		ObjectMapper om = new ObjectMapper();
		try 
		{
			om.writerWithDefaultPrettyPrinter().writeValue(new File("contactList.json"), contactApp);
		} 
		catch (JsonGenerationException e) 
		{
			e.printStackTrace();
		} 
		catch (JsonMappingException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
}
