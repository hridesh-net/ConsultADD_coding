import java.util.* ;
// import java.io.*; 
import java.util.ArrayList;

public class missingno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
        
        for (int i = 1; i <= n; i++) 
            arrli.add(i);
        
        Solution st = new Solution();
        st.missingAndRepeating(arrli, n);        
    }
}


class Solution {

    public int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int n1=arr.size();
        int[] arr1 = new int[arr.size()];
       
        int[] a=new int[n1];
       
        //convert arraylist to array
        for(int i=0;i<arr.size();i++){
           arr1[i]=arr.get(i);
        }
        // sort the array

        Arrays.sort(arr1);

 
      
        //for first element to compare  
        int e=1;
        while(e<=n){
            if(!(arr.contains(e)))
             {a[0]=e;}
            e++;
        }
       
       
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr1[i]==arr1[j]){
                   a[1]=arr1[i];
                   
                  
               }
           }
       }
       
       
       
       return a;
    }
}