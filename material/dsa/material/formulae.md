## Formulae:


#### Bitwise
a << i = a * 2^i
a >> i = a / 2^i
~a = (-1-a)
a&1 faster than a%2
a^a = 0
a & (a-1) = removes the right most set(1) bit.


## Recursion time complexity:

T(N) = aT(N/b) + N^c    ->   t=loga to the base 'b'
(i) t<c -> O(N^c)
(ii) t==c -> O(N^t * logN)
(iii) t>c -> O(N^t)

