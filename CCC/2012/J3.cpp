#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int a;
	cin >> a;
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			cout << "*";
		}
		for (int j = 0; j < a; j++) {
			cout << "x";
		}
		for (int j = 0; j < a; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			cout << " ";
		}
		for (int j = 0; j < a; j++) {
			cout << "x";
		}
		for (int j = 0; j < a; j++) {
			cout << "x";
		}
		cout << "\n";
	}
	for (int i = 0; i < a; i++) {
		for (int j = 0; j < a; j++) {
			cout << "*";
		}
		for (int j = 0; j < a; j++) {
			cout << " ";
		}
		for (int j = 0; j < a; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	return 0;
}