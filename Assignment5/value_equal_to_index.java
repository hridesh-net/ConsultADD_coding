package Assignment5;
import java.util.*;
import java.io.*;

public class value_equal_to_index {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().valueEqualToIndex(arr, n);
            if (ans.size() == 0) {
                System.out.println("Not Found");
            } else {
                for (Integer x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
         ArrayList<Integer> arrli = new ArrayList<Integer>();

          int k=1;

        for(int i=0;i<n;i++)

        {

            if(k==arr[i])

            {

                arrli.add(k);

            }

            k++;

        }

        return arrli;


    }
}