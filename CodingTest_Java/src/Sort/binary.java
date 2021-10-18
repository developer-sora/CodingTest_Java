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

        while(lt<=rt){  // lt�� rt���� Ŀ���� ����
            int mid = (lt+rt)/2;
            if(arr[mid]==k) {
                answer=mid+1;  //��°�ϱ� �ε���+1
                break;
            }
            else if(arr[mid]>k) rt=mid-1; // �߰����� ũ�ϱ� ���ʿ��� ã��
            else lt=mid+1;  // �߰����� �����ϱ� �����ʿ��� ã��
        }
        System.out.println(answer);

    }
}
