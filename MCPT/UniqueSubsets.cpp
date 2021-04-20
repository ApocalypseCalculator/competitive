#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	unordered_set <int> set;
	long long val = 1LL;
	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		if (set.insert(x).second) {
			val = (val * 2) % 1000000007L;
		}
	}
	cout << val;
	return 0;
}