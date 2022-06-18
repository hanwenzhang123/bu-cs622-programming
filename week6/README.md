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

#### Stream processing
- something between real-time and batch processing, usually done in the near real time

#### Batch processing 
- popular common example - backup system
- takes a large amount of input data and uses a background job to process them.
- Usually, batch processing jobs were written with OS scripting
- batch processing jobs were executed at the same machine where the data is located.

#### batch job
- we might have some tasks that the delays are tolerated and those tasks or operated code in the batch as batch job or batch work
- we have a large amount of input data, and we have a large processing, which is very time consuming, and these are the tasks that are very time consuming we refer them as a batch job.
- example: system updates, backup, compressing logs, jenkin triggers pipelines

#### Output of Batch processing
- usually is not a report for human. It is something that is used by the application

#### MapReduce
- allows us to distribute our computation for a specific task among several machines.
- It has three stages, Map, Shuffle and Reduce.


## Stream Processing

## Asynchronous Messaging

## Synchronous Messaging

