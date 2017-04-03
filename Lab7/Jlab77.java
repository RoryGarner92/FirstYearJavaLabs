class Jlab77

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{   

    // Void method to fill the array 
	public static void fillArray(String stringArray[])
	{    
		int index;

		for (index = 0; index <= stringArray.length-1; index ++)
    		{
    			System.out.print("\nEnter string #" + (index + 1) + " at position " + (index) + " : "); 
				stringArray[index] = EasyIn.getString();	
    		}
	}

	//List out all the names in the array
	public static void listNames(String stringArray[])
	{
		for (int index = 0; index < stringArray.length; index ++)
	    		{
	    			System.out.println(stringArray[index]);	
	    		}
	    			
	}
    // Void method to compare two strings
	public static void compareStrings(String stringArray[])
	{    
		int index;
		int index2;

		for (index = 0; index < stringArray.length; index ++)
    		{
    			for (index2 = 0; index2 < 1; index2 ++)
    			{
						 		
					if(stringArray[index].charAt(index2) == stringArray[index].charAt(index2+1))
					{
						System.out.println("\nThe string with first and second chars the same is "+ stringArray[index] +" and its at position " + index + ""); 
					}
    			}
    		}
	}	
		
	// Main method
    public static void main(String[] args)
    {		
   		String stringArray[];
    	int stringSize;
	    
    	System.out.print("\nEnter the number of characters: "); 
		stringSize = EasyIn.getInt();
		
		stringArray = new String[stringSize]; 
		fillArray(stringArray); 
		
		// I output the filled array for the craic.
		
		System.out.println("");
		System.out.println("========THE FILLED ARRAY IS===========");	
		listNames(stringArray);  
		System.out.println("======================================");		
		
		compareStrings(stringArray);  
    }
}
