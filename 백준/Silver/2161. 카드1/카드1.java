import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 카드 생성
        Queue<Integer> cards = new LinkedList<>();
        // 버린 카드
        ArrayList<Integer> trashes = new ArrayList<>();

        for(int i=0; i<N; i++){
            cards.add(i+1);
        }

        //우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
        while(cards.size() > 1){
            int temp = cards.poll();
            trashes.add(temp);
            cards.add(cards.poll());
        }

        //출력
        for(int i=0; i<trashes.size(); i++){
            System.out.print(trashes.get(i)+" ");
        }
        System.out.print(cards.peek());

    }
}
