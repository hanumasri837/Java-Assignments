import java.util.Scanner;

public class factorial

{

 public static int factorial(int n){
 	if (n==0){
 		return 1;
 	}
 	return n* factorial(n-1);
 }
 public static void main(String []args)

{

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number to find its factorial");

int number=scanner.nextInt();

 System.out.println("Factorial of "+number+"is"+factorial(number));


}

}
