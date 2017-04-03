class Jlab33

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

 
{
    public static void main(String[] args)
	{

		int count=0; 
		int num;
		int firstPos;
	    boolean lastPos;
	    lastPos = true;
		       	    
		    while(lastPos == false) 
			{
				System.out.print("\nEnter 0 to exit -> "); 		
				System.out.print("\nBegin entering your list of numbers. -> "); 
				num = EasyIn.getInt();
				
				if (num == 0)
				{
						lastPos = true;
				}
				
				count++;	
				
		    }

	}
}
