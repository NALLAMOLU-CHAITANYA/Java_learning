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
