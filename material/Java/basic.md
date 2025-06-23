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
final, var

## OOPs:
(day 1 document)
Abstraction, Encapsulation, Inheritance (extends), Polymorphism


## Notes

Classes -> User defined datatypes, which is a group of variables (data members) and Functions (member methods)

For a class (class = user defined datatype) to use we need to declare a object with that class. (object(variable) is an instance for class).

Constructor (same name as class). (declared public/default) (no return type should be mentioned) (we can have no parameterized / parameterized constructor)

If we have multiple classes in one java code. Only one class is to be public. And the file name should as the public class name. 

Best practice to write one class in one file. Bcz if we want to access other classes in another package which are not public is not possible. (No compile or runtime error came if we didnot follow this approach, but output didn`t come. Ouput came when class is made public) (1st in doubts.md)

## Method overloading and method overriding
-> If a **single** class have more than one method with same name and difference in method signature it is called **method overloading**. But we should not consider different return type and the same signature as method overloading.

-> If superclass and subclass have a method with same name and signature then subclass method is said to be **overriding** super class method.

-> With subclass method only we are able to implement superclass method. We can`t implement only superclass without subclass method implementing (method overriding) (Always overriding method is called in which class you may call)


search with chaitanya -> day 1