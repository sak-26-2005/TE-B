n = 5
alpha = 65  # ASCII value for 'A'
for i in range(n):
    for j in range(i + 1):
        print(chr(alpha), end=" ")
        alpha += 1
    print()
