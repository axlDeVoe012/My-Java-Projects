
	/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Kulan
 */
import java.util.Scanner;
public class VowelCounter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        Scanner kb = new Scanner(System.in);
        int messageLength = 0;
        int numVowels = 0;
        int numConsonants = 0;
        int numDigits = 0, numSpecialChar = 0;
        int numWords = 0;
        
        String message;
        String word ="";
        char c;
        
        System.out.print("Enter full name(s) and surname : ");
		message = kb.nextLine();
        
        messageLength = message.length();
        System.out.println("The lenght of the sting is: "+messageLength);
        for(int i = 0; i < messageLength; i++)
        {
            c = message.charAt(i);
            if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u')
            { 
                numVowels++;
                
            }
           else if(c !='a'&&c !='e'&&c !='i'&&c !='o'&&c !='u')
            {
                numConsonants++;
                
            }
           else if(Character.isDigit(c))
            {
                numDigits++;
                
            }
           else if(!Character.isLetterOrDigit(c) ==true)
            {
                numSpecialChar++;
                
            }
           if(!Character.isWhitespace(c))
            {
                word += c;
            }
            else
            {
                word ="";
                numWords++;
            }
            
        }
		if(!word.isEmpty())
			{
				numWords++;
			}
        System.out.println("The number of vowels is: "+numVowels);
		System.out.println("The number of consonants is: "+numConsonants);
		System.out.println("The number of digits is: "+numDigits);
		System.out.println("The number of special characters is: "+numSpecialChar);
		System.out.println("The number of words is: "+numWords);
    }
}

