class Jlab62

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			
{
	
    public static void main(String[] args)// Main method
    {
		String enteredString=""; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a string and ill tell you if it only contains valid charaters (a-Z). \n\n");
		enteredString = EasyIn.getString();
		
		isAlpha(enteredString);                                  
    }
    
    // Check if argument is an even or odd number.
	public static void isAlpha(String enteredString)
	{
	
	int countValid=0;
	int x=0;
	
        for(x=0; x < enteredString.length(); x++) 
        {
        	if(enteredString.charAt(x) >= 'a' && enteredString.charAt(x) <= 'z' || enteredString.charAt(x) >= 'A' && enteredString.charAt(x) <= 'Z' || enteredString.charAt(x) == ' ' ) 
	     	{
	     		countValid++; // If current char A-z count as valid
	     	}	     	
        }
        
        if(enteredString.length() == countValid)
	    {
	    	System.out.println("True");
	    }
	    else
	    {
	    	System.out.println("False");
	    }
        
	}
}
