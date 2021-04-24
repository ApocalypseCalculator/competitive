#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	long n, q;
	long val = 0;
	cin >> n >> q;
	for (int i = 0; i < q; i++) {
		int v1;
		cin >> v1;
		if (v1 == 1) {
			long v2, v3;
			cin >> v2 >> v3;
			cout << (v3 - v2 + 1) * val << "\n";
		}
		else {
			long v2;
			cin >> v2;
			val += v2;
		}
	}
	return 0;
}