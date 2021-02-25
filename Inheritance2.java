public class Inheritance2 extends Inheritance1{
  

  static String A="I am string A from class Inheritance2";
 

  public void methodFromInheritance(){
    System.out.println("I am methodFromInheritance 2");
  }


  public static void main (String[] args){
    Inheritance1 n = new Inheritance1();
    n.methodFromInheritance();
    Inheritance1 m = new Inheritance2();
    m.methodFromInheritance();
   
  }
}
