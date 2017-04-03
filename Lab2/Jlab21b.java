class Jlab2b1

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			
 
{
    public static void main(String[] args)
	{

	    double oldPremium;
	    double numOfClaims;
	    double increase;
	    double basicPremium;
	    double discount;
	    double newPremium;
	    double extraCharge;
	   			    		
		System.out.print("Enter last years Premium ->  "); 
		oldPremium = EasyIn.getDouble(); 
		
		System.out.print("Enter the number of times you claimed last year ->  "); 
		numOfClaims = EasyIn.getInt(); 
			
		////Calc
		increase = (oldPremium / 100) * 5;
		basicPremium = oldPremium + increase;
		if (numOfClaims == 0)
			{
				discount = (increase / 100) * 40;				
				newPremium = basicPremium - discount;
									
				System.out.println("  New Basic Premium  " + basicPremium); 
				System.out.println("  Minus Discount ->  " + discount);
				System.out.println("  New Premium ->  " + newPremium); 	
			}	
		
		else if (numOfClaims > 0)
			{	
			   extraCharge = numOfClaims * 20;
			   extraCharge = (basicPremium / 100) * extraCharge;
			   newPremium = extraCharge + basicPremium;
			   
			   System.out.println("  New Premium ->  " + newPremium);  
			}		
	}
}