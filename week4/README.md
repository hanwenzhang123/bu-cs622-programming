---
title: 053122-note
---

# Table of Contents
- [Lambda](#Lambda)
- [Memory](#Memory)
- [Algorithm Complexity](#Algorithm-Complexity)
- [Search Improvement](#Search-Improvement)
- [Bloom Filter](#Bloom-Filter)

# Lambda
- in Java, everything we write belongs to the class
- lambda, introduced in Java 8, does not need to belong to any class, jump outside object oriented programming => functional programming
- `(n) -> System.out.printLn(n)` - parameter name - arrow - body

## functional interface
- an interface that contains only ONE abstract method, they can have only ONE functionality exhibit
- `@FunctionalInterface` - no needs @symbol denotes annotation enables developer to know on which interface they can apply lambda, you can have or not have

## anonymous method
- a function without a name
- arguments -> body of lambda expressionç√

# Memory

## Memory Management
- Java has automatic memory management, it automatically performs garbage collection
- automatically clean things up in your memory

## Memory Structure
- Java divides memory into two parts, stack and heap
- Stack: stores Java Primitive types, and hold a reference to heap objects

## Stack vs Heap
- Stack size is flexible, memory allocation is automatic and has size limits, if stack is full, stack overflow error
- Heap is not managed automatically, we need to allocate memory by code

# Algorithm Complexity
## Big O Notation
- O(1) - constant time
- O(n) - linear time
- O(n log n) - logarithmic time
- O(n^2) - n squared time






