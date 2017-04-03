class Jlab46

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			



{
    public static void main(String[] args)
	{

		String name; 
    	String firstName;
    	String surName;
    	int spacePos;
    	
		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	firstName = name.substring(0, spacePos); 
    	surName = name.substring(spacePos); 
    	
    	surName = new StringBuilder(surName).reverse().toString();
    	firstName = new StringBuilder(firstName).reverse().toString();
				
		System.out.println("\nYour input reversed is: " + surName + "" + firstName );

	}
}

