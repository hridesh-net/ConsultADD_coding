package Assignmenet7;
import java.util.* ;
// import java.io.*; 

public class Rotation_of_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String q = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.isCyclicRotation(p, q));
        sc.close();
    }
}


class Solution {
    public static int isCyclicRotation(String p, String q)  {
         String hold = p+p;
        if(hold.contains(q)) return 1;
        return 0;
    }
}
