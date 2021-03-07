// Question: Given an String find the pattern and print the next character of the pattern if no pattern is present print
// exception
// "ababac" - > Exception
// "ababab" --> a
// "abcab" --> c
// "aaaaa" --> a

import java.util.HashMap;
import java.util.Map;

public class FindPattern{


    public static void result(String p, String str){
      String modified = str.replace(p," ");
      if(modified.trim().length()>=p.length()){
        System.out.println("Exception");
      }else if(p.length()>modified.trim().length()){
            String missing=p.substring(modified.trim().length(),p.length());
            System.out.println("The missing pattern characters are :"+missing);
      }
    }

    public static void findPattern(Map<Integer, CharSequence> patternMap, String str){ 
      String p="";
      for (Map.Entry<Integer, CharSequence> entry : patternMap.entrySet()) {
        int patternSize = entry.getValue().length();
        String currentP=entry.getValue().toString();
          if(str.subSequence(patternSize, str.length()).toString().matches(currentP)
          || str.subSequence(patternSize, str.length()).toString().startsWith(currentP)
          ||  currentP.contains(str.subSequence(patternSize, str.length()).toString())){
            p =entry.getValue().toString();
            System.out.println(entry.getValue().toString() +" is a repeated pattern");
            result(p, str);
            break;
          }
      }
    }
    public static void mapPattern(String str){

      Map<Integer, CharSequence> map=new HashMap<Integer,CharSequence>();
      int counter=1;
      for(int i=0;i<str.length()-1;i++){
          map.put(i,str.subSequence(0,counter));
          counter++;
      }
      System.out.println(map);

      findPattern(map, str);

    }
  
  public static void main (String[] args){
  
    String input = "ababac";
    
    mapPattern(input);
   
  }
}
