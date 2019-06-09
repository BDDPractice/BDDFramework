package constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigFileReader {

	//THIS IS THE MAIN METHOD HOLD ALL METHODS
	
	//We create an object of webdriver and make it public static to be accessable through out the framewrok
	public static WebDriver driver;
	
	
	//properties can be accessible through out the framework 
	public static Properties properties;
	
	//path for property file 
    private final String propertyFilePath = "C:\\Users\\alisi\\eclipse-workspace\\BDDTestFramework\\src\\test\\resources\\Configs\\configurations.properties";
    
    //Use public to accessible the properties
    /*
     * This is constructor
     */
    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    /**
     * This method return driver path for drivers
     * @return
     */
    public static String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null)
            return driverPath;
        else
            throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }
/**
 * This method return implicit wait time
 * @return
 */
    public static long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null)
            return Long.parseLong(implicitlyWait);
        else
            throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }
    /**
     * This method return application URL
     * @return
     */
    public static String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    
    /**
     * this method return the path for extent report
     * @return
     */
    public static String getReportConfigPath(){
   	 String reportConfigPath = properties.getProperty("reportConfigPath");
   	 if(reportConfigPath!= null) return reportConfigPath;
   	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
   	}
    	
    /*
     * this method get the url and initialize the browser
     */
    public static void initialization() {
    	driver.get(getApplicationUrl());
    	
    }
    
    
}
