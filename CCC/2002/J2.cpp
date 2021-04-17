#pragma GCC optimize "Ofast"
#include <iostream>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	string vowels = "aeiouy";
	while (true) {
		string inp;
		cin >> inp;
		if (inp == "quit!") {
			return 0;
		}
		else {
			if (inp.length() > 4 && vowels.find(inp.at(inp.length() - 3)) == string::npos && inp.substr(inp.length() - 2) == "or") {
				cout << inp.substr(0, inp.length() - 2) << "our\n";
			}
			else {
				cout << inp << "\n";
			}
		}
	}
}