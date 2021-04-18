#pragma GCC optimize "Ofast"
#include <math.h>
#include <bits/stdc++.h>
using namespace std;

bool isprime(long long n)
{
    if ((n > 2 && n % 2 == 0) || n == 1)
    {
        return false;
    }
    for (long int i = 3; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t = 0;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        long long x1, x2;
        cin >> x1 >> x2;
        if ((x1 - x2) == 1 && isprime(x1 + x2))
        {
            cout << "YES"
                 << "\n";
        }
        else
        {
            cout << "NO"
                 << "\n";
        }
    }
    return 0;
}