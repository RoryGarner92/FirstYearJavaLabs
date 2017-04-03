class Jlab24

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{
    public static void main(String[] args)
	{
	    int num1;
	    int num2;
					    		
		System.out.print("Enter the first number number ->  "); 
		num1 = EasyIn.getInt(); 
		
		System.out.print("Enter the second number number ->  "); 
		num2 = EasyIn.getInt(); 
				
		if ( num1 % num2 == 0 )
			{
				System.out.println("Yes"); 
			}
		else
			{
				System.out.println("No");
			}
	}
}