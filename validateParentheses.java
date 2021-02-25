import java.util.*;
class validateParentheses {
  private static final String CONTAINS_INVALID_PARENTHESES = " contains invalid parentheses.";
  
  public static void valid_paren(String input_str) {

    // Declaring a stack
    Stack<Character> s = new Stack<Character>();
    // Iterating over the entire string.
    for (char c : input_str.toCharArray()) {
      //  If the input string contains an opening parenthesis,
      //  push in on to the stack.
      if (c == '(' || c == '{' || c == '[') {
        s.push(c);
      }
      else {
        // In the case of valid parentheses, the stack cannot be 
        //  empty if a closing parenthesis is encountered.
          if(s.empty()) {
            System.out.println(input_str + 
            CONTAINS_INVALID_PARENTHESES);
            return;
          }
          else{
          // If the input string contains a closing bracket,
          // then pop the corresponding opening parenthesis if
          // present.
          char top = (Character) s.peek();
          if(c == ')' && top == '(' ||
             c == '}' && top == '{' ||
             c == ']' && top == '['){
             s.pop();
          }
          else{
            System.out.println(input_str + 
            CONTAINS_INVALID_PARENTHESES);
            return;
          }
        }
      }
    }
    //  Checking the status of the stack to determine the
    //  validity of the string.
    if(s.empty()) {
      System.out.println(input_str + 
      " contains valid parentheses.");
    }
    else{
      System.out.println(input_str + 
      CONTAINS_INVALID_PARENTHESES);
    }
  }
  public static void main( String args[] ) {
    String input_str1 = "{{}}()[()]";
    String input_str2 = "(][)";
    String input_str3 = ")";
    String input_str4 = "{([])}";
    String input_str5 = "({}[])";
    valid_paren(input_str1);
    valid_paren(input_str2);
    valid_paren(input_str3);
    valid_paren(input_str4);
    valid_paren(input_str5);
  }
}