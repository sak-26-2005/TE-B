n = 5
for i in range(1, n + 1):
    # Print leading spaces
    for j in range(n - i):
        print(" ", end="")
    # Print stars
    for k in range(1, 2 * i):
        print("*", end="")
    print() # Move to the next line
