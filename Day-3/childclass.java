//inheritance
class parentclass{
    protected String str="Good morning";
    protected int a=10;
    int b=20;
    private void nowishes()
    {
        System.out.println(" private parent method");
    }
    protected void wishes(){
        System.out.println(" protected parent method");
    }
    
    public void wish(){
        System.out.println(" parent class wish method");
    }
}
public class childclass extends parentclass{
    // @Override
    // void wishes(){
    //     System.out.println("wishes child class method");
    // }
    // @Override 
    //void nowishes(){
    //    System.out.println("child class nowishes method");
    //}
    
    @Override
    public void wish(){
        System.out.println("child class wish method");
    }
    
   public static void main(String args[]){
       childclass c = new childclass();
       c.wish();
       c.wishes();
       System.out.println(c.str);
       int sum= c.b+c.a;
       System.out.println("sum of integers" + sum);
       //   System.out.println(c.a); // private members
    
   }
    
    
}
