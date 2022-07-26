package com.expedia.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1- we created properties obj
    private static Properties properties=new Properties();

    static {
        // 2- get the path and store in String or directly into the fileInputStream obj
        String path = "configuration.properties";// we can skip this line and put the value directly to the FileInputStream as a parameter


        try {
            // 3- we need to open the file
            FileInputStream file = new FileInputStream(path);

            // 4- we need to load the file
            properties.load(file);

            // 5- close.file
            file.close();
        } catch (IOException e) {
            System.out.println("Properties file not found");
        }

    }

    // Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }






}
