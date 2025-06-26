## Intro
Java -> OOP language.

Multi tasking -> multiple tasks run at a time
Multi threading -> running different modules or programs at a time in the whole code without wasting time.

RMI(remote method invocation = can call method of object in other machine i.e., JVM), EJB (Enterprise java beans)
Strut(Framework extension of servlets API), spring boot 
java applet (Applets were used to provide interactive features to web applications that historically could not be provided by HTML alone)

## Data types.
(IN datatypes document)
Char, Byte, Short, Int, long, Float, double, Boolean, String

## keywords: (day 1 document)
-> static (Belongs to the class, not to an object) (Shared by all objects of the class and same memory) (static variables + static methods) (static method can be called without creating an object) (Can be called without creating an object.) (static block is executed when the object is created from that class)
-> final (declare constants and can`t be modified) (final methods canot be overwritten) (final classes canot be inherited) (Concrete class can be inherited. Final class is not inherited.)
-> var


## OOPs:
(my points)
Abstraction (Hiding implementation)(but that abstract method in the abstract class should be implemented in the child class) (interface -> 100% abstraction i.e., method should not be implemented in interface)
Encapsulation (Data hiding) (private//public/protected + public getters/setters)
Inheritance (extends-> reusability) 
Polymorphism (method overloading(compiletime) & method overriding(runtime))

Note: 
-> compile time polymorphism = ( A obj = new A()   or   A obj = new A(2,3)) -> here the method call is resolved by the compiler at compile time based on arguments given.
-> Run time polymorphism = (A s = new B();) -> here the method call (overridden method) is resolved at runtime based on the actual object (B).

For a superclass object we can allocate the subclass memory (runtime polymorphism). ( A s = new B(); )


## Notes

Classes -> User defined datatypes, which is a group of variables (data members) and Functions (member methods)

For a class (class = user defined datatype) to use we need to declare a object with that class. (object(variable) is an instance for class).

Constructor (same name as class). (declared public/default) (no return type should be mentioned) (we can have no parameterized / parameterized constructor)

If we have multiple classes in one java code. Only one class is to be public. And the file name should as the public class name. 

Best practice to write one class in one file. Bcz if we want to access other classes in another package which are not public is not possible. (No compile or runtime error came if we didnot follow this approach, but output didn`t come. Ouput came when class is made public) (1st in doubts.md)

## Method overloading (Compile time polymorphism) and method overriding(Run time polsymorphism)
-> If a **single** class have more than one method with same name and difference in method signature it is called **method overloading**. But we should not consider different return type and the same signature as method overloading.

-> If superclass and subclass have a method with same name and signature then subclass method is said to be **overriding** super class method.

-> (Always overriding method is called in which class you may call) (method overriding)

-> All constructors are called if the last inherited class obj is created in multi-level inheritance. And all the data members from all classes are accessible in last class and the overridden method from the last class is only called but no other methods. 


day 1 finished.

day2 stated:

## Access Modifiers:
private (only in that class, we can access using getter and setter)
default (all classes in same pckg)
protected (can be accessed from any class in same pckg & in diff pckg only in class which we will inherit the data member containing class)
public (can be accessed from any class of any package)

## Access Modifiers in Overriding Methods — Rule:

-> When you override a method in a subclass, you cannot make the access modifier more restrictive than the method in the parent class.
Reason:
The Liskov Substitution Principle (L in SOLID) says:
"A subclass should be usable wherever its parent class is expected."

| Parent Method Modifier        | Allowed in Child                          | Not Allowed in Child        |
| ----------------------------- | ----------------------------------------- | --------------------------- |
| **public**                    | public                                    | protected, default, private |
| **protected**                 | protected, public                         | default, private            |
| **default (package-private)** | default (same package), protected, public | private                     |
| **private**                   | **Not inherited** — can't override        | N/A                         |

Note: 
-> private methods cannot be overridden because they are not visible to subclasses.

## Interfaces:
-> childclass implements parentclass (syntax)
-> It is acting as a blueprint for a new class to implement an action.
-> You have to override all the methods (all methods are empty) of interfaces.
-> Variables in interface are public and static.
-> methods in interface are bydefault public and abstract.
-> we can add static method in interfaces then we should implement the method there itself.

Note: default fn in an interface is introduced in java. It has implementation to add common functionality to all classes impletenting that interface. It is static fn.

## Functional interface (Go through day 2 document when there is time)

An interface having only one abstract method. Ways to implement functional interfaces:
1. Overriding
2. Lambda
3. Method references (easy form of lambda functions)

Types of Method references
1. Reference to a static method
2. Reference to a Instance method
3. Reference to a constructor

Functional interface Can have default or static methods (they don’t count as abstract).
Can be annotated with @FunctionalInterface (optional but recommended).
Enables functional programming in Java.
Works well with Streams API, Collections, and parallel processing. (go in detail when you have time)

## Nested classes (later in day 2)

## Anonymous inner class (later in day 2)

## Exception handling

-> To handle runtime errors/exceptions we use exception handling.
-> These are errors at runtime. Exception is also created as an object. All exceptions are pre-defined classes. 
-> Throwable is a superclass of all exceptions and errors ,    and exception class is a subclass. 
-> IOException, SQLException, ArithmeticException are subclass for exception class.

There are 2 types of exceptions:
1. Built in exception (checked exception and unchecked exception) (classification diag. in day 2 doc)
2. User defined exception

-> Exceptions which must be take care is known called checked exception (compile time exceptions). Mandatorily developer should add. compiler asks to handle in IDE itself.
-> If the object is simple obj then it is not your responsibility to close the obj. But if the obj is holding resources like files, socket or connection we need to close that in the catch block or finally block.

-> try, catch, finally, throw, throws

-> throw : Used to explicitly throw an exception. syntax: throw new IllegalArgumentException("Invalid input");
-> throws: Declares an exception may be thrown by a method. syntax: public void readFile() throws IOException { code }


###### Flow of exception raising and catching in catch block
Base Class: In Java, Throwable is the base class for all errors and exceptions. 
Throwing: When an exceptional condition occurs (e.g., a file not found, a division by zero), a Throwable object is created and "thrown" using the throw keyword. 
Handling: Throwable objects can be caught and handled using try-catch blocks, allowing the program to recover from the error or exception and continue execution instead of crashing. 

-> Stack Trace: When a Throwable is created, it captures the current execution stack, providing information about where the error occurred.

## Java assestions:

-> While testing they use this. While code is pushed to production assertion will be removed.
-> syntax: assert condition;
-> assertion exception is raised to check a bug if we have a feeling.
-> If the condition is true the build is successful. If the condition is false it will raise assertion exception and code will be stopped execution and exit.