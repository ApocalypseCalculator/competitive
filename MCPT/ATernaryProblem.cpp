#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	int ct1 = 0, ct2 = 0, ct0 = 0;
	for (int i = 0; i < n; i++) {
		char x;
		cin >> x;
		if (x == '1') {
			ct1++;
		}
		else if (x == '2') {
			ct2++;
		}
		else {
			ct0++;
		}
	}
	cout << ct0 << " " << ct1 << " " << ct2 << "\n";
	return 0;
}