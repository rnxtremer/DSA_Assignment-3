/*Write a recursive Java method that determines if a string s is a palindrome, that is, it is
equal to its reverse. 
Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'.*/


import java.util.Scanner;

public class HAQ3{
    public static boolean isPalindromeRecursive(String s) {
        if (s.length() <= 1) {
            return true; 
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar != lastChar) {
            return false;
        } else {
            
            String middleSubstring = s.substring(1, s.length() - 1);
            return isPalindromeRecursive(middleSubstring);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        boolean isPalindrome = isPalindromeRecursive(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
