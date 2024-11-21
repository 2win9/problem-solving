import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int top = -1; // top 변수를 포인터처럼 인덱스로 활용
    static int[] stack = new int[10000]; // 스택을 배열로 구현

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] commands = br.readLine().split(" ");

            switch (commands[0]){
                case "push":
                    int x = Integer.parseInt(commands[1]);
                    pushX(x);
                    break;

                case "pop":
                    pop();
                    break;

                case "size":
                    getSize();
                    break;

                case "empty":
                    isEmpty();
                    break;

                case "top":
                    getTop();
                    break;

                default:
                    System.out.print("Exception");
                    break;
            }

        }

    }

    public static void pushX(int x){
        stack[++top] = x;
    }

    public static void pop(){
        if(top == -1){
            System.out.println(-1);
        }else{
            System.out.println(stack[top--]);
        }
    }

    public static void getSize(){
        System.out.println(top+1);
    }

    public static void isEmpty(){
        if(top == -1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static void getTop(){
        if(top == -1){
            System.out.println(-1);
        }else{
            System.out.println(stack[top]);
        }
    }
}
