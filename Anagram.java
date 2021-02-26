
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {

  public static void anagram(String s1, String s2) {
    String a1 = s1.toLowerCase();
    String a2 = s2.toLowerCase();
    String[] b1 = a1.split("");
    String[] b2 = a2.split("");
    for (int i = 0; i < b1.length; i++) {
      Arrays.sort(b1);
    }
    for (int i = 0; i < b1.length; i++) {
      Arrays.sort(b2);
    }
    if (Arrays.equals(b1, b2)) {
      System.out.println(s1 +" and "+ s2+ " are Anagrams");
    } else
    System.out.println(s1 +" and "+ s2+ " are not Anagrams");
  }

  public static void main(String[] args) {

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

  
    Scanner s = new Scanner(System.in);
    // System.out.println("Please type first word");
    // String s1 = s.nextLine();
    // System.out.println("Please type second word");
    // String s2 = s.nextLine();
    // int result = anagram(s1, s2);
    // if (result == 1)
    //   System.out.println("These words are Anagrams");
    // else
    //   System.out.println("These words are not Anagrams");
    // s.close();

    for(int i=0;i<words.size()-1;i++){
      anagram(words.get(i),words.get(i+1));
    }
  }

}
