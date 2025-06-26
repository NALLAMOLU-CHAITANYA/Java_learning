# Collections:
-> The Java Collections Framework is a set of classes and interfaces that implement commonly reusable data structures (like lists, sets, queues, and maps).
-> we can Perform operations like searching, sorting, insertion, deletion efficiently using these collections.

| Interface    | Description                                | Example Implementations               |
| ------------ | ------------------------------------------ | ------------------------------------- |
| `Collection` | Root interface (extended by others)        | —                                     |
| `List`       | Ordered collection, allows duplicates      | `ArrayList`, `LinkedList`, `Vector`   |
| `Set`        | Unordered, **no duplicates** allowed       | `HashSet`, `LinkedHashSet`, `TreeSet` |
| `Queue`      | Follows **FIFO** order                     | `LinkedList`, `PriorityQueue`         |
| `Deque`      | Double-ended queue                         | `ArrayDeque`, `LinkedList`            |
| `Map`        | Key-value pairs (not part of `Collection`) | `HashMap`, `TreeMap`, `LinkedHashMap` |


Java also provides a utility class java.util.Collections with helpful static methods:
1. Collections.sort(list)
2. Collections.reverse(list)
3. Collections.max(list), Collections.min(list)
4. Collections.unmodifiableList(list) (for immutability)

###### Note:
-> All collection frameworks are there in java.util

-> Collections like ArrayList, HashMap, and HashSet can only store objects.
-> So, Wrapper class (Integer, Float ...) used to wrap primitive datatypes(int, float ...) into objects: (int class, float class ….). 




## List interface methods :
| Method                                | Description                                           |
| ------------------------------------- | ----------------------------------------------------- |
| `add(E e)`                            | Appends the element to the end of the list            |
| `add(int index, E element)`           | Inserts the element at the specified index            |
| `get(int index)`                      | Returns the element at the specified position         |
| `set(int index, E element)`           | Replaces the element at the specified index           |
| `remove(int index)`                   | Removes the element at the specified index            |
| `remove(Object o)`                    | Removes the first occurrence of the specified element |
| `indexOf(Object o)`                   | Returns the index of the first occurrence             |
| `lastIndexOf(Object o)`               | Returns the last occurrence index                     |
| `contains(Object o)`                  | Returns `true` if the list contains the element       |
| `size()`                              | Returns the number of elements in the list            |
| `isEmpty()`                           | Checks if the list is empty                           |
| `clear()`                             | Removes all elements                                  |
| `subList(int fromIndex, int toIndex)` | Returns a view of the portion of this list            |
| `iterator()`                          | Returns an iterator over elements                     |


### Difference b/w linked list and array list

| Feature                                | `ArrayList`                              | `LinkedList`                                |
| -------------------------------------- | ---------------------------------------- | ------------------------------------------- |
| **Underlying structure**               | Resizable **array**                      | Doubly **linked list**                      |
| **Access time (get/set)**              | ✅ **Fast** — O(1) (direct index access)  | ❌ **Slow** — O(n) (traverse from head/tail) |
| **Insertion at end**                   | ✅ Fast (unless resizing needed)          | ✅ Fast                                      |
| **Insertion/deletion at middle/start** | ❌ Slow (need to shift elements)          | ✅ Fast (just pointer change)                |
| **Memory usage**                       | ❗ Lower — just data                      | ❗ Higher — stores data + 2 pointers         |
| **Iteration**                          | ✅ Fast (contiguous memory, better cache) | ❌ Slightly slower                           |
| **Random access**                      | ✅ Efficient (`get(index)` is O(1))       | ❌ Inefficient (`get(index)` is O(n))        |
| **Use case**                           | Best for read-heavy scenarios            | Best for frequent insert/delete operations  |

Notes: (do research about this when you have time, info about the memory numbers might not be accurate)
-> Array list = Only stores the actual elements in a continuous memory block.
-> LinkedList = Each element is wrapped in a Node object. Each Node stores: data, reference to next node, reference to previous node(if doubly linked list)
-> In ArrayList:
    [Element]         --> only data (e.g., 4 bytes for int, 8 bytes for reference)
-> In LinkedList:
    [prev pointer][data][next pointer] + object header (typically 12-16 bytes) -> total of 24–32 bytes extra per element!
    ( breakdown : 8 bytes for prev 8 bytes for next, data (4 or 8 bytes), header (typically 12-16 bytes) )




## Iterator class:
-> write about it when you have time (in day 3 doc)

| Feature         | `Iterator`      | `ListIterator`     |
| --------------- | --------------- | ------------------ |
| Direction       | Forward only    | Forward & backward |
| Applicable to   | All collections | Only `List`        |
| Add elements    | ❌ No            | ✅ Yes              |
| Modify elements | ❌ No            | ✅ Yes              |
| Remove elements | ✅ Yes           | ✅ Yes              |


####  Difference b/w iterator and loops to iterate the Arraylist/any collection

| Feature                  | `Iterator`     | `for-each`           | Index-based `for`  |
| ------------------------ | -------------- | -------------------- | ------------------ |
| Works on all collections | ✅              | ✅                    | ❌ (Only Lists)     |
| Can remove safely        | ✅ (`remove()`) | ❌                    | ❌ (manual, unsafe) |
| Access by index          | ❌              | ❌                    | ✅                  |
| Supports bidirectional   | ❌              | ❌                    | ✅ (custom logic)   |
| Easy to write/read       | ❌              | ✅                    | ✅                  |
| Modifying list           | ✅              | ❌ (throws exception) | ❌ (unsafe shifts)  |

### Iterator vs ListIterator

| Feature                        | `Iterator`                    | `ListIterator`                               |
| ------------------------------ | ----------------------------- | -------------------------------------------- |
| Applicable to                  | All `Collection` types        | Only `List` (like `ArrayList`, `LinkedList`) |
| Direction                      | Forward only                  | Both forward and backward                    |
| `hasNext()` / `next()`         | ✅ Yes                         | ✅ Yes                                        |
| `hasPrevious()` / `previous()` | ❌ No                          | ✅ Yes                                        |
| Can add elements               | ❌ No                          | ✅ Yes (`add(E e)`)                           |
| Can replace element            | ❌ No                          | ✅ Yes (`set(E e)`)                           |
| Can remove elements            | ✅ Yes (`remove()`)            | ✅ Yes (`remove()`)                           |
| Position index info            | ❌ No                          | ✅ Yes (`nextIndex()`, `previousIndex()`)     |
| Use case                       | Simple, read-only or deletion | Complex edits (add/remove/set)               |


## summary in these points for iterator:

-> traverse using list iterator backwards =   ListIterator<String> listIt = cities.listIterator(cities.size()); (hasprevious(), previous())

-> for traversing we can use normal for loop but we can`t delete the element using normal for loop. we will get "ConcurrentModificationException". 
-> for deleting the element we can use list.remove("value") -> but it removes only first occurance.
-> for deleting every element we have to use iterator or listiterator obj.
-> For modification or adding element we can`t use iterator. We have to use only listiterator.
-> For list iterator we can traverse reverse also.

#### common mistakes:
-> Calling remove() without next() → throws IllegalStateException.
-> Modifying the list directly during iteration (like list.remove()) → throws ConcurrentModificationException.







## Set Interface:
-> All methods in list interfaces can be used in set interface.

-> complete set and map interface tomorrow