#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, x, msg;
	cin >> n >> x >> msg;
	for (int i = 1; i <= 3; i++) {
		if (n + x * i >= msg) {
			cout << n + x * i;
			return 0;
		}
	}
	cout << "Who knows...";
	return 0;
}