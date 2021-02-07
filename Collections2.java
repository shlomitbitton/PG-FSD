import java.util.LinkedList;

public class Collections2{

  public static void insertionAndDeletion(){
    LinkedList<Integer> l= new LinkedList<Integer>();
    System.out.println(l);
    l.addLast(5);
    System.out.println(l);
    l.addFirst(8);
    System.out.println(l);
    l.add(1, 100);
    System.out.println(l);
    l.removeFirst();
    System.out.println(l);
    }
      
      public static void main(String[] args){
        insertionAndDeletion();
      }
}