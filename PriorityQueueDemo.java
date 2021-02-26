import java.util.*;
import java.util.PriorityQueue;
 
class PriorityQueueDemo {
   
     
    public static void main(String args[])
    {

        
       
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
 
        // Printing the top element of PriorityQueue
        System.out.println("peek: "+pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("poll: "+pQueue.poll());
 
        // Printing the top element again
        System.out.println("peek after removing the top: "+pQueue.peek());

        pQueue.remove(10);

        Integer element = pQueue.peek();
        System.out.println("Accessed Element: " + element);

        Iterator iterator = pQueue.iterator();
        
        System.out.print("size: "+ pQueue.size());
        
        System.out.print("\nIterating\n");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}