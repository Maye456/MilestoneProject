package DataAccess;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class is an interface that implements 
 * the Data Access Service class to read and 
 * write the data
 */

import Model.AddressBook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import BusinessServices.ContactAppBusinessService;

public class FileIOService implements DataAccessService 
{
	@Override
	public AddressBook readAllData() 
	{
//		ObjectMapper om = new ObjectMapper();
//		try
//		{
//			// convert JSON file to map
//			List<ContactAppBusinessService> contacts = Arrays.asList(om.readValue(Paths.get("contactList.json").toFile(), ContactAppBusinessService[].class));
//			// print map entries
//			contacts.forEach(System.out::println);
//
//		} catch (Exception ex) {
//		    ex.printStackTrace();
//		}
		
		AddressBook list = new AddressBook();
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
	public void writeAllData(ContactAppBusinessService bs) 
	{	
		ObjectMapper om = new ObjectMapper();
		
		try 
		{
			om.writerWithDefaultPrettyPrinter().writeValue(new File("contactList.json"), bs);
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
	}
}

//try 
//{
//	ObjectMapper om = new ObjectMapper();
//	InputStream inputstream = new FileInputStream(new File("contactList.json"));
//	TypeReference<List<ContactAppBusinessService>> typeReference = new TypeReference<List<ContactAppBusinessService>>() {};
//	List<ContactAppBusinessService> contacts = om.readValue(inputstream, typeReference);
//	for (ContactAppBusinessService p: contacts)
//	{
//		System.out.println(p.getList());
//	}
//} 
//catch (FileNotFoundException e)
//{
//	e.printStackTrace();
//} catch (JsonParseException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} catch (JsonMappingException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
