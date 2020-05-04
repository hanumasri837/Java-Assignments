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
        HashCodeexample hash= new HashCodeexample(1);
        HashCodeexample hash1= new HashCodeexample(2);
        HashCodeexample hash2= new HashCodeexample(1);
    System.out.println(hash.equals(hash1));
    System.out.println(hash.equals(hash2));

    }
}
