package Sort;
import java.util.*;

public class jangnan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] tmp = arr.clone(); // 깊은 복사 방법

        Arrays.sort(tmp);

        for(int i = 0; i < n; i++){
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }

        for(int x : answer) {
            System.out.print(x+" ");
        }

    }
}

