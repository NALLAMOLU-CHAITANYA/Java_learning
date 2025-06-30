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

1.