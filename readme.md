# Java Intro Object Oriented Programming (OOP)
OOP is the tasteful interaction between objects to achieve a common goal.  In a proper object oriented solution
all the objects share the same level of responsibility (weight).  All the objects follow the Single Responsibility 
Principal (SRP), an object knows how to do one thing extremely well.  A group of objects that work together can
be organized into a package.

Assignments are located [here](assignments.md).

# Pillars of Object Oriented Programming
Crusty Apple PIE?
- **C**omposition
- **A**bstraction
- **P**olymoripshm
- **I**nheritance
- **E**ncapsulation

#### Composition
Compositions (Aggregation) is when an object contains another object.  Objects that contain many other objects
can be hard to test.  Composition leads to objects that are tightly dependent on each other.  Dependency
injection is a programming technique that reduces the tight dependency between objects.

#### Abstraction
To abstract something means to hide away the implementation details.  When you call/use the function you don't have to understand exactly what it is doing.
- Keywords/concepts:
  - `class`
  - `interface`
  - `abstract`
  - Methods/functions

#### Polymoripshm
Polymorphism means "the condition of occurring in several different forms." That's exactly what the fourth and final pillar is concerned with – types in the same inheritance chains being able to do different things.
- Keywords
  - `@Override`
  - `abstract`
  
#### Encapsulation
The definition of encapsulation is "the action of enclosing something in or as if in a capsule". People often refer to this as data hiding.
- Keywords
  - `public`
  - `protected`
  - `private`
  
#### Inheritance
Inheritance lets one object acquire the properties and methods of another object.
- Keywords
  - `extends`
  - `implements`?
- Java only supports single inheritance, other languages such as Python support multiple inheritance
- The `public` and `protected` properties are fully accesible

# The Golden Rule
A method is a subroutine or a function, but not both.  A subroutine is code that possibly changes the 
state (data) of an object but does NOT return anything.  A function is code that returns something but 
does NOT change the state of the object.

# Best Practice
Avoid heavily nested objects, prefer only one or two levels of inheritance.  Use the `final` keyword in your 
classes to indicate to other developers that the class should NOT be subclassed/extended.

# Videos


# Links
[4 Pillars](https://www.freecodecamp.org/news/four-pillars-of-object-oriented-programming/)