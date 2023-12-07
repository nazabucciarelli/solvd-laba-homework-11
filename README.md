# 11th Homework of Java Test Automation Course - Solvd Laba
This repository stores the 11th homework given by our mentor in the Java Test 
Automation Course at Solvd Laba. It consists on creating threads in the two
different ways that we've learnt, creating a connection pool that has to
be thread-safe and lazy initialized, and creating seven threads in order to
use this connection pool in a synchronized way, without inconsistencies.

## Explanation

To accomplish the requirements of the homework, I've created two threads (the 
threads are in the package homework11.threads): the first is MyThread, and it 
inherits from the Thread class, while the second is an anonymous class that
implements the runnable interface and then is passed as a parameter in the
Thread constructor. After, I've created a ConnectionPool class in the 
homework11.util package. This connection pool is thread-safe, since I am
using synchronized methods with the methods wait() and notify() and also I am 
using a thread-safe collection named CopyOnWriteArrayList to store the free
connections and the used ones. Also, the pool is lazy initialized, this means
that the objects are instantiated only if they are going to be used. Moreover,
in the main method, I've instantiated a connection pool of size five and then
using the class Executors I created a pool with seven threads which will 
either take a connection or wait till a connection is released when they are 
executed in the execute() method. Finally, I've experimented with the Future
interface doing exactly the same as previously but with it. In this case I had
to create a thread named CallableConnectionThread which implements the Callable
interface, which has the call() method that, differently from the other threads,
this one returns something. Then I've passed this Callable as parameter in the
Executors submit() method.

## What did I learn?

This was a kind of complicated homework, but I'm pleased with it since I've 
learnt much more about multi-threading development with Java. How to create
threads, how to use the synchronized keyword, how to create a thread-safe class,
the importance of a connection pool, how to use the Executors class to manage
many threads and how to synchronize the access to the connections are the 
knowledge that I've got doing this homework.

## Technologies

- Java
- Maven

## Set-Up

To run this project you will need an updated version of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
You will need an IDE to open the project folder and, finally, run the 
Main.java file to see the program output.

## Author

- [@Nazareno Bucciarelli](https://github.com/nazabucciarelli)
