package Sort;

import java.util.Scanner;

public class select {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    int tmp = 0;

    for(int i = 0; i < n-1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    for(int x : arr){
        System.out.print(x+" ");
    }
    }
}

