if (obj instanceof String) { ... } -> Checks whether an object is an instance of a class or subclass.


## final classes in java:
| **Final Class**               | **Package** | **Why Final?**                                                              |
| ----------------------------- | ----------- | --------------------------------------------------------------------------- |
| **`java.lang.String`**        | `java.lang` | To make strings **immutable and secure**.                                   |
| **`java.lang.Math`**          | `java.lang` | Contains **static utility methods**, no need for inheritance.               |
| **`java.lang.System`**        | `java.lang` | Provides **system-level operations**, inheritance blocked for security.     |
| **`java.lang.StringBuffer`**  | `java.lang` | To make thread-safe mutable strings secure from alteration via subclassing. |
| **`java.lang.StringBuilder`** | `java.lang` | Like `StringBuffer` but non-synchronized.                                   |
| **`java.lang.Integer`**       | `java.lang` | Wrapper for `int`, **immutable** — subclassing disallowed.                  |
| **`java.lang.Double`**        | `java.lang` | Wrapper for `double`, immutable.                                            |
| **`java.lang.Float`**         | `java.lang` | Wrapper for `float`, immutable.                                             |
| **`java.lang.Long`**          | `java.lang` | Wrapper for `long`, immutable.                                              |
| **`java.lang.Boolean`**       | `java.lang` | Wrapper for `boolean`, immutable.                                           |
| **`java.lang.Byte`**          | `java.lang` | Wrapper for `byte`, immutable.                                              |
| **`java.lang.Short`**         | `java.lang` | Wrapper for `short`, immutable.                                             |
| **`java.lang.Character`**     | `java.lang` | Wrapper for `char`, immutable.                                              |
| **`java.util.Collections`**   | `java.util` | Utility class — only **static methods** — no reason to extend.              |
| **`java.util.Optional`**      | `java.util` | Designed to be immutable holder of objects — no extension allowed.          |


Note:

### Difference b/w List<Integer> = new ArrayList<> (); and ArrayList<Integer> = new ArrayList<> ();

1. List<Integer> list = new ArrayList<>();

You're declaring a variable of type List, and assigning it an object of type ArrayList.
You can easily switch to another implementation (like LinkedList, Vector, etc.) later without changing the variable type.

Example:
List<Integer> list = new ArrayList<>();
list = new LinkedList<>(); // ✅ Valid

2. ArrayList<Integer> list = new ArrayList<>();

Here you're tying the variable to a concrete implementation (ArrayList).
You can’t switch to another list type without changing the variable type.

Example:
ArrayList<Integer> list = new ArrayList<>();
list = new LinkedList<>(); // ❌ Compile-time error

| Feature                               | `List<Integer> list = new ArrayList<>();` | `ArrayList<Integer> list = new ArrayList<>();`     |
| ------------------------------------- | ----------------------------------------- | -------------------------------------------------- |
| Programming style                     | Interface-based (recommended)             | Implementation-based                               |
| Flexibility to change list type       | ✅ Yes                                     | ❌ No                                               |
| Supports polymorphism                 | ✅ Yes                                     | ❌ No                                               |
| Can access ArrayList-specific methods | ❌ No (only List methods visible)          | ✅ Yes (like `trimToSize()`)                        |
| Best practice?                        | ✅ Yes (more maintainable)                 | ❌ Only use when ArrayList-specific behavior needed |



# TODO
learn about concrete class
Scanner class, Buffer reader class, file reader class.
learn about the datatypes in the java
how arraylist increases and deceases in size and internal working
Solve problem using hashset in arrya list (ArrayList<Hahset<>>)
