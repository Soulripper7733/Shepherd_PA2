import java.util.Scanner;

public class Encrypter { 

	public static char encrypt()  {
		
		String fourDigit  ; 
		int numberInput , n1 = 0, n2 = 0, n3 = 0, n4 = 0; 
		
		Scanner eN = new Scanner(System.in); //So this takes in the input
		
		fourDigit = eN.nextLine();
		numberInput = Integer.parseInt(fourDigit);
	
	if(fourDigit.length() == 4  ) {
		 
			
		n1 = numberInput / 1000; 
		n2 = numberInput / 100 % 10;
		n3 = numberInput / 10 % 10;
		n4 = numberInput % 10;
		
		n1 = (n1+7)%10;
		n2 = (n2+7)%10;
		n3 = (n3+7)%10;
		n4 = (n4+7)%10;
	System.out.print("This is the encrypted number: " + n3 + n4 + n1 + n2 );
	}
	char n6 = 0 , n7 = 0, n8 = 0, n9 = 0;
	n1 = n6;
	n2 = n7;
	n3 = n8;
	n4 = n9;

		return (char) (n6+n7+n8+n9); 
		 
	}
}
	

  