package Sort;

import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = 0;

        int lt = 0, rt = n-1;

        while(lt<=rt){  // lt가 rt보다 커지면 종료
            int mid = (lt+rt)/2;
            if(arr[mid]==k) {
                answer=mid+1;  //번째니까 인덱스+1
                break;
            }
            else if(arr[mid]>k) rt=mid-1; // 중간값이 크니까 왼쪽에서 찾음
            else lt=mid+1;  // 중간값이 작으니까 오른쪽에서 찾음
        }
        System.out.println(answer);

    }
}
