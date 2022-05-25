---
title: 052422-note
---

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
- hash as mathematical information, we give some objects to the hash, hash translates to some address inside the memory => access information very rapidly

## tree
- store the information in the tree is very fast
- the location where we put the information in the tree in every step we can also get rid of lots of information
- we order the information and put them in tree instead of comparing data 

## common collection methods
- boolean add(E element)
- boolean remove(Object object)
- boolean isEmpty()
- int size()  // return integer
- void clear()
- boolean contains(Object object)   //whether exists

## list operations 
- list => we can access to the position of the element using index (offset)
- List objAL = new ArrayList();   => fastest java colelction
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

## iterator
- Iterator iter = listName.iterator()
- iter.hasNext()  // if it has the next line
- iter.next()   //get no pointer exception when gets to the last 





# Generics

# Lambda
