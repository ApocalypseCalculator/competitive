#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, x;
	cin >> n >> x;
	int high = 0;
	for (int i = 0; i < n; i++) {
		int a, v;
		cin >> a >> v;
		if (a > x) {
			a = x;
		}
		if (a * v > high) {
			high = a * v;
		}
	}
	cout << high;
	return 0;
}