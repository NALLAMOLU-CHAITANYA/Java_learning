FAANG questions -> in whatsapp need to see and note down here.


### Bit wise operators questions:

1. checkbit(N,i) -> N>>i % 2 -> o(1),1
2. countsetbits(N) -> o(32*1),1      and          N=N&(N-1) -> removes the right most set bit.
3. genNumWithBitsSetPos(x,y) ->    (1<<x) | (1<<y)
4. genNumWithSetBits(x,y) -> ex : x=3,y=2 = (...00011100)    ->      o(n),1  (i-> y to x+y)      and        o(1),1  ( ((1<<x)-1)<<y )
5. every number appears twice except 1 ->  n^2,1  and  n,1
6. power(a,b)  ->  b,1   and   logb,1 (visualize b as 2 power and proceed)
7. every number appears once except 2 numbers appears twice  ->  n^2,1      and       n,1
8. every number appears thrice except 1.     ->  n^2,1      and       32*n,1
9. subset whose sum is k   ->   2^n * n , 1  (subnet generation with bit masking)
10. swap bits (adjacent) ->   we will preserve even bits, right shift by one bit. preserve odd bits, left shift by one bit and add both the numbers.
11. reverse bits ->  1011 to 1101
12. flip bits  ->  1 to 0  and 0 to 1
13. sum of (xors of pairs)
14. xor of (sums of pairs)


### Recursion questions:

1. come back and write

### Sorting in increasing order: (heap, quick, java inbuilt sort = tim sort)

1. Count an array of 0's and 1's  -> can solve using count sort

2. Given an array and sum k. Check if there exists any pair of elements whose sum is k.    ->  n^2,1   and    nlongn + N, N (sort using merge sort and then use 2 pointer to find the sum)

3. count how many pairs of elements exists which : i<j and A[i] > A[j] where i,j are indexes.   ->   N^2,1  and   NlogN,N (Merge sort and while merging at last count no.of elements which satisfy this condition)


### searching :
later


### Hashing Problems:

1. 
2. 
3. 

### String prob:

1. Toggle the case of each letter in the string.
2. Check if 2 strings are anagrams or not. (letters and no.of letters should match not the order) (can hadle in string hasing).
3. Find the length of longest palindromic substring  ->  n*n*n,1  and  n*n,1
4. Calculate the length of smallest substring in A containing all the characters of string B.  ->  many ways in notes.
5. Count the no.of anagramic groups in a group of strings. -> notes (write code template to sort the string and group of strings)



### General problems:
1. Calculate the length of largest subarray whose elements can be rearranged in contiguos order - Multiple ways in notes. (before string hashing topic)

2. carry forward sum.

3. Rotate the array in clockwise direction d times ->  n*d,1  and  n+n,n  and  n,1

4. print(sum(a[i:j])) for q no.of queries ->  q*n,1 and  n+q,n and  n+q,1
  