class instanceone{
void test(){
System.out.println(" test method");
}

}

public class instanceexample extends instanceone {
public static void main(String []str){
instanceexample a= new instanceexample();
instanceexample b= null;
instanceone c= new instanceexample();

if (a instanceof instanceexample)
{
System.out.println("a is instance of instanceexample");
}
if (b instanceof instanceexample)
{
System.out.println("a is instance of instanceexample");
}
else
System.out.println("b is not instance of instanceexample");
if (c instanceof instanceexample)
{
System.out.println("c is instance of instanceexample");
}
else
System.out.println("c is not instance of instanceexample");

}
}
