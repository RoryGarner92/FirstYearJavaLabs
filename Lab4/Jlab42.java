class Jlab42

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			


 
{
    public static void main(String[] args)
	{

		String name; 
    	String firstName;
    	int spacePos;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		spacePos = name.indexOf(" ");
    	firstName = name.substring(0, spacePos); 
				
		System.out.println("\nYour surname is: " + firstName );

	}
}
