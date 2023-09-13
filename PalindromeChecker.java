import java.util.Scanner;
public class PalindromeChecker
{
	public static boolean isPalindrome(String word)
	{
		boolean palindrome = false;
		String reversedStr ="";
		for(int i=word.length() - 1; i>=0; i--)
		{
			reversedStr +=word.charAt(i);
		}
		if(reversedStr.equals(word))
		{
			palindrome = true;
		}
		return palindrome;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputStr;
		String reversedStr = "";
		
		System.out.print("Enter any word to see if it is a palindrome: ");
		inputStr = input.nextLine();
		
		if(isPalindrome(inputStr))
		{
			System.out.println(inputStr + " is a palindrome");
		}
		else
		{
			System.out.println(inputStr + " is not a palindrome the reversed string is: "+reversedStr);
		}
		
	}
}