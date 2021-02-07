package Inherirance;

public class Class1 {

    public String a="a";
    String b="b";
    protected String c="c";
    static String d="d";

  public void print(){
    String a="a from print meyhod in Class1";
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    System.out.println("c: "+c);
    System.out.println("d: "+d);
    System.out.println("================");

  }

  public static void main(String[] arg){
    Class1 class1= new Class1();
    class1.print();
    Class2 class2= new Class2();
    class2.print2();

  }
  
}
