public class exceptionexample implements Runnable{
String name;
Thread t;

exceptionexample(String tname){
name= tname;
t=new Thread(this,name);
System.out.println(name);
}

public void run(){
    try{
System.out.println("try block");

Thread.sleep(1000);

}
catch (InterruptedException e)
{
     System.out.println("catch block");

}
    
    
}

public static void main(String args[]) throws Exception{

exceptionexample exp= new exceptionexample("Thread 1");
exp.t.start();
exp.t.run();
exceptionexample exp1= new exceptionexample("Thread 2");


exp1.t.start();


try {
        System.out.println("Try block");
    throw new Exception("exception");
}
catch( Exception e)
{
    System.out.println("catch block for main method");
}
 finally{
 
System.out.println("main method");
 }
}
}
