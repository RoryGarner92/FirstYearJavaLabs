class Jlab11 
// Student Name : 		Rory Garner
// Student Id Number : 	C00193506
// Date :				19/09/14
// Purpose : 			Convert it to centimetres.
 
{
    public static void main(String[] args)
	{
	    double inche; 
		double centimetre;  
	    		
		System.out.print("Enter the size in inches ->  "); 
		
		inche = EasyIn.getDouble(); 
		centimetre = inche  * 2.54; 
	
	    System.out.println( inche + "inches converts to  " + centimetre + " centimetres"); 
	}
}