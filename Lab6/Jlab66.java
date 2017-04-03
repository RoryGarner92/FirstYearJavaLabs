class Jlab66

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{   


    //return the surname from the full name.
	public static String getSurname(String enteredString)
	{    
		String surName;
    	int spacePos;
    	
    	surName="";
		
		spacePos = enteredString.indexOf(" ");
    	surName = enteredString.substring(spacePos + 1); 
				
		return surName;
	}


	// return the firstname from the full name.
	public static String getFirstname(String enteredString)
	{    
		String surName;
    	int spacePos;
    	
    	surName="";
		
		spacePos = enteredString.indexOf(" ");
    	surName = enteredString.substring(0,spacePos); 
				
		return surName;
	}
	
	
	//  count the number of charaters in the string.
	public static int getNoOfChars(String enteredString)
	{    

    	int noOfChars;

		noOfChars = enteredString.length();
				
		return noOfChars;
	}
	
	
	//  count the number of upper case caharater in the string.
	public static int getNoOfUpperChars(String enteredString)
	{   	

    	int upperCase;
    	
    	upperCase=0;

		for (int k = 0; k < enteredString.length(); k++) 
		{
   			 // Check for uppercase letters.
    		if (Character.isUpperCase(enteredString.charAt(k)))
    			{
    				upperCase++;
    			}
		}

		return upperCase;
	}
	
	//take in a string and output the reverse.
	public static int reverseString(String enteredString)
	{   
    	int count;
    	int upperCase;
    	int spacePos = 0;
    	String surName;
    	upperCase=0;

		for (int k = 0; k > enteredString.length(); k++) 
			{
	   			surName = enteredString.substring(spacePos + 1); 
			}

		return upperCase;
	}	
	// Main method
    public static void main(String[] args)
    {		
    	String name; 
	    
    	System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
    
		System.out.println("\n Your surname is: " + getSurname(name) );    
		System.out.println("\n Your firstname is: " + getFirstname(name) ); 
		System.out.println("\n The number of charaters in your name  : " + getNoOfChars(name) );     
		System.out.println("\n The number of upperCase charaters : " + getNoOfUpperChars(name) );                           
    }
}