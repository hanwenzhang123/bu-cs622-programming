---
title: 0607-note
---

# Table of Contents
- [Thread Concepts](#Thread-Concepts)
- [Locks](#Locks)
- [Structured Locks](#Structured-Locks)
- [Unstructured Locks](#Unstructured-Locks)

## Thread Concepts

#### Disk Operation
- performing an operation inside memory is very faster
- accessing disk and performinng IO is slow process
- if a process needs something from disk, usually it would wait until information gets available then uses it
- OS resolve slow disk access by introducing a multi-thread feature, which is called concurrency

#### Definitions
- thread: smallest unit of execution that can be scheduled by the operating system
- task: a unit of work that is performed by a thread
- process: a set of threads that execute in the same shared environment (shared memory space)
- concurrency: executing multiple threads or processes at a time

#### Activity Monitor by Mac
- process controller with threads
- many processors with many threads with many tasks to do

#### CPU and Thread
- A single core CPU can execute only one thread
- multi core CPU can execute more than one thread, but the number could be larger than CPU cores
- OP uses thread sheduler which decides what should be executed

#### OS Thread Scheduler
- OS use thread scheduler to determine which thread should be running on a CPU core
- Round-robin algorithm - same priority, not being used much anymore due to advanced OS

#### Thread Priority
- OS scheduler decides
- we can do it through code like MIN, NORM, MAX

#### Runnable
- A functional interface is an interface that contains only one abstract method, but it can have any number of non-abstract methods.
- java.lang.Runnable is a functional interface that is used to define the work that a thread should execute.
```java
@FunctionalInterface
 public interface Runnable {
     void run();
}
```

#### A class that runs something inside a thread
```java
public class ThreadExample implements Runnable {
  public void run(){    //using run instead of main()
    // what is running inside the thread goes here
} }
```

#### Creating a Thread
1. Defining the thread within the tasks it should perform. - inside the run method
2. Starting the thread. - inside the main method
- There is no guarantee about the order of threads to be executed in Java.

#### Difference between run() and start()
- start(), will starts a new thread and the JVM assigns it to a CPU core.
- run(), will execute the content of a thread.

#### Summary of Concurrency in Java
- Thread is a class
- Runnable is an interface
- The Thread class implements Runnable
- The argument passed to the thread constructor must be a Runnable.
- The threads spawned by a process run asynchronously
- Threads are random, not garanteed, a thread is running out of our control after it has been started


## Locks
#### Race Condition Problem
- two threads, both are calling same method

## Structured Locks


## Unstructured Locks




