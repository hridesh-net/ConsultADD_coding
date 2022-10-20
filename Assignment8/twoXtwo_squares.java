package Assignment8;
import java.util.*;
import java.io.*;

public class twoXtwo_squares {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());//input n
            
            Solution ob= new Solution();
            System.out.println(ob.numberOfSquares(n));
        }
    }
}


class Solution
{
    public long numberOfSquares(long base)
    {
        //code here
        if(base==2)

        return 0;

        base=base-2;

        base=base/2;

        return base*(base+1)/2;
    }
}
