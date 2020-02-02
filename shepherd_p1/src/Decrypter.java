import java.util.Scanner;

public class Decrypter {

	public static char Decrypt( ) {
		String dfourDigit  ; 
		int dnumberInput , dn1 = 0, dn2 = 0, dn3 = 0, dn4 = 0; 
		
		Scanner eN = new Scanner(System.in); //So this takes in the input
		
		dfourDigit = eN.nextLine();
		dnumberInput = Integer.parseInt(dfourDigit);
	
	if(dfourDigit.length() == 4  ) {
		 
			
		dn1 = dnumberInput / 1000; 
		dn2 = dnumberInput / 100 % 10;
		dn3 = dnumberInput / 10 % 10;
		dn4 = dnumberInput % 10;
		
		dn1 = ((dn1 - 7) + 10) % 10;
		dn2 = ((dn2 - 7) + 10) % 10;
		dn3 = ((dn3 - 7) + 10) % 10;
		dn4 = ((dn4 - 7) + 10) % 10;
	System.out.print("This is the encrypted number: " + dn3 + dn4 + dn2 + dn2 );
	}
	char dn6 = 0 , dn7 = 0, dn8 = 0, dn9 = 0;
	dn1 = dn6;
	dn2 = dn7;
	dn3 = dn8;
	dn4 = dn9;

		return (char) (dn6+dn7+dn8+dn9); 
		 
	}
}
