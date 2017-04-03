class Jlab44

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

 
{
    public static void main(String[] args)
	{
		String name; 
    	int upperCase=0;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
	
		for (int k = 0; k < name.length(); k++) 
			{
	   			 // Check for uppercase letters.
	    		if (Character.isUpperCase(name.charAt(k))) upperCase++;
			}
		System.out.print("There are " + upperCase + " uppercase letters");
	}
}
