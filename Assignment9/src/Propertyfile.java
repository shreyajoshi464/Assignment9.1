import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	private Properties properties;
	private final String propertyFilePath="file//config.properties";
	
	
	public Propertyfile(){
		
	BufferedReader reader;
	
	
		try{
			reader=new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try{
				properties.load(reader);
				reader.close();
				
			}
			catch(IOException e){
				e.printStackTrace();
			}
				
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
				throw new RuntimeException("Configuration.properties file not found"+ propertyFilePath);
			}
		}
			
				
			
			public String getDriverPath(){
				String driverPath=properties.getProperty("driverPath");
				if(driverPath!=null)
					return driverPath;
				else  
					throw new RuntimeException("driverPath not specified in the Configuration properties file");
				
		
				
			}
			
			public String getApplicationUrl(){
				String url=properties.getProperty("url");
				if(url!=null)
					return url;
				else 
					throw new RuntimeException("url not specified in the Configuration.properties file");
						
			}
		
		
		
	
	}

	
