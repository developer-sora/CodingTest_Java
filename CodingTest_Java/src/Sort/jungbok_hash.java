package Sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jungbok_hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        String answer = "U";

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer>map = new HashMap<>();

        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>1){
                answer="D";
                break;
            }
        }

        System.out.println(answer);
    }
}
