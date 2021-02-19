
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ReturnUniqueInts {

  


  public static void main(String[] args){
    List<Integer> list = Arrays.asList(1,2,3,4,4,4,4,1);

		Set<Integer> distinct = new HashSet<>(list);
		for (Integer s: distinct) {
			System.out.println(s + ": " + Collections.frequency(list, s));
		}
  }
}
