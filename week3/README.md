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
- hashset, linked hashset, treeset (hash translate to some address inside the memory)
- arraylist, linked list, stack, vector
- priority queue, array deque, deque/linkedlist
- hash map, hash linked map, hash table, tree map

# Generics

# Lambda
