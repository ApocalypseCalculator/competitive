#pragma GCC optimize "Ofast"
#include <iostream>

using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int m;
	cin >> m;
	if (m % 10 == 2 || m%3 != 0 || m%2 != 0) {
		cout << "memer";
	}
	else {
		cout << "not a memer";
	}
}