import java.util.Scanner;
public class BursaryQualificationChecker
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int iMark1, iMark2, iMark3, iMark4;
		int iAverage = 0;
		boolean flag1 = false , flag2 = false , flag3 = false;
		
		System.out.println("Enter all Marks: ");
		iMark1 = input.nextInt();
		iMark2 = input.nextInt();
		iMark3 = input.nextInt();
		iMark4 = input.nextInt();
		
		iAverage = (iMark1+iMark2+iMark3+iMark4)/4;
		
		if(iAverage >= 65)
		{
			flag1 = true;
		}
		
		if(iMark1 >=50 && iMark2 >=50 && iMark3 >=50 && iMark4 >=50)
		{
			flag2 = true;
		}
		
		if(iMark1 >=70 || iMark2 >=70 || iMark3 >=70 || iMark4 >=70)
		{
			flag3 = true;
		}
		
		if(flag1 && flag2 && flag3)
		{
			System.out.println("Your average is "+iAverage);
			System.out.println("Congrats you qualify for the bursary");
		}
		else
		{
			System.out.println("Sorry you do not qualify for the bursary");
		}
	}
}