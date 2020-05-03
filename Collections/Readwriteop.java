 import java.util.*;

public class Readwriteop{
    
public void setImplementation(){
    Set<Integer> setEle=new HashSet<Integer>();
    for(int i =0;i< 10;i++)
    setEle.add(i);
    for(int i:setEle)
    System.out.println(i);
    
}
public void listImplementation(){
    List<Object> listEle=new ArrayList<Object>();  
listEle.add(10);
listEle.add("added objects");
listEle.add(11.11);
for (int i=0;i<listEle.size();i++)
System.out.println(listEle.get(i));
}
public void mapImplementation(){
    Map<Integer, String> mapEle = new HashMap<Integer, String>();
    mapEle.put(1,"HTML");
    mapEle.put(2,"PHP");
    for( int i : mapEle.keySet())
    System.out.println(""+i+"->"+ mapEle.get(i));
}
public static void main(String []args){
Readwriteop op= new Readwriteop();
op.setImplementation();
op.listImplementation();
op.mapImplementation();


}
}
