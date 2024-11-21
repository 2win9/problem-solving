import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] commands = br.readLine().split(" ");

            switch (commands[0]){
                case "push":
                    MyQueue.pushX(Integer.parseInt(commands[1]));
                    break;
                case "pop":
                    MyQueue.pop();
                    break;
                case "size":
                    MyQueue.getSize();
                    break;
                case "empty":
                    MyQueue.isEmpty();
                    break;
                case "front":
                    MyQueue.getFront();
                    break;
                case "back":
                    MyQueue.getBack();
                    break;
                default:
                    break;
            }
        }

    }

    static class MyQueue{
        static int[] queue = new int[10000];
        static int front = 0;
        static int back = -1;

        static void pushX(int x){
            queue[++back] = x;
        }
        static void pop(){
            if(front > back){
                System.out.println(-1);
            }else{
                System.out.println(queue[front++]);
            }
        }
        static void getSize(){
            System.out.println(back - front + 1);
        }
        static void isEmpty(){
            if(front > back){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        static void getFront(){
            if(front > back){
                System.out.println(-1);
            }else{
                System.out.println(queue[front]);
            }
        }
        static void getBack(){
            if(front > back){
                System.out.println(-1);
            }else{
                System.out.println(queue[back]);
            }
        }
    }
}


