---
title: 052422-note
---

# Table of Contents
- [Collections](#Collections)
- [Generics](#Generics)
- [Lambda](#Lambda)


# Collections
## Why using collections?
- CPU Cache -> fastest state, size is limited, price is expensive, java can not write to cpu cache directly, but C++ would
- RAM  -> small amount size, reading data is slower than cpu cache, but significantly faster than disk 
- DISK -> we can put high amount of storage, but reading and writing to disk is very slow

## What is collections?
- a collection is a group of similar objects gathered together in java objects
- collection is the way we are maintaining information in the RAM 
- we use collections to store information in the memory, it is limited, but it is very fast to access that

## collections in java
- we are text data and binary stream data when we write to disk
- we write java objects in collections `A = {obj1, obj2, obj3}`
- because when the electricity cuts off, everything in the memory is going to be faded away, if we would like to persist them, we write them on disk
- collection is a database which keeps data into the heap memory (not disk)

## collection types 
- list: ordered collection, allows duplicate entries, we use index to access to its elements
- set: similar to list, but does not allow duplicate
- queue: ordered first in first out
- map: key value collection

## queue stack
- queue: first in first out
- stack: first in last out

## implementation classes
- hashset, linked hashset, treeset
- arraylist, linked list, stack, vector
- priority queue, array deque, deque/linkedlist
- hash map, hash linked map, hash table, tree map

## hash
- we store our objects into collections, and those objects get applied to mathematical functions that applied to that object, and then an integer number is returned to it
- hash as mathematical information, we give some objects to the hash, hash translates to some address inside the memory
- access information very rapidly
- not sorted

## tree
- the location where we put the information in the tree in every step, we can also get rid of lots of information
- we order the information and put them in tree instead of comparing data 
- store the information in the tree is very fast
- sorted

## implementation classes comparison in Map
- `HashMap`: does not maintain insertion order, O(1)
- `LinkedHashMap`: maintain insertion order, O(1)
- `TreeMap`: sorted ascending order based on keys, not elements, O(log N)

> Key in all Map is unique. \
> Add duplicate key, then it will be overwritten.

## iterator
- Iterator iter = listName.iterator()
- iter.hasNext()  // if it has the next line
- iter.next()   //get no pointer exception when gets to the last 

## common collection methods
- boolean add(E element)
- boolean remove(Object object)
- boolean isEmpty()
- int size()  // return integer
- void clear()
- boolean contains(Object object)   //whether exists

## list operations 
- list => we can access to the position of the element using index (offset)
- List objAL = new ArrayList();   => fastest java collection
- List objLL = new LinkedList();
- List objV = new Vector(); => outdated, new version is ArrayList
- List objS = new Stack();  => outdated, new version is ArrayDeque

## list operations
- search (int indexOf(Object o), int lastIndexOf(Object o))
- iteration (simply a traditional for loop, or iterator object)
- sub range (List subList(int fromIndex, int toIndex))

## LinkedList
- both queue and list in java
- advantages: we can read/add/remove from both beginning or end of the linkedlist

## ArrayDeque
- growable array that allows us to add or remove an element from both sides.
- ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out)

## Set
- remove duplicate object entries, very fast
- unordered and unindexed collection having no duplicate elements
- `set.iterator().next();` - will return the first element

## Map 
- key value style of data
- HashMap() - stores map keys in a hash table, since using hash, it is one of the fastest collection to store data => O(1)
- TreeMap() - very fast but not as fast as HashMap. keys are always sorted => O(n log n)

## Map Example 
- `Map<String, String> map = new TreeMap<>();` => ordered 
- `Map<String, String> map = new HashMap<>();` => not ordered
- `map.put("koala", "bamboo");`

## performance
- array is faster than vector and map
- arrayDeque -> arrayList -> vector -> HashMap -> TreeMap


# Generics
## primitives
- primitives are faster, we can store a reasonable amount of them in memory
- each primitive has a corresponding wrapper class and auto boxing automatically converts the primitive into its wrapper class (generic type) and vice versa

## 7 primitives
1. boolean -> Boolean
2. byte -> Byte
3. int -> Integer
4. long -> Long
5. double -> Double
6. char -> Character
7. float -> Float

## <> diamond operator
- after java 5, we use diamond operator to specify what is the type of the object is going to be in that collection for type casting
- now with autoboxing, we can convert them to the desired data type

```js
// both are the same, accepting only string
List<String> sampleArray = new ArrayList<String>(); 
List<String> sampleArray = new ArrayList<>(); 
```

## generic programming
- generic first, to be specified later, then instantiated when needed for specific types of provided parameters
- children have more details than the parents, right side always has more details

## why generic programming
- there is an object but do not know the type ofobject, but we are going to specify the type of the object later in the code

## naming conventions
- E for an element
- K for a map key
- V for a map value
- N for a number
- T for a generic data type
- S, U, V and so forth, for multiple genric types

## can not done with generics
- calling a constructor
- can not calling instanceof
- can not create an array of static types
- use primitives type as generic parameters

## static
- when we specify static, we say that there is one particular place in memory assigned to this particular object
- with generic, we are saying that we do not know the type of objects, we decide later

## bounds
- generics were be treated as objects, and thus do not have many methods available
- bounds operatior: "?" - which is a generic type can be used to specify bound for the generic

## example
- `List<? extends Number> list = new ArrayList<Integer>();`

## Why Generic?
- because we have an object that we would like to specify the type of the objects later

## Why Wild Card?
- because generics provides too much freedom, you would like to make a bit more concentrate and apply bit more constraints on the chaos u


# Lambda
- in Java, everything we write belongs to the class
- lambda, introduced in Java 8, does not need to belong to any class, jump outside object oriented programming => functional programming
- `(n) -> System.out.printLn(n)` - parameter name - arrow - body

## functional interface
- a functional interface is an interface that contains only ONE abstract method, they can have only ONE functionality exhibit
- `@FunctionalInterface` - no needs @symbol denotes annotation enables developer to know on which interface they can apply lambda, you can have or not have

## anonymous method
- a function without a name
- arguments -> body of lambda expression

## FuntionalInterface
```java
public interface Run extends Sprint {}    //extends sprint interface

public interface SpirntFaster extends Sprint {
  public void sprint(Animal animal);
}

public interface Skip extends Sprint {
  public default int getHopCount (Kangaroo kangaroo) {    //ok, but not recommended
    return 10;    
  }
  public static void skip(int speed) {}
}
```

