import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Group the Anagrams together:

public class GroupAnagram {
  
  public static boolean anagram(String str1, String str2){
    
    if(str1.length()!=str2.length()){
      return false;
    }
    Arrays.sort(str1.toCharArray());
    Arrays.sort(str2.toCharArray());
    if(str1.equals(str2)){
      return true;
    }
    return false;
  }


  public static void main(String[] args){

 
  List<String> words=new ArrayList<String>();
    
  words.add("Rat");
  words.add("tar");
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
  words.add("etats");
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

  List<String> result=new ArrayList<String>();

  for(int i=0;i<words.size()-1;i++){
    for(int j=i+1;j<words.size()-2;j++){
      // System.out.println(words.get(i));
      // System.out.println(words.get(j));
      if(anagram(words.get(i),words.get(j))){
        result.add(words.get(i)+" "+words.get(j));
      }
    }
  }

  System.out.println(result);
}
}


