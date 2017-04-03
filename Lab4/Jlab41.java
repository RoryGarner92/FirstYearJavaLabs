class Jlab41

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

 
{
    public static void main(String[] args)
	{

		String name; 
    	String surName;
    	int spacePos;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	surName = name.substring(spacePos + 1); 
				
		System.out.println("\nYour surname is: " + surName );

	}
}
