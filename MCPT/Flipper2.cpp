#pragma GCC optimize "Ofast"
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n = 0;
	cin >> n;
	int* arr = new int[n];
	bool flipped = false;
	long sum = 0L;
	vector<int> queries;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	for (int i = n - 1; i >= 0; i--) {
		int x = arr[i];
		if (flipped) {
			x = -x;
		}
		if (x < 0) {
			flipped = !flipped;
			sum -= x;
			queries.push_back((i + 1));
		}
		else {
			sum += x;
		}
	}
	cout << sum << "\n";
	sort(queries.begin(), queries.end());
	for (auto v : queries) {
		cout << v << " ";
	}
}