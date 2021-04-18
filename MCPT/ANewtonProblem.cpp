#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int a, b, c;
	cin >> a >> b >> c;
	double x = 0.0;
	for (int i = 0; i < 1000; i++) {
		double y = a + b * cos(x);
		if (y != 0.0) {
			x -= (((a * x) + (b * sin(x)) - c) / (y));
		}
		else {
			break;
		}
	}
	cout.precision(10);
	cout << fixed << x;
}
//this solution ACs