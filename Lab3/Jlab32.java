class Jlab32 

// Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			


 
{
    public static void main(String[] args)
	{

		int num1; 
		int sum=0;
	
	    
	    

		System.out.println("Enter 1 to begin calculator. \n"); 
	    System.out.println("Enter 0 to exit at anytime. \n"); 
	    num1 = EasyIn.getInt();
		
		if (num1 == 0)
		{
			
		}
		else
		{
	    
		    while (num1 != 0) 
			{		
				System.out.print("\nEnter a number to add to the sum total. -> "); 
				num1 = EasyIn.getInt();
				
				sum = sum + num1;
				
				System.out.println("\nThe current total is -> " + sum); 
		
				
		    }
	    }
	  
	}
}
