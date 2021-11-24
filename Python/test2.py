def solve(n, a):
    for i in range(len(a) - 1):
        if a[i] > a[i+1]:
            if i == 0: a[i] = 0
            else:
                a[i] = a[i-1]+1
    for i in range(len(a) - 1):
        if a[i] >= a[i+1]: return 'No'
    return 'Yes'

t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    out = solve(n, a)
    print(out)