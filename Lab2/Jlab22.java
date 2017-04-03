class Jlab22

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

 
{
    public static void main(String[] args)
	{

	    double progMark;
	    double mathsMark; 
	    double hwMark; 
	    double averageMark;
					    		
		System.out.print("Enter your programming mark ->  "); 
		progMark = EasyIn.getDouble(); 
		
		System.out.print("Enter your maths mark ->  "); 
		mathsMark = EasyIn.getDouble(); 
		
		System.out.print("Enter your hardware mark ->  "); 
		hwMark = EasyIn.getDouble(); 
		
		averageMark = (progMark + mathsMark + hwMark) / 3;
		
		
		if ( averageMark >= 0 && averageMark <= 39 )
		{
			System.out.println("Sorry, You failed !"); 
		}
		else if (averageMark >= 40 && averageMark <= 53)
		{
			System.out.println("Well Done, you got a pass!"); 
		}
		else if (averageMark >= 54 && averageMark <= 62)
		{
			System.out.println("Well Done, you got a merit 2!"); 
		}		    
		else if (averageMark >= 63 && averageMark <= 69)
		{
			System.out.println("Well Done, you got a merit 1!"); 
		}	
		else if (averageMark >= 70 && averageMark <= 100)
		{
			System.out.println("Well Done, you got a distinction :D !!!"); 
		}
		else
		{
			System.out.println("Error: There was an error.");
		}
		
		System.out.println("Your average mark is ->  " + averageMark); 
		
		
	}
}
