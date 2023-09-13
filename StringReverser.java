import java.util.Scanner;
public class StringReverser
{
	public static String stReverse(String inputStr)
	{
		String reversedStr = " ";
		for(int i = inputStr.length() - 1; i >= 0; i--)
		{
			reversedStr += inputStr.charAt(i);
		}
		return reversedStr;
	}
	public static void displayReverse(String reversedStr)
	{
		System.out.println("The reversed string is "+ reversedStr);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputStr, reversedStr;
		
		System.out.println("Enter any text:");
		inputStr = input.nextLine();
		reversedStr = stReverse(inputStr);
		displayReverse(reversedStr);
		
	}
}