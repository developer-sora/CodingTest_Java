package Stack_Queue;

import java.util.*;

class Person{
    int id;  //처음 목록상 몇번째인지
    int priority; // 위험도
    public Person(int id, int priority){
        this.id = id;
        this.priority=priority;
    }
}

public class emergency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int cnt = 0;

        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) cnt=answer;
            }
        }
            System.out.print(cnt);

        }
    }

