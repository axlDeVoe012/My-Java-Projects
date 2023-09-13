import java.util.Scanner;

public class PalindromeReplacer 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        String strInput;
        int count = 0;

        String reversed = "", word = "", replacement = "";
        String currentWord = "";
        boolean isPalindrome = false;
        char c;

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence");
        strInput = input.nextLine();

        // Create an array to store individual words from the input sentence
        String[] words = new String[strInput.length()];

        // separate the input sentence into individual words
        for (int i = 0; i < strInput.length(); i++) 
		{
            c = strInput.charAt(i);
			
            if (!Character.isWhitespace(c))
			{
                word += c;
            } else 
			{
                words[count++] = word; // Store the current word in the array and reset word variable
                word = "";
            }
        }
        words[count++] = word; // So we can store the last word after the loop

        // Create an array to store reversed versions of words
        String reversedWords[] = new String[count];

        // Reverse each word and store it in the reversedWords array
        for (int index = 0; index < count; index++) 
		{
            currentWord = words[index];
            reversed = "";
            for (int i = currentWord.length() - 1; i >= 0; i--)
			{
                reversed += currentWord.charAt(i);
            }
            reversedWords[index] = reversed;
        }

        // Check if each word is a palindrome and replace it with '*' if it is
        for (int i = 0; i < count; i++)
		{
            currentWord = words[i];
            isPalindrome = false; // Resetting the truth value of isPalindrome

            // Change the truth value of isPalindrome if the word is a palindrome
            if (currentWord.equals(reversedWords[i])) 
			{
                isPalindrome = true;
            }

            if (isPalindrome)
			{
                // Replace all the characters in the input sentence with '*'
                replacement = "*".repeat(currentWord.length());
                strInput = strInput.replace(currentWord, replacement);
            }
        }

        // Print the modified sentence
        System.out.println(strInput);
    }
}
