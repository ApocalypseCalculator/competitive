#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int n, k;
	cin >> n >> k;
	cout << (n % (k+1) == 1 ? "baf" : ":hudab:");
}