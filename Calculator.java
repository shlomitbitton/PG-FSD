public class Calculator {

  static void add(int i, int j){
    int k=0;
    k=i+j;
    System.out.println(i +" + " + j+ " = " + k);
  }
  static void subtraction(int i, int j){
    int k=0; 
    k=i-j;
    System.out.println(i +" - " + j+ " = " + k);
  }

  static void multiplication(int i, int j){
    int k=0; 
    k=i*j;
    System.out.println(i +" * " + j+ " = " + k);
  }

  static void division(int i, int j){
    int k=0; 
    if(j!=0){
      k=i/j;
    }else{
      System.out.println("cannot divide by 0");
      return;
    }
    System.out.println(i +" * " + j+ " = " + k);
  }

  public static void main(String[] args){
    add(7,8);
    subtraction(9,0);
    subtraction(9,20);
    multiplication(4,55);
    division(5,0);
    division(5,100);


  }
  
}
