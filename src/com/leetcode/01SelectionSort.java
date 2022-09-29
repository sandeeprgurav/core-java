
import java.util.*;

public class 01SelectionSort
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr = selection_sort(arr);
        arr.forEach((i) -> System.out.println(i));
    }
    
   static ArrayList<Integer> selection_sort(ArrayList<Integer> arrList) {
    int []  arr =   arrList.stream().mapToInt(i -> i).toArray();
    int n = arr.length;
    for(int i =0;i<n-1;i++) {
        int minValue = arr[i];
        int minIndex = i;
        for(int k=i+1; k < n-1; k++) {
            if(arr[k]<minValue) {
              minValue = arr[k];     
              minIndex=k;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
     ArrayList<Integer> finalList = new ArrayList<>();
     for (int i : arr) finalList.add(i);
     return finalList;
    }
    
}
