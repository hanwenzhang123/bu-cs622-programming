---
title: 051022-note
---

## Q: What do we need when we plan to create something complicated?
- A: start with a design first, then create different components and put it together
- A: First, we would identify the product or the information of the project that we're going to build in, and then gather some information about it
- A: ideally whatever user stories, what are the what is the business contacts, from that business context, and you can start to derive out the architecture

software components are written as a functional unit, you create a function you write some code in it and you work with.\
we do some researchers and create a plan, and this, this leads to the introductions of object oriented Program.

## name
- variable, attribute, property, field
- function, method, routine, sub routine

## OOP
- In object oriented programs, we have a class, class is the source of the plan, and then we are instantiate a class.
- And this creates an object, so the object is the implementation of the class that is physically available
- physically available: some place in the memory in the RAM is occupied for that
- From the JVM to RAM, it occupies some space -> only when the class is instantiated, and the object is created

## constructor
- At least one constructor, all the classes are sub-class of an object
- super() - call parent consturctor, the first statements of every constructor is called to the patent class constructors
- this() - refers to the constructor of the class

## global variables
- immediately after we define class
- define them inside the constructor
- leave them empty, call them in the method

## static
- global variable/method shared among all the instances(objects) of class

## naming convention 
https://www.javatpoint.com/java-naming-conventions
- class name: CapitalLetter
- object name (instance of a class): lowercase
- method name: camelCase
- variable name: camelCase
- final name: UPPERCASE
- package name: lowercase


## access control
- private: only available within the class, not outside the class\
- default: package access, member in another class but same package\
- protected: member in superclass in differnt package and same package\
- public: different package and different package


## Downcasting vs Upcasting
- upcasting: parent to be a child
- downcasting(raise error): child to be parent, but child has more details so can not be parent


## OOP Concepts
#### Encapsulation
- usually all class parameters will be defined as private, and we use getter and setter methods to access them
- getter/setter hides the unsafe access to the class parameters/field

#### Inheritance
- extends, single inheritance, a class can extend only one class
- reason: lots of code is repetition - inheritance defines a relationship between class and common attributes.
- a subclass inherits everything, but can provide a new definition to a method call overriding

#### Polymorphism
- allow current part of the system to interact with a new object without concern for specific properties of the new object
- hiding the details in communication, do not go into the details
- it has the ability that an object can take many form
- a class that can pass "is a" test is considered to be polymorphic - newCar is a Car, newCar is a ElectricCar

#### Abstraction
- hiding implementation details from the user

##### Abstract Class
- can not be instantiated (we can not create object from this class)
- can extend the class and its inherited class can be instantiated
- it is a concept that is required to be implemented by its subclasses, should not contains the body, it only has method names (like a template)
- substract class/method can not be private or final
- an abstract class can contain non-abstract method, but not vice versa

##### Interface
- we can not instantiate the interface, it does not have a constructor, can only be implemented
- can implements multiple interface, like a student can be a parent, an employee, a son etc
- all field should be defined as static and final
- all methods should be public and abstract
- `public class Desk implements Shape, Weight {}`
- `public abstract int getWeight()` - need the keyword abstract for the menthod inside the interface


## Abstraction vs Encapsulation
#### Abstraction
- focus on removing unnecessary information
- define it by using Abstract and Interface keyword
- focus on design

#### Encapsulation
- focus on keeping the data safe from outside access and misuse
- define it by using access control keywords like public, private and protected
- focus on the implementation

 
## Assignment 1
```
Class Bullet {
Size
Damage
}

Class SpaceShip {
Boolean shooting
Public shoot ()
Bullet	
gotHit
}

Class Alien{
Type
Speed
Die 
}

```
Aliens Spaceship both inheritance movement like speed pace direction (interface) alien and spaceship override the movement interface
