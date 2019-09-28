package com.kpmg.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class App 
{
    public static void main( String[] args )
    {
       ResourceBundle resourceBundle = ResourceBundle.getBundle("demo",Locale.getDefault());
       String msg=resourceBundle.getString("msg");
       System.out.println(msg);
    }
}
