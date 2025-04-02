package utills;

import java.util.Date;

public class CommonUtills 
{

	 public static String getEmailTimeStamp()
     {
    	 Date date = new Date();
    	 
    	 return "abc"+ date.toString().replace(" ",":").replace(" ", ":") +"@gmail.com";
     }

}
