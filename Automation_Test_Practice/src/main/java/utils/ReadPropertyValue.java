package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyValue {

    public static String getPropertyValue(String key) throws IOException {
        File file = new File("src/main/resources/configuration/FrameworkConfiguration.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
      return prop.getProperty(key);

    }
}
