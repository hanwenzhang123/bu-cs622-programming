# BU CS 622 Assignment 2

I chose to use JSON file for this assignment, and used an external library called `org.json`

[The Library Downloaded here](https://mvnrepository.com/artifact/org.json/json)\
[Documentation: JSON package in Java](https://github.com/stleary/JSON-java)\
[Importing JSON library into IntelliJ IDEA](https://stackoverflow.com/questions/34676940/importing-json-library-into-intellij-idea)

### Local Setup

#### Way 1
Download the ZIP file and extract it to get the Jar. Add the Jar to your build path. 

To Add this Jar to your build path,
- Right-click the Project > Build Path > Configure build path> Select Libraries tab > Click Add External Libraries > Select the Jar file Download

#### Way 2
Use maven `mvn` to install local dependency
```
brew install maven
arch -arm64 brew install maven  => M1 chip

mvn -version
mvn package
```
Add Framework Support -> Maven -> pom.xml
```xml
<dependencies>
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20220320</version>
    </dependency>
    <dependency>
        <groupId>com.googlecode.json-simple</groupId>
        <artifactId>json-simple</artifactId>
        <version>1.1</version>
    </dependency>
</dependencies>
```

#### Finally
Don't forget to import the class to your IDE, and build it with the library.

[Importing JSON library into IntelliJ IDEA](https://stackoverflow.com/questions/34676940/importing-json-library-into-intellij-idea)

## Merge Content
In this question, I implemented exception handling through a try/catch + finally block to catch runtime errors during runtime for IO, 
where in the try block I write code, catch block to catch exception as specific as possible, finally block will always run at the end.

Since write a code to merge the content of all days into a single file,

## Search Keyword
In this question, I implemented regular expression which matches a pattern or a character, 
and on top of the regular expression, also I have implemented exception handling for IO through a try/catch + finally block.

Since the question needs to search for a given keyword, 

## JSON Data
[Data Resource](https://webrobots.io/indiegogo-dataset)

Since each JSON file downloaded directly from the website is huge, I have used the file partially and keep it in separate file.