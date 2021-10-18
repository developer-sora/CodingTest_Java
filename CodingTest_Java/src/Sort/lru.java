package Sort;

import java.util.Scanner;

public class lru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        int[] cache = new int[s];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for(int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if(x==cache[i]) pos=i; //히트일 경우 인덱스 저장
            if(pos==-1) { // 미스 상황
                for(int i = s-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }

            }else{
                for(int i = pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;

        }

    for(int x : cache) {
        System.out.print(x+" ");
    }

    }
}

