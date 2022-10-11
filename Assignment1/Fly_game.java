package Assignment1;

import java.util.*;

public class Fly_game {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int miles = sc.nextInt();
        int[] arr = new int[miles];
        for (int i = 0; i < miles; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = Fly(arr);
        // int i = 0;
        // int j = i + 1;
        // int packet;
        // while (i < arr.length) {
        //     if (arr[j] != 0 && arr[i] > 1 && j < i + arr[i]) {
        //         j++;
        //     } else if (arr[j] != 0) {
        //         i++;
        //         j++;
        //     } else if(arr[j] == 0 && j >= i + arr[i]){
        //         System.out.println("False");
        //         return;
        //     } else {
        //         packet = i + arr[i];
        //         if (j >= packet) {
        //             System.out.println("False");
        //             return;
        //         } else {
        //             j++;
        //         }
        //     }
        // }
        // System.out.println("True");
        System.out.println(ans);
    }
    public static boolean Fly(int[] arr){
        int current = 0;
        int till = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            till = Math.max(till , arr[i]+i);
            if(current == i){
                current = till;
            }
        }
        if(current>= arr.length-1){
            return true;
        }
        return false;
    }
}
