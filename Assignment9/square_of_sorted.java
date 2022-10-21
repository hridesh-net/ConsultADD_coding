package Assignment9;
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class square_of_sorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        Solution obj = new Solution();
        obj.sqsorted(arr);
    }
}

class Solution {
	public ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		// Write your code here.
        Integer[] arr1 = new Integer[arr.size()];
        arr1 = arr.toArray(arr1);
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (arr1[i]*arr1[i]);
        }
        arr.clear();
//         List<Integer> al = new ArrayList<Integer>();
        Collections.addAll(arr, arr1);
        Collections.sort(arr);
        return arr;
	}
}
