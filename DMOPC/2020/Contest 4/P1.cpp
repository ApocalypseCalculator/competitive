#pragma GCC optimize "Ofast"
#include <iostream>
#include <math.h>
using namespace std;
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t = 0;
	cin >> t;
	for (int i = 0; i < t; i++) {
		long int n = 0;
		cin >> n;
		long long int s = 0;
		cin >> s;
		long long int left = (n + 1) * n / 2 - s;
		long long int top = (long long int)floor(left / 2.0L);
		long long int val = top - (((left - n) >= 1) ? (left - n) : 1);
		if (top == left - top) {
			cout << val << "\n";
		}
		else {
			cout << (val + 1) << "\n";
		}
	}
	return 0;
}

//This solution is AC