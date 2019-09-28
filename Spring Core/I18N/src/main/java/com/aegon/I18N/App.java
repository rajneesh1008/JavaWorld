package com.aegon.I18N;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;


public class App 
{

    
    	public static void main(String[] args) throws FileNotFoundException, IOException {
    		
    		Properties properties = new Properties();
    		Locale locale = Locale.getDefault();
    		String fileName="demo_"+locale.getLanguage()+"_"+locale.getCountry()+".properties";
    		properties.load(new FileInputStream(fileName));
    	
    		/*Locale locale = Locale.getDefault();
    		System.out.println(locale.getCountry());
    		System.out.println(locale.getLanguage());*/
    	}
    

    }


