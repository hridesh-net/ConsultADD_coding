package Assignment1;
import java.util.*;

class Remove_duplicate {
    public static void main(String args[]){
        String new_str = "";
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] str = str1.toCharArray();
        int i = 0;
        for (i = 0; i < str.length-1; i++){
            if (str[i] != str[i+1]){
                new_str = new_str + str[i];
            }
        }
        System.out.println(new_str);
        sc.close();
    }
}