public class StringReverse{

 public static void main(String args[] ){
      
StringBuffer str= new StringBuffer("abcd");
      System.out.println(str);
      str.reverse();
      System.out.println(str);
 
      // another method
      String s= "second";
      char[] a= s.toCharArray();
//      char[] temp = new char[len];

      int len=s.length();
      String res="";
      for(int i=0;i<len;i++)
      {
      res=res+a[len-i-1];
      }
      System.out.println(res);
      
      
 
 }

}
