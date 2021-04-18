#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

long long factorial(int x) {
	long long b = 1;
	for (int factor = 2; factor <= x; factor++) {
		b *= factor;
	}
	return b;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, k; 
	cin >> n >> k; 
	if (k == n) {
		cout << factorial(n);
	}
	else if (k < n) {
		cout << (factorial(n) * factorial(n) / (factorial(k) * factorial(n - k) * factorial(n - k)));
	}
	else {
		cout << 0;
	}
	return 0;
}