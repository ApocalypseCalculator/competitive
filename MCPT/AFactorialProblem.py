def zeros(n):
        p = 5 
        c = 0 
        while True:
            x = n//p 
            p *= 5 
            c += x 
            if not x:
                return c 

m = int(input())
inf = 10**20 
ans = inf
hi = inf 
lo = 1 

while lo <= hi:
    mid = (hi + lo) // 2
    n = zeros(mid)
    if n > m:
        hi = mid - 1 
    elif n < m:
        lo = mid + 1 
    else:
        hi = mid - 1
        ans = min(ans, mid)

print(ans if ans != inf else "No solution")
# This solution ACs, but it is not mine. I forgot who made this though :(