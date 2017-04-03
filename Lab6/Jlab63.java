class Jlab63

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{
	
    public static void main(String[] args)// Main method
    {
		String enteredString=""; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a string and ill tell you the number of alphabetic characters in that string. \n\n");
		enteredString = EasyIn.getString();
		
		System.out.println(alphaCount(enteredString));  
		                               
    }
    
   
	public static int alphaCount(String enteredString)
	{
	
	int countValid=0;
	int x=0;
	
        for(x=0; x < enteredString.length(); x++) 
        {
        	if(enteredString.charAt(x) >= 'a' && enteredString.charAt(x) <= 'z' || enteredString.charAt(x) >= 'A' && enteredString.charAt(x) <= 'Z' ) 
	     	{
	     		countValid++; // If current char A-z count as valid
	     	}	     	
        }
        return countValid;    
	}
}
