class parentclass{
    String str="Good morning" ;
    public void wish(){
        System.out.println("parent class wish method");
    }
}
public class childclass extends parentclass{
    @Override
    public void wish(){
        System.out.println("child class wish method");
    }
    
   public static void main(String args[]){
       childclass c = new childclass();
       c.wish();
       System.out.println(c.str);
    
   }
    
    
}
