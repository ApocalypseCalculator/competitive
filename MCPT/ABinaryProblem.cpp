#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n = 0;
	cin >> n; 
	int ctr = 0;
	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		if (x == 1) {
			ctr++;
		}
	}
	cout << (ctr % 2 == 1) ? 1 : 0;
	return 0;
}