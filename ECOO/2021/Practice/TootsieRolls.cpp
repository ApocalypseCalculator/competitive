#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int m;
	cin >> m;
	if (m < 8 && m > 2) {
		cout << "NO";
	}
	else if (m <= 2) {
		cout << "Rocket!";
	}
	else {
		cout << "Tootsie Roll!";
	}
}
//FULL AC