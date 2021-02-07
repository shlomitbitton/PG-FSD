import java.util.Scanner;

public class StringSearch {
  
public static boolean stringSearch(String input){
  String[] s = {"edcrfvtgbyhnujm", "olo","rfv"};
  for(String str:s){
    if(str.equals(input)){
      return true;
    }
  }
  return false;
}


  public static void main(String[] arg){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter a string to search");
    String userInput = scanner.nextLine();
    System.out.println(stringSearch(userInput));
  }
}