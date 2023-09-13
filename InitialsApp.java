import java.util.Scanner;
public class InitialsApp
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		char fI, sI, tI=' ';
		String name;
		String remaining = "";
		String output;
		int firstSpaceIndex;
		int lastSpaceIndex;
		
		System.out.print("Enter full name(s) and surname : ");
		name = kb.nextLine().trim();
		
		firstSpaceIndex = name.indexOf(' ');
		lastSpaceIndex = name.lastIndexOf(' ');
		
		if(firstSpaceIndex != -1)
		{
			fI = name.charAt(0);
			sI = name.charAt(firstSpaceIndex + 1);
			
			fI = Character.toUpperCase(fI);
			sI = Character.toUpperCase(sI);
			
			if(firstSpaceIndex != lastSpaceIndex)
			{
				tI = name.charAt(lastSpaceIndex + 1);
				tI = Character.toUpperCase(tI);
				remaining = name.substring(lastSpaceIndex + 2);
				output = fI + "." + sI + " " + tI +remaining;
			}
			else
			{
				remaining = name.substring(firstSpaceIndex + 2);
				output = fI + ". " + sI + remaining;
			}
			
		}
		else
		{
			output = "Invalid input. Please enter at least a first name and a last name.";
		}
		System.out.println("\n" + output);
	}
}