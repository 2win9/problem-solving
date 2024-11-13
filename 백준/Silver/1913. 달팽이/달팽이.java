import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        // 상 우 하 좌 상 우 하 좌 . . .
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 시작 좌표 및 이동 방향
        int x = N / 2;
        int y = N / 2;
        int dir = 0;

        // 요소 채우기. 이미 채워져있으면 그 전의 방향으로 이동
        for (int i = 0; i < N * N; i++) {
            arr[x][y] = i + 1;

            //다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (arr[nx][ny] == 0) {
                x = nx;
                y = ny;
            } else { // 차 있으면
                dir = (dir + 3) % 4;
                x += dx[dir];
                y += dy[dir];
            }

            dir = (dir + 1) % 4;

        }

        // 2차원 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 해당 요소 인덱스 출력
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == num){
                    System.out.print((i+1)+" "+(j+1));
                }
            }
        }

    }
}
