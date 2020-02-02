import java.util.Scanner;

/*
 * Take a four digit number from the user
 * Use a Scanner to input a four digit number
 * Create a variable to hold the four digits 
 * Then take the four digits and encrypt the digits
 *  Replace each digit with the result of adding 7 to the digit 
 *  and getting the remainder after dividing the new value by 10 (%10)
 *  Then swap the first digit with the third,
 *   and swap the second digit with the fourth. 
 *  Then print the encrypted integer.
 *  Then do the same thing in the Decrypter but have to reverse the equations 
 *  and then decrypt it (by reversing the encryption scheme) to form the original number.
 */
public class Application {

	public static void main(String[] args) {
		System.out.print("Please input a four digit number to encrypt: ");
	System.out.println(Encrypter.encrypt());
	System.out.print("Please input a four digit number to decrypt: ");
	System.out.print(Decrypter.Decrypt());
	}
}

