import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄 - 방의 크기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[N][M]; // 방의 상태
        int[][] visited = new int[N][M]; // 청소 상태

        // 둘째 줄 - 현재 좌표 (x,y) 및 처음 방향 dir
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dir = sc.nextInt();

        // 방 상태 입력받기 1은 벽, 0은 빈 칸
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j] = sc.nextInt();
            }
        }

        // 청소상태 값 복사
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = map[i][j];
            }
        }

        // 다음 좌표
        int nx;
        int ny;

        // 방향 - 북 동 남 서
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 청소한 칸의 수
        int ans = 0;

        while(true){ // 후진 했을 때 벽이면 종료

            //현재 위치 청소
            if(visited[x][y] == 0){
                ans ++;
                visited[x][y]++;
            }

            int d = dir; // 주변 확인용 방향
            boolean isClean = false;
            // 주변 네 칸 확인
            for(int i=0; i<4; i++){
                nx = x + dx[d];
                ny = y + dy[d];
                if(map[nx][ny] != 1 && visited[nx][ny] == 0){ // 범위 안이고, 청소하지 않은 빈 칸이 있으면,
                    isClean = true;
                    break;
                }
                d = (d+1)%4;
            }

            if(!isClean){ // 청소되지 않은 빈칸 없으면

                //바라보는 방향을 유지한 채로 후진
                nx = x + dx[(dir+2)%4];
                ny = y + dy[(dir+2)%4];

                if(map[nx][ny] == 0){ // 후진 가능하면
                    x = nx;
                    y = ny; // 후진 한다
                }else{ //불가능하면
                    break; // 종료
                }
            }else{ // 청소되지 않은 빈칸 있으면
                while(true){ // 빈칸 일때까지 돌기
                    // 청소기 반시계 방향 회전 후 앞 칸 확인
                    dir = (dir+3)%4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];

                    if(visited[nx][ny] == 0){ // 앞 칸 확인(청소 안되있으면)
                        //한 칸 전진
                        x = nx;
                        y = ny;
                        break;
                    }
                }
            }

        }

        System.out.println(ans);

        //맵 상태확인
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(visited[i][j]);
//            }
//            System.out.println();
//        }
    }
}
