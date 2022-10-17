import java.util.* ;
// import java.io.*;

public class valid_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Solution st = new Solution();
        System.out.print(st.validPalindrome(n, s));
        sc.close();
    }
}

 

class Solution {
 
	public boolean validPalindrome(int n, String s) {
		// Write your code here
        char[] str = s.toCharArray();
         int left = 0,right = str.length-1;
         while(left<right){
             if(str[left] != str[right]){
                 return func(str,left+1,right) ||func(str,left,right-1);
             }
             left++;
             right--;
         }
         return true;
	}
    
    public static boolean func(char[] s,int left ,int right){
        while(left <right){
            if(s[left] !=s[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

}
