import java.util.*;

class HashCodeexample{
    int a;

HashCodeexample(int x){
a=x;
}
public int get(){
    return a;
}

@Override
public boolean equals(Object o){
if (this==o)
return true;

if(o==null)
return false;
if (o instanceof HashCodeexample)
{
    HashCodeexample h= (HashCodeexample) o;
    if(h.get()== this.get())
    return true;
}
  return false;

}

@Override
public int hashCode(){
    int code= (int) (this.a/11);
    return code;
}


}

public class EqualsExample{
    
    public static void main(String []args){
        ArrayList<HashCodeexample> arr= new ArrayList<HashCodeexample>();
        arr.add(new HashCodeexample(1));
        arr.add(new HashCodeexample(2));
        arr.add(new HashCodeexample(1));
        if(arr.get(1).equals(arr.get(2))){
            System.out.println("object at index1 is not equal to object at index 2");
        }
        if(arr.get(0).equals(arr.get(2))){
             System.out.println("object at index 0 equal to object at index 2");
        }


    }
}
