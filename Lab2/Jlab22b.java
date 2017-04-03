class Jlab2b2

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			


 
{
    public static void main(String[] args)
	{

	    double creditAmount;
		double payBack;	
		double intrest;	      
	    					    		
		System.out.print("Enter the amout of credit ->  "); 
		creditAmount = EasyIn.getDouble(); 
				
	
		
		if (creditAmount <= 500)
		{
			
			intrest = (creditAmount / 100) * 12;				
			payBack = creditAmount + intrest;
								
			System.out.println("  Your intrest is ->  " + intrest); 	
			System.out.println("  Your amout to pay back is ->  " + payBack); 
		}	
		
		else if (creditAmount >= 500)
		{
				
			intrest = (creditAmount / 100) * 18;				
			payBack = creditAmount + intrest;
								
			System.out.println("  Your intrest is ->  " + intrest); 	
			System.out.println("  Your amout to pay back is ->  " + payBack); 
		   
		}		

		
		
	}
}
