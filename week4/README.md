---
title: 053122-note
---

# Table of Contents
- [Memory](#Memory)
- [Algorithm Complexity](#Algorithm-Complexity)
- [Search Improvement Methods](#Search-Improvement-Methods)
- [Bloom Filter](#Bloom-Filter)

# Memory

## Memory Management
- Java has automatic memory management, it automatically performs garbage collection (new version Java)
- garbage collection automatically cleans things up in your memory
- garbage means class objects which are instantiated but not in use anymore, they occupy memory, and compiler should remove them

## Memory Structure
- Java divides memory into two parts, `stack` and `heap`
- `Stack`: stores primitive types, and hold a reference to heap objects
- `Heap`: actual object will be stored

![Stack Heap]( Stack-Heap.png "Stack-Heap" )

## Stack vs Heap
- `Stack` size is flexible, memory allocation is automatic, has size limits accoridng to OS that hosts JVM, variables remain as long as function is runnning
- if stack is full, `StackOverFlowError`
- `Heap` is not managed automatically, we need to free allocated memory by code, prone to memory leak problem, no size limit in heap
- if heap is full, `OutOfMemoryError`

## What to do if StackOverFlowError?
- restart the JVM

## Why using primitives
- compare to stack, objects in heap are much slower to access, slower to write to the memory on heap
- because primitivies reside on the stack and stack is significantly faster than the heap.

## Heap in memory
- we have only one heap memory for each JVM process
- heap is a shared part of memory regardless how many threads are running inside the java
- `Xms<size>` - initial java heap size
- `Xmx<size>` - maximum java heap size
- `Xss<size>` - set java thread stack size
- `java -Xmx6g myApplication`
  
## Memory Reference Type in Java
- Strong: When there is a direct reference to an object and it is not eligible for garbage collection. `Test obj = new Test()`
- Soft: When an object is free for garbage collection, but it is not yet garbage collected, until JVM is running low on memory and looking for objects to remove. `g = null;  // Marked for gc, but JVM might not do it immediately.`
- Weak: When an object has neither strong nor soft reference, it is a weak reference. Weak references should be explicitly specified while referencing them.
- Phantom: Objects are eligible for GC, but JVM puts them in a queue called “ReferenceQueue”. We don’t know a phantom referenced object is dead or alive.

## Garbage Collection
- When the Heap becomes full, garbage is collected. 
- Stack is last in first out, so there is no need to garbage collect. 
- => Stack memory is collected automatically when the execution path reaches the end of the scope

## gc process
- obj, var, func allocation -> obj, var, func read/write location -> process is continued until the program ends -> memory is released when program ends
- release the memory if a location is not reachable

# Algorithm Complexity
## Big O Notation
- O(1) - constant time
- O(n) - linear time
- O(n log n) - logarithmic time
- O(n^2) - n squared time

![Big O Notation]( Big-O.png "Big O Notation" )


# Search Improvement Methods
- we work with a lot of data, we need to know how to search data in an efficient way

## Hash Tables
- key value storage converting information into address in the memory
- quickly lookup, enables the system to rapidly access the data

#### BitCask
- hash index, stored inside memory, with one single disk seek
- useful when we have lots of update in our key-value pair

## Tree Structures
- a sub type a graph data structure, which has a root and child node (but without cycle)
- reduce the search space in brute force (like binary tree, which one is larger smaller)

#### Scanning the tree
- Breadth First Search (left to right)
- Depth First Search (deep then next)

#### Binary Tree
- each node has only 2 children
- useful when data are havig a sorted order inside the tree
- check whether the new data object is smaller or larger than the root.
- If it is smaller then, it goes and search the left side of the tree, otherwise, if it is greater it goes and search the right side of the tree.

#### Operation
- search - efficent - O(log n)
- insertion - not efficient O(2n), when table is not empty - O(n^2)

#### 2-3 search tree
- hold more than one key, keys are ordered

#### B-Tree
- balancing factor tree, a type of 2-3 search tree, which node can have more than 2 child, leaves must be the same depth
- useful for sequence, creating index in database

#### Trie, Prefix, Radius
- trie nodes are assumed to be ordered from the root, and root node is always empty
- trie is useful for auto-complete

## Bit Manipulations & Compression
- compression makes search faster, make data into another format which is smaller
- process done on bit level, into binary format

#### Bitmap indes
- useful for data with low cardinality (diversity of data is limited, like male or female)

#### Huffman Encoding
- a technique of compressing data to reduce its size without losing any of the details.

## Sliding Window
- useful for voice command, smart speaker, voice feature

![Sliding Window]( Sliding-Window.png "Sliding Window" )

## MinHashing
- popular for information retrieval, a technique for quickly estimating how similar two sets are (estimate set similarity)
- easier to compare, randomly permutes rows and have a matrix

# Bloom Filter
- probabilistic data structure, if a particular data existed in a set or not, its output tells the target data object does not exist in the st or might exist
- memory efficient and running time faster
- base structure is a bit vector

## bit vector
- When we add a data into the bit vector, it transfers the original data from a hash function into a bit vector and set some bits in its bit array. 
- Then, later we can check whether the data existed inside Bloom filter, by checking the bits which are set to 1.

## Objective
- Searhing the database is expensive, and we try to avoid it; instead, we search the bit vector

