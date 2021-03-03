//Find anagram in the list of words
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindAnagramInTheList {
  

  public static boolean isValid(String str1, String str2){
    
    char[] arr1 =(str1.toLowerCase()).toCharArray();
    char[] arr2 =(str2.toLowerCase()).toCharArray();

   Arrays.sort(arr1);
   Arrays.sort(arr2);
   return Arrays.equals(arr1, arr2);
  
  }

  public static void printList(Map<String,String> mapList){
    for (Entry<String, String> entry : mapList.entrySet()) {
      System.out.println(entry.getKey() + "=" + entry.getValue());
  }
  }

  public static void main (String[] args){


    List<String> words=new ArrayList<String>();
    Map<String,String> map=new  HashMap<String,String>();
  
    
    words.add("Rat");
    words.add("Car");
    words.add("Below");
    words.add("Tast");
    words.add("Cried");
    words.add("Study");
    words.add("Thing");
    words.add("Chin");
    words.add("Grab");
    words.add("Act");
    words.add("Robed");
    words.add("Vase");
    words.add("Glean");
    words.add("Desserts");
    words.add("Tar");
    words.add("Arc");
    words.add("Elbow");
    words.add("State");
    words.add("Cider");
    words.add("Dusty");
    words.add("Night");
    words.add("Inch");
    words.add("Brag");
    words.add("Cat");
    words.add("Bored");
    words.add("Save");
    words.add("Angel");
    words.add("Streseed");
 
    for(int i=0;i<words.size();i++){
      String tmp=words.get(i);
      for(int j=i;j<words.size();j++){  
         if(isValid(tmp,words.get(j)) && !tmp.equals(words.get(j))){
          map.put(tmp, words.get(j));
       }
      }
    }
    printList(map);
  }
}
