/*Write a menu driven program to perform several mathematical operations. Different choices 
for the mathematical operations are as follows.
1. Determine the factorial of a number
2. Determine XN
for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
NOTE: All the mathematical operations must be performed using the recursive method.*/


import java.util.Scanner;

public class Q7 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int halfPower = power(x, n / 2);
            return halfPower * halfPower;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalToBinary(n / 2) + String.valueOf(n % 2);
        }
    }

    public static int product(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + product(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
            System.out.println("Menu:");
            System.out.println("1. Determine the factorial of a number");
            System.out.println("2. Determine XN for two numbers X, N");
            System.out.println("3. Determine GCD of two numbers");
            System.out.println("4. Binary equivalent of a decimal number");
            System.out.println("5. Product of two numbers");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int factorialResult = factorial(num);
                    System.out.println("Factorial: " + factorialResult);
                    
                    break;
                case 2:
                    System.out.print("Enter X: ");
                    int x = sc.nextInt();
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    int powerResult = power(x, n);
                    System.out.println("Result: " + powerResult);
                 
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();
                    int gcdResult = gcd(num1, num2);
                    System.out.println("GCD: " + gcdResult);
                    
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimalNum = sc.nextInt();
                    String binaryResult = decimalToBinary(decimalNum);
                    System.out.println("Binary equivalent: " + binaryResult);
                   
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int number1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int number2 = sc.nextInt();
                    int productResult = product(number1, number2);
                    System.out.println("Product: " + productResult);
                    
                    break;
                    
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

