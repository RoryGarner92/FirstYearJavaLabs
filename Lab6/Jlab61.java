class Jlab61

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{
	
    public static void main(String[] args)// Main method
    {
		int number=0; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a number and I will tell you if its even or odd. \n\n");
		number = EasyIn.getInt();
		
		isEven(number);                                  
    }
    
    // Check if argument is an even or odd number.
	public static void isEven(int number)
	{
        if(number % 2 == 0) 
        {
            System.out.println("True");
        }
        else
        {
        	System.out.println("False");	
        }  
        
	}
}
