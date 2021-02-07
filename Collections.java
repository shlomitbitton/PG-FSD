import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Collections{


  public static Set<Integer> convertArrayToSet(){
    int[] arr={6,88,0,999,999,6};
    System.out.println(Arrays.toString(arr));
    Set<Integer> s= new HashSet<Integer>();
    for(int i:arr){
      s.add(i);
    }
    System.out.println(s);
    return s;
  }

  public static void main(String[] arg){
    convertArrayToSet();
  }
}