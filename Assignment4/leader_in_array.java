package Assignment4;

import java.io.*;
import java.util.*;
// import java.util.stream.*;

public class leader_in_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {

            // input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            // inserting elements in the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            // calling leaders() function
            res = obj.leaders(arr, n);

            // appending result to a String
            for (int i = 0; i < res.size(); i++) {
                str.append(res.get(i) + " ");
            }

            // printing the String
            System.out.println(str);
        }

    }
}

class Solution {
    // Function to find the leaders in the array.
     public ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        int currMax = 0;

        for (int i = arr.length - 1; i > -1; i--)

        {

            if (arr[i] >= currMax) {

                currMax = arr[i];

                list.add(currMax);

            }

        }

        Collections.reverse(list);

        return list;
    }
}
