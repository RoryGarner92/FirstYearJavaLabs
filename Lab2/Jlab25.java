class Jlab25

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			
 
{
    public static void main(String[] args)
	{
	    int num1;
	    int num2;
	    int num3;
	    					    		
		System.out.print("Enter number One ->  "); 
		num1 = EasyIn.getInt(); 
		
		System.out.print("Enter number Two ->  "); 
		num2 = EasyIn.getInt(); 

		System.out.print("Enter number Three ->  "); 
		num3 = EasyIn.getInt(); 
					
		if ( num1 % num2 == 0 && num1 % num3 == 0 )
			{
				System.out.println("Number One is divisible by number Two and Three"); 
			}
		else
			{
				System.out.println("Number One is NOT divisible by number Two and Three");
			}	
	}
}