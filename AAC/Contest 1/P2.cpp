#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n;
	long long d, k, x, p;
	cin >> n;
	cin >> d;
	cin >> k;
	cin >> x;
	unsigned long long *arr = new unsigned long long[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	long double ratio = (100.0 - x) / 100.0;
	cin >> p;
	for(int i = n-1; i >= 0; i--) {
		if (arr[i] >= p) {
			while (true) {
				if (arr[i] >= p) {
					if (k > 0) {
						arr[i] = (unsigned long long) (arr[i] * ratio);
						k--;
					}
					else {
						cout << "NO";
						return 0;
					}
				}
				else {
					break;
				}
			}
		}
	}
	cout << "YES";
	return 0;
}

//Originally tried to use logarithms to find but it kept WA'ing. This solution ACs