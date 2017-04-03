class Jlab47

//Student Name : 		Rory Garner
//Student Id Number : 	C00193506
//Date :				Year 1 2014
//Purpose : 			


{
    public static void main(String[] args)
	{

		String name;

		System.out.print("\nEnter your full name: "); 
		name = EasyIn.getString();
		

		char i = 'a';//getting the character by itself
        int counter=0;
        for(int index= 0; index< name.length(); index++)
        {
            char chars = name.charAt(index);
            if (chars==i)//comparing the chosen character to each character in the string
                counter++;//keeping track of how many times you find a match
        }
        
        System.out.println("\nThere is " + counter + " A's and a's in your name. ");

	}
}


