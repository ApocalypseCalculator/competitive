#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	unordered_set<int> vals;
	for (int i = 0; i < n; i++) {
		int v;
		cin >> v;
		if (!vals.insert(v).second) {
			cout << "YES";
			return 0;
		}
	}
	cout << "NO";
	return 0;
}
//This solution ACs and at the time of writing, is 2nd best solution