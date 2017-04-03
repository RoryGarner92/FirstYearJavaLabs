class Jlab43

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

 
{
    public static void main(String[] args)
	{

		String name; 
    	int noOfChars;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		
		noOfChars = name.length();
				
		System.out.println("\nThere is " + noOfChars + " charaters in your name." );

	}
}
