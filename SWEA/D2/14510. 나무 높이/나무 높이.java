import java.io.*;
import java.util.*;

public class Solution {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			int N = Integer.parseInt(br.readLine()); // 나무 개수
			
			// 입력받기
			int[] tree = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				tree[i] = Integer.parseInt(st.nextToken());
			}
			
			// 최대값
			int max = 0;
			for(int i=0; i<N; i++) {
				max = Math.max(max, tree[i]);
			}
			
			// diff
			int[] diffs = new int[N];
			for(int i=0; i<N; i++) {
				diffs[i] = max - tree[i];
			}
			
			// 로직
			int one = 0;
			int two = 0;
			
			for(int i=0; i<N; i++) {
				one += diffs[i] % 2; // 첫째날(홀수날) 물 줘야 하는 일수
				two += diffs[i] / 2; // 둘째날(짝수날) 물 줘야 하는 일수
			}
			
			
			while(two - one >= 2) {
				two --;
				one += 2;
			}
			//예 10 11 or 10 10
			
			int lastOddDay = one * 2 - 1;
			int lastEvenDay = two * 2;
			
			int ans = Math.max(lastEvenDay, lastOddDay);
			
			bw.write(String.format("#%d %d", test_case, ans));
			bw.newLine();
			bw.flush();
			
			
			
			
		}
		
	}

}
