/*U.S. Passport numbers must be between six and nine alphanumeric characters (letters and numbers). 
The “C” that precedes a U.S. Passport Card number is no longer case sensitive. */

public class IsAPassportNumberregEx {
  


  public static void main(String[] args){
 
 
 
 String passportNumber = "C4560!!!!";
  if(passportNumber.matches("[cC][a-zA-Z0-9]{6,10}")){
    System.out.println(passportNumber+" is a valid passport number");
  }else{
    System.out.println(passportNumber+" is not a valid passport number");
  }
}
}
