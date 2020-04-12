
import java.util.Scanner;

class checkprimenumber {
public static void main(String []args){

int temp;
boolean isprime= true;
Scanner scanner = new Scanner(System.in);

System.out.println("Enter any number");

int number=scanner.nextInt();

for (int i=2;i<=number/2;i++)
{

temp=num%i;
if(temp==0)

{
isprime=false;
break;
}
}

if(isprime)
{
System.out.println("It is a prime number");
}
else
{
 System.out.println("It is not a prime number");
}

}

}
 
