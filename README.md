# DesignPatterns
Implantation of design patterns.

## Intro
Implantation of common design patterns in java. all the code is commented to make your learning easier.

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

## Memento design pattern
The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback). [Credit to wikipedia](https://en.wikipedia.org/wiki/Memento_pattern)

## Observer design pattern
The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. [Credit to wikipedia](https://en.wikipedia.org/wiki/Observer_pattern)

## Prototype design pattern
The prototype pattern is a creational design pattern in software development. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This pattern is used to:

* avoid subclasses of an object creator in the client application, like the factory method pattern does.
* avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.

To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation. [Credit to wikipedia](https://en.wikipedia.org/wiki/Prototype_pattern)

## Proxy design pattern
In computer programming, the proxy pattern is a software design pattern. A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy, extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface. [Credit to wikipedia](https://en.wikipedia.org/wiki/Proxy_pattern)

## Singleton design pattern
In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton. [Credit to wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern)

## State design pattern
The state pattern is a behavioral software design pattern that implements a state machine in an object-oriented way. With the state pattern, a state machine is implemented by implementing each individual state as a derived class of the state pattern interface, and implementing state transitions by invoking methods defined by the pattern's superclass. [Credit to wikipedia](https://en.wikipedia.org/wiki/State_pattern)

## Strategy design pattern 
In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime. The strategy pattern
* defines a family of algorithms,
* encapsulates each algorithm, and
* makes the algorithms interchangeable within that family.

[Credit to wikipedia](https://en.wikipedia.org/wiki/Strategy_pattern)

## Template design pattern
In software engineering, the template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses.It lets one redefine certain steps of an algorithm without changing the algorithm's structure. [Credit to wikipedia](https://en.wikipedia.org/wiki/Template_method_pattern)

## Visitor design pattern
In object-oriented programming and software engineering, the visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existent object structures without modifying the structures. It is one way to follow the open/closed principle. [Credit to wikipedia](https://en.wikipedia.org/wiki/Visitor_pattern)


