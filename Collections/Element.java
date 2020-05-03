 import java.util.*;

public class Element{
public static void main(String []args){

Element ele= new Element();
ArrayList<Object> listEle=new ArrayList<Object>();  
listEle.add(10);
listEle.add("added objects");
listEle.add(ele);
listEle.add(11.11);

listEle.forEach(i -> System.out.println(i));
}
}
