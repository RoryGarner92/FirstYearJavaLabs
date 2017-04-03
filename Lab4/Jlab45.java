class Jlab45

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			


{
    public static void main(String[] args)
    
	{

		String name; 
    	String surName;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
    	surName = new StringBuilder(name).reverse().toString();
				
		System.out.println("\nYour surname is: " + surName );

	}
}

