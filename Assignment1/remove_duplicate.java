package Assignment1;

import java.util.*;

class Remove_duplicate {
    public static void main(String args[]) {
        String new_str = "";
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] str = str1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++){
            if (!map.containsKey(str[i])){
                map.clear();
                new_str = new_str + str[i];
                map.put(str[i], i);
            }
        }
        System.out.println(new_str);
        sc.close();
    }
}