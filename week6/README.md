---
title: 0614-note
---

# Table of Contents
- [Batch Processing](#Batch-Processing)
- [Stream Processing](#Stream-Processing)
- [Messaging](#Messaging)
- [Asynchronous Messaging](#Asynchronous-Messaging)
- [Synchronous Messaging](#Synchronous-Messaging)

## Batch Processing
- there is no software that has no batch processing wherever you are implementing a software.
- everything is processed in a batch and then send out maybe the next day
- no synchronous messaging system in batching, batching is as a concept of isolation

#### Batch processing Overview
- popular common example - backup system
- takes a large amount of input data and uses a background job to process them.
- Usually, batch processing jobs were written with OS scripting
- batch processing jobs were executed at the same machine where the data is located.

#### Batch Job
- we might have some tasks that the delays are tolerated and those tasks or operated code in the batch as batch job or batch work

#### When do we use batch?
- we have a large amount of input data, and we have a large processing, which is very time consuming, and these are the tasks that are very time consuming we refer them as a batch job.

#### Example of Batch processing
- system updates
- backup daily/weekly data into another safe storage
- compressing logs and history of transactions of the system
- Sorting the entire dataset 
- Clustering data
- Bulk database updates
- Converting files format to another format
- Image processing on large number of images
- Jenkins trigger pipelines

#### Output of Batch processing
- usually is not a report for human. It is something that is used by the application
- Human just need to know if it is successful or failed

### MapReduce
- allows us to distribute our computation for a specific task among several machines.
- Every organization has lots of old machines and mapreduce enabled to benefit from these old machines, it divides a large task among multiple machines
- similar to parallel processing but utilize the computation across different machines
- if task failed, mapreduce simply redo the task, until the task success

#### MapReduce to parallel processing
- we have petabytes of data and it makes the parallel processing
- we have 10 different machines, some of them are outdates, some of them are not
- by making parallel implementation, the mapreduce distribute the task on these 10 different machines which can not be done by one single machine

#### what is parallel processing
- a method in computing of running two or more processors (CPUs) to handle separate parts of an overall task
- take in multiple different forms of information at the same time, ability to deal with multiple stimuli simultaneously.

#### MapReduce Stages
- It has three stages, Map, Shuffle and Reduce.
1. read lots file and order them or sort them or search something
2. break input into smaller chunk => use mapreduce we can distribute it among different machines and do the search faster
3. mapping function extract the key value pairs from each input records so every data in a mapreduce is seen as a key value pair and it sorts them and the reducer iterate over them and do tasks like merging them or sorting them

#### MapReduce Example
![MapReduce]( map-reduce.png "MapReduce" )
- map is separating the documents do a small task
- shuffle is combining these documents together
- reducer is merging the results of the shuffle and produce the output

#### MapReduce Challenges
- MapReduce reads the entire content of file which can be expensive, if one single task failed, will redo from the beginning
- The range of the program we can solve with MapReduce is very limited, but still popular because it is used to search a keyword, sort database etc
- only get completed when all mappers and reducers have been completed. Therefore, the system waits until the slowest machine finishes its job.
- MapReduce is not good for iterative algorithms.

#### Iterative Operation on MapReduce
- MapReduce I/O: read -> write -> repeat => can be very expensive
- you can avoid writing by storing it in memory so you are not rewriting over and over again
- solution: SPARK architecture RDD (Resilient Distributed Dataset), add a distributed memory

#### SPARK
- MapReduce and similar products are called Data Flow Engines.
- the newer batch processing tool, a clustering framework build on top of the MapReduce
- tries to resolve issues existing in MapReduce (e.g. working with graph data, iterative algorithms, etc.).

#### cluster management
- Partitioning and fault tolerant are two major challenges of distributed systems.
- Apache Hadoop framework - Industries are heavily using apache tools for their big data
- The main feature of SPARK is its in-memory cluster computing which decrease the latency in a batch job.
- Latency is a synonym for delay.

#### SPARK Advantages
- decrease the latency by puttting lots of computation in memory, so it stores intermediate processing delivery
- supports stream data, machine learning and SQL queries as well

#### SPARK Disadvantage
- using lots of RAM (memory), thus it is running very fast.
- memory is very expensive, SPARK is memory intensive, MapReduce is more affordable

#### MapReduce Pros and Cons
- Advantages: inexpensive, capable of doing limited popular tasks like sorting searching, works with legacy hardware, it works with any old computer and fairly easy setup
- Disadvantage: slow, when one task fail, it will rerun, and when one machine slow, other machines should wait for this particular machine

#### Fault Tolerance in Batch Jobs
- When a job failed, simply batch processor restart that job.
- Execute the tasks several times does not affect the output of the system.
- To handle big jobs, we can create small partitions called microbatches.
- when we have a large batch processing jobs, would like to separrate it into smaller units and instead of executing this large task, we just execute the smaller units together


## Stream Processing
- Something between real-time and batch processing, sometimes it is near real-time processing as well.
- We are creating a window, and we are analyzing a window of data, which caused stream processing
- Asynchronous and Synchronous are the sub-topics of Stream Processing

#### Stream Data
- lots of data are unbounded, we do not know when is the start of the data
- we do not access the old data, instead we put the frame and analyze the data like for last three months
- Stream data is a data that is incrementally made available over time
- we put a window, a block, we get the data, then we analyze that

#### Terminology
- In stream processing, we refer data as events, created by publisher or producer
- In batch processing, we refer data as records, created by by jobs

#### Stream
- Publisher produces the data and subscriber consumes the data.
- Polling information from a dataset is an expensive process and it is usually associated with I/O operatio

#### reduce the cost of polling
- avoid frequent polling by enabling the publisher (data producer) to notify the subscriber (data consumer)
- whenever the information is available the publisher notifies the subscriber, the subscriber does not need to do polling frequently


## Messaging
- we have two types of communications, synchronous and asynchronous between different software components
- synchronous - communication happening in the real time, like zoom, slack
- asynchronous - waiting is associated with communication, not in the real time, like emails

### Asynchronous Messaging
- queue up certain amount of response and then send it maybe in a batch
- publisher will produce a data that put in message bus, subscriber are not directly get the message from the publisher, instead, get the message from a message bus
- message bus - a sort of buffer that we put messages there, and pull the message when they are available to use
- software: RabbitMQ - big app needs to transfer messages between different software components

#### Why Asynchronous Messaging
- when your system is making a call to another system, while waiting on response, if the other system is done, then it is going to fail; whereas if you send it to a broker, it is going to be up and process in time eventually
- we have diffrerent resources either producing or consuming messages, they are not in the same pace, to keep the pace of data, we use message bus

#### What happen when a receiver can not keep up with the sender?
- Scenario 1: Drop Message (best way to deal with video data is to drop some packets)
- Scenario 2: Buffer Messages in a Queue
- Scenario 3: Flow Control (when slow consumer can not cope with the faster producer, simply block, can not receive any more data)
- TCP uses Flow Control, which also called back pressure, like local says the publisher stop producing data or stop sending data, do not accept any more data

#### What happen if a system loses a message?
- we can keep a backup of messages into a buffer, or to a memory, or on the disk, or use an auxiliary memory buffer (message queue)
- Application can cope with loosing messages when it has a high throughput and low latency (fast response time)
- Response time: It is the time between requesting for something and receiving back the response => the time you get back the response when you send request
- Throughput: The number of process that are completed per unit of time => like selling things online, handle huge amount of transactions like 1 million transaction per hour
- The heavy load on the data is throughput, you can test a throughput by putting a load on the data, called load test

#### solution to avoid dropping message
- keep messages in a buffer to avoid losing messages - which becomes asynchronous operation process

#### High Reliability in Batch Processing
- Batch processing does not have the challenge of losing a message as the messages are static, consumers will get the messages when they are ready for them
- When the tasks fail, we just re-execute them, because response time is not an issue
- batch jobs are usually idempotent operations => multiple executions of a job has the same effect as we performed it once, e.g. sorting static data, storing a key-value data in a set that does not allow duplicate with the same key (value will be overwritten)

#### Multiple Receiver Patterns
- Load balancing: deciding which consumers to process which message, some consumers that have more resources can process more expensive messages consumer who has less resources can produce
- Fan-out: 

### Synchronous Messaging
- near real time


#### Message System (web sockets)
- send over individual packets, try to be near real time and as synchronous as possible
- set up a connection, if you lose connection at any point, you can not get the message to come across for it due to synchronous
- ability to replay - if you lose connection and you have some event driven process that requires messages to come back across, but you lost connection and missed that message, you can not get back unless you go back and replay it
- the process of replaying messages and getting things that are in the queue that is going to be asynchronous because you have to go back and get a specific thing possibly as part of a batch thing but at very least it is not real time
