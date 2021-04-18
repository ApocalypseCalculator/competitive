#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n = 0;
	cin >> n;
	int last = 0;
	int ct = 0;
	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		if (x == last) {
			ct++;
		}
		last = x;
	}
	cout << ct;
	return 0;
}
//This solution ACs