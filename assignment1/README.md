# BU CS 622 Assignment 1

## Donkey Pong Game

#### Object-oriented programming (OOP) :
This game is built based on the concept of Object-Oriented Programming. 
Class as the blue-print, instantiate objects based on the blue-print. Using objects to represent things you are programming about, variable as properties, function as methods.
* **Encapsulation**:
    * Variables are not publicly exposed
    * I have used getter and setter methods to access class variables throughout the project
* **Abstract**
  * shows only essential attributes and hides unnecessary detail information
  * `Character` is an abstract class, can only extend one abstract class
  * `Left`, `Right`, `Up`, `Down` in the map package are interfaces, these are implemented in the `Position` class
* **Inheritance**
  * Inherits parent logics using _extends_ keyword, call super() first line in constructor
    * Cask extends Weapon
    * Mario extends Character
    * Gorilla extends Character
  * We can provide a new definition to a method called overriding using `@Override`
    * `die()`, `damaged()`, `damaged(int point)` in Mario and Gorilla class
    * `getDamageInformation()` in Cask class
* **Polymorphism**
  * A single action can be performed in many forms, hiding the details in communication.
    * Mario _is a_ character.
    * Gorilla _is a_ character.
    * Cask _is a_ character.