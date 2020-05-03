 import java.util.*;

public class Element{
public static void main(String []args){

Element ele= new Element();
ArrayList<Object> listele=new ArrayList<Object>();  
listele.add(10);
listele.add("added objects");
listele.add(ele);
listele.add(11.11);

listele.forEach(i -> System.out.println(i));
}
}
