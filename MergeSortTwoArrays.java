//Merge two unsorted arrays, remove duplicates and sort. two different ways.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;

public class MergeSortTwoArrays {
  


  public static int[] mergeArraysAndRemoveDuplicatesUsingStream(int[] arrayA, int[] arrayB)
    {
        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB))
                        .distinct()
                        .sorted()
                        .toArray();
    }


  public static void main(String[] args)
  {
      int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
      int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
      
      //create a set of Integers
      Set<Integer> mergedSet =new HashSet<>();
      
      //add arrayA elements to the set
      for(int i=0;i<arrayA.length;i++){
        mergedSet.add(arrayA[i]);
      }

       //add arrayB elements to the set
      for(int i=0;i<arrayB.length;i++){
        mergedSet.add(arrayB[i]);
      }
      //create a third array result
      int[] mergedSortedArray = new int[mergedSet.size()];
      
      //iterate the set using Iterator and add set elements to the third array
      Iterator<Integer> it=mergedSet.iterator();
      int i=0;
      while(it.hasNext()){
        mergedSortedArray[i]=it.next();
        i++;
      }
      //sort third array
      Arrays.sort(mergedSortedArray);

      System.out.println("Array A : "+Arrays.toString(arrayA));
      System.out.println("Array B : "+Arrays.toString(arrayB));
      System.out.println("Sorted Merged Array With No Duplicates : ");
         
      System.out.println("Long method: "+ Arrays.toString(mergedSortedArray));
      System.out.println("With Stream method: "+ Arrays.toString(mergeArraysAndRemoveDuplicatesUsingStream(arrayA, arrayB)));
  }
}
