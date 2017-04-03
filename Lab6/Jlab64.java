class Jlab64

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{
	
    public static void main(String[] args)// Main method
    {
		double mark; 	
                                                                                                                                                                                                           
		System.out.println("\n Enter a mark and ill tell you your result. \n\n");
		mark = EasyIn.getDouble();
		
		award(mark);                                  
    }
    
    // returns the number of alphabetic characters in that string
	public static void award(double mark)
	{					   	
		
		if ( mark >= 0 && mark <= 39 )
		{
			System.out.println("Sorry, You failed !"); 
		}
		else if (mark >= 40 && mark <= 53)
		{
			System.out.println("Well Done, you got a pass!"); 
		}
		else if (mark >= 54 && mark <= 62)
		{
			System.out.println("Well Done, you got a merit 2!"); 
		}		    
		else if (mark >= 63 && mark <= 69)
		{
			System.out.println("Well Done, you got a merit 1!"); 
		}	
		else if (mark >= 70 && mark <= 100)
		{
			System.out.println("Well Done, you got a distinction :D !!!"); 
		}
		else
		{
			System.out.println("Error: There was an error.");
		}
		
       
	}
}
