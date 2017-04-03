class Jlab31

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			

{
	
    public static void main(String[] args)
	{

		int selectedOption=1; 
		double fahrenheit; 
		double cent;
		double inche; 
		double centimetre;     
		double kilo; 
		double pound;  
					    					    		
			
		while (selectedOption <= 7) 
		{
			
			System.out.println("\n\n\nEnter the number of the menu option that you would like to use: \n \n 1.     Fahrenheit to celcius \n 2.	Celcius to Fahrenheit \n 3.	inche to centimetre \n 4.	centimetre to inche \n 5.	pound to Kilograms \n 6.     Kilograms to pound \n 7.     Exit the menu and program ! \n\n\n"); 
			selectedOption = EasyIn.getInt(); 

			switch (selectedOption )
			{
				// Fahrenheit to celcius
				case 1:	    		
						System.out.println("Enter the tempature in Fahrenheit ->  "); 
						fahrenheit = EasyIn.getDouble(); 
						cent = (fahrenheit - 32) * 5 / 9; 
				   		System.out.println("The tempature converted to degrees is: " + cent); 
		   		
				break;
				
				// Celcius to Fahrenheit 
				case 2: 
						System.out.println("Enter the tempature in Degrees Cent ->  "); 
						cent = EasyIn.getDouble(); 
						fahrenheit = (cent * 9 / 5) + 32; 
				   		System.out.println("The tempature converted to Fahrenheit is: " + cent); 
				break;
				// inche to centimetre
				case 3: 
						System.out.print("Enter the size in inche ->  "); 
						inche = EasyIn.getDouble(); 
						centimetre = inche  * 2.54; 			
				  		System.out.println( inche + "inche converts to  " + centimetre + " centimetre"); 
				break;
				// centimetre to inche
				case 4:
					    System.out.print("Enter the size in centimetre ->  "); 
						centimetre = EasyIn.getDouble(); 
						inche = centimetre  / 2.54; 			
				  		System.out.println( centimetre + "centimetre converts to  " + inche + " inche"); 
				break;
				// pound to Kilograms
				case 5:
					    System.out.print("Enter the size in pound ->  "); 
						pound = EasyIn.getDouble(); 
						kilo = pound  / 2.2; 			
				  		System.out.println( pound + "pound converts to  " + kilo + " kilograms"); 
				break;
				// Kilograms to pound
				case 6:
					    System.out.print("Enter the size in Kilograms ->  "); 
						kilo = EasyIn.getDouble(); 
						pound = kilo  * 2.2; 			
				  		System.out.println( kilo + " Kilograms converts to  " + pound + " pound"); 
				break;
			}
			selectedOption ++; //exit mechanism (eventually)
		}										
	}
}