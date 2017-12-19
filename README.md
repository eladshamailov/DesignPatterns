# DesignPatterns
implantation of design patterns.

## Intro
implantation in java of common design patterns. all the code is commented to make your learning easier.

## Abstract Factory design pattern
The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products.[1] This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface. [Credit to wikipedia](https://en.wikipedia.org/wiki/Abstract_factory_pattern)

## Adapter design pattern
In software engineering, the adapter pattern is a software design pattern (also known as Wrapper, an alternative naming shared with the Decorator pattern) that allows the interface of an existing class to be used as another interface.It is often used to make existing classes work with others without modifying their source code. An example is an adapter that converts the interface of a Document Object Model of an XML document into a tree structure that can be displayed. [Credit to wikipedia](https://en.wikipedia.org/wiki/Adapter_pattern)

## Bridge design pattern
The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently", introduced by the Gang of Four.The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.  [Credit to wikipedia](https://en.wikipedia.org/wiki/Bridge_pattern)

## Builder design pattern
The builder pattern is an object creation software design pattern. Unlike the abstract factory pattern and the factory method pattern whose intention is to enable polymorphism, the intention of the builder pattern is to find a solution to the telescoping constructor anti-pattern citation needed that occurs when the increase of object constructor parameter combination leads to an exponential list of constructors. Instead of using numerous constructors, the builder pattern uses another object, a builder, that receives each initialization parameter step by step and then returns the resulting constructed object at once. [Credit to wikipedia](https://en.wikipedia.org/wiki/Builder_pattern)

## Chain of Responsibility design pattern
In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to the end of this chain. Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime. [Credit to wikipedia](https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern)

## Command design pattern
In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method and values for the method parameters. [Credit to wikipedia](https://en.wikipedia.org/wiki/Command_pattern)

## Composite design pattern
In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly. [Credit to wikipedia](https://en.wikipedia.org/wiki/Composite_pattern)

## Decorator design pattern
In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly. [Credit to wikipedia](https://en.wikipedia.org/wiki/Composite_pattern)

## Facade design pattern
The facade pattern (also spelled façade) is a software design pattern commonly used with object-oriented programming. The name is an analogy to an architectural façade.

A facade is an object that provides a simplified interface to a larger body of code, such as a class library. A facade can

* make a software library easier to use, understand, and test, since the facade has convenient methods for common tasks,
* make the library more readable, for the same reason,
* reduce dependencies of outside code on the inner workings of a library, since most code uses the facade, thus allowing more flexibility in developing the system,
* wrap a poorly designed collection of APIs with a single well-designed API.
[Credit to wikipedia](https://en.wikipedia.org/wiki/Facade_pattern)

## Factory design pattern
In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor. [Credit to wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)

## Flyweight design patten
In computer programming, flyweight is a software design pattern. A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects; it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory. Often some parts of the object state can be shared, and it is common practice to hold them in external data structures and pass them to the objects temporarily when they are used. [Credit to wikipedia](https://en.wikipedia.org/wiki/Flyweight_pattern)

## Interpreter design pattern
In computer programming, the interpreter pattern is a design pattern that specifies how to evaluate sentences in a language. The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language. The syntax tree of a sentence in the language is an instance of the composite pattern and is used to evaluate (interpret) the sentence for a client. [Credit to wikipedia](https://en.wikipedia.org/wiki/Interpreter_pattern)

## Iterator design pattern
In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.  [Credit to wikipedia](https://en.wikipedia.org/wiki/Iterator_pattern)

## Mediator design pattern
In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior. [Credit to wikipedia](https://en.wikipedia.org/wiki/Mediator_pattern)

## Memento Pattern
The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback). [Credit to wikipedia](https://en.wikipedia.org/wiki/Memento_pattern)


