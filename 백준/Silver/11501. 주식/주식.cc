#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL); //입출력 시간 단축

	int T;
	cin >> T;
	while (T--) {
		int N; //날짜 수
		vector<int> v; //주식 가격
		long long value = 0; //가치
		int max = -1;

		cin >> N;

		for (int i = 0; i < N; i++) {
			int price;
			cin >> price;
			v.push_back(price);
		}
		
		for (int i = v.size() - 1; i >= 0; i--) //끝에서 부터 순회
		{ 
			if (v[i] > max)
				max = v[i];
			else if (v[i] < max)
				value = value + (max - v[i]);
		}
		cout << value << "\n";
	}
	return 0;
}