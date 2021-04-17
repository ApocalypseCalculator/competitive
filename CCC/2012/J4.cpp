#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int k;
	string a;
	cin >> k;
	cin >> a;
	string alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for (int i = 0; i < a.length(); i++) {
		char letter = a.at(i);
		int shiftValue = (3 * (i + 1)) + k;
		int currentLetterPosition = alphabet.find(letter);
		int newLetterPosition = currentLetterPosition - shiftValue;
		if (newLetterPosition < 0) {
			newLetterPosition += 26;
		}
		cout << (alphabet.at(newLetterPosition));
	}
	cout << "\n";
	return 0;
}