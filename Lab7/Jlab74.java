class Jlab74
//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{   
    // Void method to fill the array 
	public static void fillArray(char[] charArray)
	{    
		int index;
		int arraySize;
	
		arraySize = charArray.length-1;		
    
		for (index = 0; index <= arraySize; index ++)
	    		{
	    			System.out.println("\nEnter charater " + (index + 1) + " : "); 
					charArray[index] = EasyIn.getChar();
					System.out.println("\nChar " + charArray[index] + " Pos:" + index +""); 
	    		}
	}
	// Main method
    public static void main(String[] args)
    {		
   		
   		char charArray[];
    	int charInput;
	    
    	System.out.print("\nPlease enter the amout of charaters you need to enter: "); 
		charInput = EasyIn.getInt();
		
		charArray = new char[charInput]; // SET numArray[numOfNums]
		fillArray(charArray); // PASS the array strcture to be filled by user
	
		System.out.print(" " +  charArray[0]); 
		System.out.print(" " +  charArray[1]); 
		System.out.print(" " +  charArray[2]); 
           
    }

}
