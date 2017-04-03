class Jlab21

//Student Name : 		Rory Garner
//Student Id num : 		C00193506
//Date :				Year 1 2014
//Purpose : 			

{
    public static void main(String[] args)
	{
	    int num; 
					    		
		System.out.print("Enter the first num ->  "); 
		num = EasyIn.getInt(); 
		
		if (num > 0)
			{
				System.out.println( num + " Is greater then 0."); 
			}
		else if (num < 0)
			{
				System.out.println( num + " Is less then 0."); 
			}
		else
			{
				System.out.println( num + " Is equal to 0."); 
			}		    
	}
}