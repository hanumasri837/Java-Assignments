import java.util.*;
import java.io.*;  

class ComparatorExample{
    int age;
    String val;
ComparatorExample(int x,String y){
age=x;
val=y;
}
public String toString() 
    { 
        return this.age + " " + this.val; 
    } 

}

class Comparatorover implements Comparator<ComparatorExample>{

public int compare( ComparatorExample c1,ComparatorExample c2){  
return (c1.val).compareTo(c2.val);  
}  
}  



public class EqualsExample1{
    
    public static void main(String[] args){
     ArrayList<ComparatorExample> array= new ArrayList<ComparatorExample>();
      array.add(new ComparatorExample(21,"John") );
      array.add( new ComparatorExample(42,"Will")) ;       
      array.add( new ComparatorExample(31,"Duke")) ;
          
    System.out.println(array);

      Collections.sort(array,new Comparatorover());
      System.out.println(array);
    }
}
