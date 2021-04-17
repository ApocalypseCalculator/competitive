#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int s,r;
	cin >> s >> r;
	cout << ((s*s > r*r*3.14159265358979323846) ? "SQUARE" : "CIRCLE");
	return 0;
}

//This solution ACs