package Bitrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // we create properties object
    private static Properties properties = new Properties();

    static {
        // get the path of properties file and store in String or pass directly to fileInputStream obj
        String path = "configuration.properties";

        try{
            // we open the file
            FileInputStream file= new FileInputStream(path);
            // Load the file to properties object
            properties.load(file);
            // close file
            file.close();
        } catch (IOException e){
            System.out.println("Properties file not found");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
