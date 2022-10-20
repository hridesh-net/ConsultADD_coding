package Assignment8;
import java.io.*;
import java.util.*;

public class remove_duplicate_fromsortedArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}



class Solution {
    int remove_duplicate(int a[],int n){
        // code here
        int i=0;int j=1;
        while(j<n){
      
            if(a[i]==a[j])
                j++;
            else
            {
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
}
