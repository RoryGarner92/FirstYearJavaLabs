class Jlab72

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{   
// Void method to fill the array 
	public static void fillArray(int numArray[])
	{    
		int index;
		int arraySize;
	
		arraySize = numArray.length-1;		
    
		for (index = 0; index <= arraySize; index ++)
	    		{
	    			System.out.print("\nEnter number " + (index + 1) + " : "); 
					numArray[index] = EasyIn.getInt();
	    		}
	}
    // Void method to fill the array 
	public static void highAndLow(int numArray[])
	{    
		int index;
		int arraySize;
		int biggest=0;
		int smallest=0;
		
		arraySize = numArray.length-1;
		
		biggest = numArray[0];
		smallest = numArray[0];
    
		for (index = 0; index <= arraySize; index ++)
    		{
				if(numArray[index] > biggest)
					{
						biggest = numArray[index];	
					}
				if(numArray[index] < smallest)
					{
						smallest = numArray[index];
					}
    		}
    		
    		System.out.print("\n smallest number is " + smallest + " "); 
    		System.out.println("\n biggest number is " + biggest + " "); 
	}
		
	// Main method
    public static void main(String[] args)
    {		
   		
   		int numArray[];
    	int numOfNums;
	    
    	System.out.print("\nHow many numbers in the array ?: "); 
		numOfNums = EasyIn.getInt();
		
		numArray = new int[numOfNums]; 
		fillArray(numArray); 
		
		highAndLow(numArray);
                          
    }

}
