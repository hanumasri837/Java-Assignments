 import java.util.*;

public class readwriteop{
    
public void setimplementation(){
    Set<Integer> setele=new HashSet<Integer>();
    for(int i =0;i< 10;i++)
    setele.add(i);
    for(int i:setele)
    System.out.println(i);
    
}
public void listimplementation(){
    List<Object> listele=new ArrayList<Object>();  
listele.add(10);
listele.add("added objects");
listele.add(11.11);
for (int i=0;i<listele.size();i++)
System.out.println(listele.get(i));
}
public void mapimplementation(){
    Map<Integer, String> mapele = new HashMap<Integer, String>();
    mapele.put(1,"HTML");
    mapele.put(2,"PHP");
    for( int i : mapele.keySet())
    System.out.println(""+i+"->"+ mapele.get(i));
}
public static void main(String []args){
readwriteop op= new readwriteop();
op.setimplementation();
op.listimplementation();
op.mapimplementation();


}
}
