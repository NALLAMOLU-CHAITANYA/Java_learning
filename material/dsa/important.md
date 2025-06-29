How to solve any coding question:

1. read and understand the problem statement
2. sample I/O
3. Constraints
4. Think of approaches (spend 70 percent of time here)
5. validate the solution with sample I/O test cases
6. Time and space complexity with solution
7. check time and space complexity with constraints.
8. Identify edge cases, identify data types
9. At last code.


example problem:



## How to select the data types:

1. First know each data type size

Primitive Data Types and their Memory Requirements:
byte: 1 byte (8 bits)
short: 2 bytes (16 bits)
int: 4 bytes (32 bits)
float: 4 bytes (32 bits)
long: 8 bytes (64 bits)
double: 8 bytes (64 bits)
long double: 16 bytes (128 bits)
char: 2 bytes (16 bits) – Stores Unicode characters.

signed =  -2^(n-1) to 2^(n-1) - 1 (where n is the no of bits) (see the constraints and decide how many bits the ans should be and then decide the data types) (-10^11 < arr[i] < 10^3 )
unsigned= 0 to 2^(n) - 1 (0 < arr[i] < 10^3)

## How to calculate Time complexity

take 10^9 iterations as 1 sec. -> just for example
should always take worst case scenarios (practive rampup in book)
space complexity also in book.
Big o -> method to calculate time complexity.

space conplexity tips:
try to allocate the variables in the functions or loops bcz as soon as one iteration is over that old variables are deallocated.
10^9 bytes = 1 GB