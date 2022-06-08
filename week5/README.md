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
- synchronize: imposes a lock on the increment while a thread is working with it.

```java
synchronized void increment(val){ 
 val = val+1
}
```

#### Mutually Exclusive - Only 1 thread can use it
- A content of the synchronized method is called **mutually exclusive**, because one thread at a time can work with it.
- As soon as the thread is starting to work with this method, there will be lock on this method and no other method can use it.
- When a thread is done, the lock will be released and other threads can use it.
- disadvantage: enforcing it to wait, everything will be slowing down when we use `synchronized`, you have to wait

#### Atomic - only lock to one variable
- a property of operation, which disables any other thread interface on that operation
- instead of synchronizing a method of a block of code which is making slow, just synchronize one, put a lock on one particular variable

#### Synchronization Disadvantage
- The objective of multi-threat programming is doing task multiple tasks in parallel. By enforcing a lock we disable the multi tasking features, which might increase response time.
- Synchronization protects data integrity, but its costs will be on response time.
- Being able to identify the performance bottleneck of a system, especially in multithread environment is very valuable capability.


## Unstructured Locks
- Locks are nested inside each other

#### How to Resolve Nested Locks
1. Using ReentrantLock (Interface Lock or Try Lock) - ReentrantLock will hold the lock until the thread is done.
2. Using Read/Write Lock - Read/Write Lock separates read and write operation and implement different locks for them

#### ReentrantLock
- Lock implementations provide more extensive locking operations than can be obtained using synchronized methods and statements.

```java
Lock lock = new ...;
 lock.lock();
 try{
  // use the resource protected by this lock
 }
 finally {
  lock.unlock();
 }
```

#### Read/Write Lock
- Read Lock: It will be unlocked if no thread is reading or writing.
- Write Lock: It will be unlocked if no thread is writing and no thread has requested write access.

Note: 
- Read occurs more frequently than the Write.
- More than one thread can hold a Read Lock
- Only one thread can holds the Write Lock

#### Semantic Errors in Concurrency
- DeadLock: 2 threads, each thread implements a lock to each other
- LiveLock: not locked, but never ended
- Starvation: when have too many small threads, some might never get called, the ones that we are not called, called starved.

#### ExecutorService & Thread Pools
- try to do everything in the same class

1. Executor: It is an interface, with an execute() method to launch a task specified by a Runnable object.

