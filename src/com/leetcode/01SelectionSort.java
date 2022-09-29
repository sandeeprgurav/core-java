
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
    
   static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
     for(int i = 0; i < arr.size(); i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(j) < arr.get(minIndex)){
                    minIndex = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i,arr.get(minIndex));
            arr.set(minIndex,temp);

        }
        return arr;
    }
    
}
