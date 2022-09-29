import java.util.*;

public class 01BubbleSort
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr = bubble_sort(arr);
        arr.forEach((i) -> System.out.println(i));
    }
    
   static ArrayList<Integer> bubble_sort(ArrayList<Integer> arr) {
      int length = arr.size();
        for(int i=0; i<length; i++) {
            for(int k=length-1; k > i; k--) {
                if(arr.get(k-1) > arr.get(k) ){
                    int temp = arr.get(k-1);
                    arr.set(k-1,arr.get(k));
                    arr.set(k,temp);
                }
            }
        }
        
        return arr;
    }
    
}
