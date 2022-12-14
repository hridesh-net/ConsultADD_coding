package Assignment4;
import java.io.*;
import java.util.*;

public class kth_smallest_element {
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
		sc.close();
	}
}

class Solution{
    public int kthSmallest(int[] a, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(a);
        return a[k-1];
    } 
}
