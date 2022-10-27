package Assignment11;
import java.util.* ;
import java.io.*; 
import java.util.*;

//  Following is the java Pair class
class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }
}

public class duplicatcharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Solution obj = new Solution();
        obj.duplicate_char(s, n);
    }
}




class Solution {

    public ArrayList<Pair> duplicate_char(String s, int n) {
        
        // Write your Code here
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList <Pair> ans = new ArrayList <> ();
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        for (char c : ch){
            if (map.containsKey(c)){
                int v = map.get(c);
                map.put(c, v+1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : map.keySet()){
            int v = map.get(c);
            if (v > 1){
                Pair p = new Pair(c, v);
                ans.add(p);
            }
        }
        return ans;
    }
}