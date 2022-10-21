package Assignment9;
import java.util.ArrayList;
import java.util.*;

public class Dublicateno {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        Solution obj = new Solution();
        System.out.println(obj.findDuplicate(arr));
    }
}

class Solution {

	public int findDuplicate(ArrayList<Integer> arr1) {

		//    Write your code here.
        int ans =0;
        Integer[] arr = new Integer[arr1.size()];
        arr = arr1.toArray(arr);
       //Using XOR(^) operator
       for(int i=0; i<arr.length; i++){
           ans = ans^arr[i];
       }
   
       for(int i=0; i<arr.length; i++){
           ans = ans^i;
       }
       return ans;
	}
}