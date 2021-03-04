import java.util.Arrays;
import java.util.HashMap;

// Given an array of n distinct elements, find the minimum number of swaps required to sort the array.

// Input : {4, 3, 2, 1}
// Output : 2

// Input : {1, 5, 4, 3, 2}
// Output : 2


public class MinimumSwapsToSort {

  public static int minSwap(int[] arr){
    int answer=0;
    int[] temp= Arrays.copyOfRange(arr, 0, arr.length);
    Arrays.sort(temp);
    HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++){
      hm.put(arr[i],i);
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=temp[i]){
        answer++;
        int init=arr[i];
        swap(arr,i,hm.get(temp[i]));
        hm.put(init, hm.get(temp[i]));
        hm.put(temp[i], i);
      }
    }
    return answer;
  }


  public static void swap(int[] arr, int i, int j){
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j]= tmp;
  }

  public static void main(String[] args){
    int[] input={1,2,5,4,0,9,10};
    minSwap(input);

  }
  
}
