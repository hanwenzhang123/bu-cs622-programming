---
title: 051722-note
---

# Exception & Errors
Everything in java is the extension of the object class

## run time error
- a lot errors during runtime, called run time error, like file not found, class not found, network not working, external service not working
- issues with error that could happen, some we can catch them when no guarantee if service is available
- we can catch them in code, called exception handling - treat run time error using `try catch`

## exception
- when something goes wrong
- if we can handle, we call it exception
- if we can not handle, we call it error
- exception can be treated in the code
- when you encounter error, the only approach is to restart the jvm

## throw exceptions
- using keyword `void fall() throws Exeception { throw new Exception(); throw runtimeException(); }`
- checked exceptions
- unchecked exceptions (runtime)
- checked exceptions must be caught or declared (the compiler objects if this policy is violated), no corresponding stipulation applies to unchecked exceptions

## try/catch block
- exception handling will be done in java through a try/catch + finally block
- inside the catch(), we include type of exception we intend to handle, e.g. FileIOException e1, ClassCastException e2
- when a statement in a try block causes a runtime error, throws an exception, the remaining statement in the try block will be skipped, and control goes to one of the matching catch blocks
- finally will always run
```
catch (Exception ex){
  ex.getMessage()
  ex.printStackTrace()
}
```

## Q: where can we throw an exception?
- 2 places: either inside the try block or in the method location
- `public void test() throws Exception {}`

## errors - can not be handled or declared
- ExceptionInInitializerError: static, if one class throws an error, java can not use that class no more
- StackOverflow Error: stack run out of room
- NoClassDefFoundError: class does not exist
- OutOfMemoryError: no enough space in memory

## solution to errors
- restart jvm

## exception
- Exception itself is a super class, it will run, but better to be specific, like IOException


# Files and I/O
- what data onto the memory
- what data onto the disk

## Memory vs Disk
- Memory: fast, easy to acces, but limited, very expensive, and temporary -> when electricity cuts off, the content of memory fades away, `DataStructures`
- Disk: slower access, less expensive than memory, so we can have lot of data stored, and keep information in long term, persistent and permanent storage `Database Management System`

## Files in Java
- file is permanent storage of data, keep data on disk, put data inside files
- java treats a file as a sequential stream of bytes, operating system has a mechanism to mark the end-of-file, program starts reading until it encounters the marker of the end of file

## 2 types of files
- text files (cvs, json) 
- binary files (image, audio, video)

## path
- createTempFile - when our memory is out of space, when we turn off system, restart jvm, the file will be removed
- getPath() - A path is a unique location to a file or a folder in a file system of an OS, only the rest if relative path is provided:
- getAbsolutePath() - with the current user directory, current folder, path, plus the file, the whole path regardless if relative path is provided

## temporary file
- something written on disk because either memories full or occupies too much space
- if electricity of computer shuts off, we need these files temporarily, then we can remove it

## absolute path vs relative path
- absolute: everything included, the path how operating system access the file
- relative: a path relative to another directory

## stream
- never ending dataset, constant
- we do not know the start and the end, data is coming and going, you collect a partial of the data
- we create window (block) and then we analyze, like online financial transaction, app log files

## java.io
- java consider working with files like working with stream

## low level vs high level
- low level stream directly connect to the file on the disk
- high level stream is built on top of another stream using wrapping, not directly connected (preferred, faster)

## buffer
- when it says cache or buffer, we make a bigger chunk into the memory and instead of writing the bytes per bytes
- we just write it once when the buffer is good, you make another buffer united once
- instead of one byte to one byte, better to do 10 bytes then write it once


# Regular Expression
- match a pattern or a character

## java
- boolean matches()
- boolean find()
- boolean find(int start)
- String group()
- int start()
- int end()
- int groupCount()

## StringBuilder
- more functionality and more faster than string
- do manipulatuon on the stream in runtime
- `StringBuilder sb = new StringBuilder("Hello")`

## examples
- append()
- insert()
- delete()
- deleteCharAt()
- replace()
- reverse()

 
