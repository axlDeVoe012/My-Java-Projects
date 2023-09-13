import java.util.Scanner;
public class DetermineAgeAndGender
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String name;
		String idNumber;
		String month = "";
		String gender;
		char citizenship;
		
		int age;
		int year;
		int Month;
		int day;
		int genderCode;
		int birthYear;
		final int CURRENT_YEAR = 2023;
		
		System.out.println("Please enter the person's full name: ");
		name = kb.nextLine();
		System.out.println("Please enter the person's ID number: ");
		idNumber = kb.nextLine();
		
		citizenship = idNumber.charAt(10);
		year = Integer.parseInt(idNumber.substring(0, 2));
		Month = Integer.parseInt(idNumber.substring(2, 4));
		day = Integer.parseInt(idNumber.substring(4, 6));
		genderCode = Integer.parseInt(idNumber.substring(6, 10)); 
		
		switch(Month)
		{
			case 1: month = "January";
			break;
			case 2: month = "February";
			break;
			case 3: month = "March";
			break;
			case 4: month = "April";
			break;
			case 5: month = "May";
			break;
			case 6: month = "June";
			break;
			case 7: month = "July";
			break;
			case 8: month = "August";
			break;
			case 9: month = "September";
			break;
			case 10: month = "October";
			break;
			case 11: month = "November";
			break;
			case 12: month = "December";
			break;
		}
		
		if(genderCode < 5000)
		{
			gender = "Female";
		}
		else
		{
			gender = "Male";
		}
		
		
		if(year >= 0 && year <= 21)
		{
			birthYear = 2000 + year;
		}
		else
		{
			birthYear = 1900 + year;
		}
		age = CURRENT_YEAR - birthYear;
		
		System.out.println("\nName: " + name);
		System.out.println("DOB: " + birthYear + "/" + month + "/" + day);
		System.out.println("Gender: " + gender);
		System.out.println("Age: "+age);
		
		
		
	}
}