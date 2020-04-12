import java.util.Scanner;


public class factorialandfibonacci

{

 public static int factorial(int n){
 	if (n==0){
 		return 1;
 	}
 	return n* factorial(n-1);
 }
 public static int fibonacci(int n){
 	if(n<=1){
 		return n;
 	}
 	return fibonacci(n-1)+ fibonacci(n-2);
 }
 public static void main(String []args)

{

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number to find its factorial");

int number=scanner.nextInt();

 System.out.println("Factorial of "+number+"is"+factorial(number));
System.out.println("Fibonacci series for the given number"+ number+"is " + fibonacci(number));

}

}
 
