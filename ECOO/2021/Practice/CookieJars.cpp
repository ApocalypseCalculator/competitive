#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, c, q;
	cin >> n >> c >> q;
	int* arr = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = 0;
	}
	for (int i = 0; i < q; i++) {
		int r;
		cin >> r;
		for (int j = 0; j < n; j++) {
			if ((j + 1) % r == 0) {
				arr[j] = arr[j] + 1;
			}
		}
	}
	int total = 0;
	for (int i = 0; i < n; i++) {
		if (arr[i] > c) {
			total += c;
		}
		else {
			total += arr[i];
		}
	}
	cout << n * c - total;
}