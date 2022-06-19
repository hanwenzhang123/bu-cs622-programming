---
title: 0614-note
---

# Table of Contents
- [Batch Processing](#Batch-Processing)
- [Stream Processing](#Stream-Processing)
- [Asynchronous Messaging](#Asynchronous-Messaging)
- [Synchronous Messaging](#Synchronous-Messaging)

## Batch Processing
- there is no software that has no batch processing wherever you are implementing a software.
- everything is processed in a batch and then send out maybe the next day
- no synchronous messaging system in batching, batching is as a concept of isolation

#### Stream processing
- something between real-time and batch processing, usually done in the near real time

#### Batch processing 
- popular common example - backup system
- takes a large amount of input data and uses a background job to process them.
- Usually, batch processing jobs were written with OS scripting
- batch processing jobs were executed at the same machine where the data is located.

#### Batch Job
- we might have some tasks that the delays are tolerated and those tasks or operated code in the batch as batch job or batch work
- we have a large amount of input data, and we have a large processing, which is very time consuming, and these are the tasks that are very time consuming we refer them as a batch job.
- example: system updates, backup, compressing logs, jenkin triggers pipelines

#### Output of Batch processing
- usually is not a report for human. It is something that is used by the application

#### MapReduce
- allows us to distribute our computation for a specific task among several machines.
- It has three stages, Map, Shuffle and Reduce.


## Stream Processing
- Asynchronous and Synchronous are the sub topics of stream

## Asynchronous Messaging
- queue up certain amount of response and then send it maybe in a batch

## Synchronous Messaging
- near real time

#### solution to avoid dropping message
- keep messages in a buffer to avoid losing messages - which becomes asynchronous operation process

#### Message System (web sockets)
- send over individual packets, try to be near real time and as synchronous as possible
- set up a connection, if you lose connection at any point, you can not get the message to come across for it due to synchronous
- ability to replay - if you lose connection and you have some event driven process that requires messages to come back across, but you lost connection and missed that message, you can not get back unless you go back and replay it
- the process of replaying messages and getting things that are in the queue that is going to be asynchronous because you have to go back and get a specific thing possibly as part of a batch thing but at very least it is not real time
