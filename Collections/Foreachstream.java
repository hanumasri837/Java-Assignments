import java.util.*;

public class Foreachstream{
public static void main(String []args){

List<Integer> listele=new ArrayList<Integer>();  
listele.add(10);
listele.add(11);
listele.add(5);
listele.add(7);

listele.stream().forEach(ele -> System.out.println(ele));
}
}
