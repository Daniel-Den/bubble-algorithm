import java.util.*;

public class BubbleSort{

  public static void bubbleSort(int[] list){
    /**
    * This method runs a bubble sort algorithm. It will sort a given list in increasing order. It compares each item in the list with the next item
    * in the list, fliping them to be in the right order if nessessary, and cycles through the list while doing this upto as many times as there are items
    * in the list. If no items are flipped, which is measured by the solvedcounter, on a certain run it means the list is sorted and the algorithm ends.
    *
    * @param list The array to be sorted
    * @return void The array will be sorted but nothing is returned
    */
    int solvedcounter = 0;
    for(int n=0; n<=list.length-1; n++){
      for(int i=0; i<=list.length-2; i++){
        int first = list[i];
        int second = list[i+1];
        if (first > second){
          list[i] = second;
          list[i+1] = first;
          solvedcounter++;
        }
      }
      if (solvedcounter == 0){
        break;
      }
      else{
        solvedcounter = 0;
      }
    }
  }

  public static boolean verify(int[] list){
    /**
    * This method returns true if the list is sorted. the list is sorted when the preceding entry in a given list is not greater than the following entry,
    * otherwise it returns false.
    *
    * @param list The array to be verified if it is in order
    * @return boolean True if the array is in order and False if the array is not in order
    */
    for(int n=0; n<=list.length-2; n++){
      if(list[n] > list[n+1]){
        return false;
      }
    }
    return true;
  }

  public static void populateArray(int[] list){
    /**
    * Random integrers between 0 and 9 are chosen for each index in a given list using a for loop.
    *
    * @param list The array to be given random integrers
    * @return void The array will be populated but nothing is returned
    */
    for(int i = 0; i <= list.length-1; i++){
      list[i] = (int) (Math.random() * 10);
    }
  }
}
