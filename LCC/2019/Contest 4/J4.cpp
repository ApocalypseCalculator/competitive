#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

long gcd(long n1, long n2) {
	if (n2 == 0) {
		return n1;
	}
	return gcd(n2, n1 % n2);
}

long bval(long a, long k) {
	for (long j = k; j >= 2; j--) {
		long x = gcd(a, j);
		if (x == 1) {
			return j;
		}
	}
	return 0;
}

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		long a, k;
		cin >> a >> k;
		cout << bval(a, k) << "\n";
	}
	return 0;
}