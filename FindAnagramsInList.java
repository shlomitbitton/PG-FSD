import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FindAnagramsInList {


  static String isAnagram(String str1, String str2){
    char[] ch1=str1.toLowerCase().toCharArray();
    char[] ch2=str2.toLowerCase().toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    if(Arrays.equals(ch1, ch2)){
      return str2;
    }
    return "";
  }


  public static void main(String[] args){
    List<String> words=new ArrayList<String>();
    HashMap<String, List<String>> hashmap = new HashMap<String, List<String>>();
    
    words.add("Rat");
    words.add("Art");
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
      hashmap.put(words.get(i),null);
    }
    
    Set<String> keys = hashmap.keySet();
    for (String key : keys) {
      for(int i=0;i<words.size();i++){  
            String st=isAnagram(key,words.get(i));
            if(!st.isEmpty()){
              hashmap.computeIfAbsent(key,k->new ArrayList<String>()).add(st);
            }
          }
    }
    System.out.println(hashmap);
}
}


