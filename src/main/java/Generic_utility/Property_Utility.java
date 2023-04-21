package Generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {

	public String getKeyValue(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/propertydata.properties");
		Properties p=new Properties();
		p.load(fis);
		String value= p.getProperty(key);
		return value;
	}
}
