#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n = 0;
	cin >> n;
	vector<int> po;
	vector<int> ne;
	for (int i = 0; i < n; i++) {
		int val = 0;
		cin >> val;
		if (val > 0) {
			po.push_back(val);
		}
		else if (val < 0) {
			ne.push_back(val);
		}
	}
	sort(po.begin(), po.end(), greater<int>());
	sort(ne.begin(), ne.end());
	int total = 0;
	if (po.size() % 2 == 1) po.pop_back();
	if (ne.size() % 2 == 1) ne.pop_back();
	for (int i = 0; i < po.size() / 2.0; i++) {
		total += po.at(2 * i) * po.at(2 * i + 1);
	}
	for (int i = 0; i < ne.size() / 2.0; i++) {
		total += ne.at(2 * i) * ne.at(2 * i + 1);
	}
	cout << total;
	return 0;
}
//This solution ACs