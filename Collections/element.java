 import java.util.*;

public class element{
public static void main(String []args){

element ele= new element();
ArrayList<Object> listele=new ArrayList<Object>();  
listele.add(10);
listele.add("added objects");
listele.add(ele);
listele.add(11.11);

listele.forEach(i -> System.out.println(i));
}
}
