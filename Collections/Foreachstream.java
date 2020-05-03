import java.util.*;

public class Foreachstream{
public static void main(String []args){

List<Integer> listEle=new ArrayList<Integer>();  
listEle.add(10);
listEle.add(11);
listEle.add(5);
listEle.add(7);

listEle.stream().forEach(ele -> System.out.println(ele));
}
}
