package Assignment7;
import java.util.* ;
// import java.io.*; 

public class couny1innumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.countOnBits(a));
        sc.close();
    }
}


class Solution {
	public int countOnBits(int n) {
		// Write your code here.
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
	}
}
