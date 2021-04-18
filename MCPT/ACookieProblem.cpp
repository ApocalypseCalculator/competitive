#pragma GCC optimize "Ofast"
#include <bits/stdc++.h>
using namespace std;
const int mm = 1e5 + 5;
int n, arr[mm], dp[mm];
int main()
{
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    dp[0] = arr[0];
    dp[1] = max(arr[0], arr[1]);
    for (int i = 2; i < n; i++) {
        dp[i] = max(dp[i - 1], arr[i] + dp[i - 2]);
    }
    cout << dp[n - 1];
}
//Averesoft's solution