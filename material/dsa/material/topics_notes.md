How to solve any coding question:

1. read and understand the problem statement
2. sample I/O
3. Constraints
4. Think of approaches (spend 70 percent of time here)
5. validate the solution with sample I/O test cases
6. Time and space complexity with solution
7. check time and space complexity with constraints.
8. Identify edge cases, identify data types
9. At last code. (Before doing the fair code write psuedo code and run for one test case***)


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


## Recursion:

Programming paradigm which solves any problem by solving smaller instances of the exact same problem

Steps to achieve recursion:
1.	Assumption
2.	main logic
3.	base condition

First form the recurrance relation (if terms are decreasing in each level) or recurrance tree (if terms are increasing in each level). -> we can derive the time complexity.
ex : sum of n natural numbers  -> recurrance relation :  T(n)=1+T(n-1)

Given a recurrance relation, you should say the time complexity -> ex in notes. (most important)

books based on recursion: in recursion_notes.md file.


### Sorting in increasing order: (heap, quick, java inbuilt sort = tim sort)

1. Bubble sort -> N^2, 1  (Take the biggest element in array to the right and continue doing it in loop)
2. Selection sort -> N^2 , 1  (getting the min element from the entire array and keeping in the left(current index))
3. Insertion sort -> N^2,1    (iteration i->0toN and taking left array and keeping the current element(i) at its position) (*going from left to right and keeping every element at its place)
4. Count sort  -> R+N, R  (it maintains the array with the size of difference of highest and lowest element) (useful when the elements are having less difference range) (if range is not mentioned don`t use count sort)
5. Merge sort ->  NlogN,N   (uses divide and conquer algo(with recursion) + 2 pointer algorithm) (divides the array into 2 parts and it sorts left part and right part and then merges both the arrays into tmp and then tmp is copied to the original array)  (**best sort as it reduces time complexity**)



### Searching :

1. linear search -> O(n) (works on sorted and unsorted)
2. Binary search -> O(logN) (for sorted array only)