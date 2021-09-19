## Singleton
-------------------
> The app is compiled by Ihar Koshman
***

The most popular approach is to implement a Singleton by creating a regular class and making sure it has:

- A private constructor
- A static field containing its only instance
- A static factory method for obtaining the instance

***

#### first implementation [ProgramLoggerSynchro]
Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded 
    environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple 
    threads can’t access it simultaneously.
    
Pros:
- Lazy initialization is possible.
- It is also thread safe.
- getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.

***

#### second implementation [ProgramLoggerBillPugh]
Bill Pugh Singleton Implementation: Prior to Java5, memory model had a lot of issues and above methods caused failure 
    in certain scenarios in multithreaded environment. So, Bill Pugh suggested a concept of inner static classes to use 
    for singleton.

When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. 
    Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it 
    is lazy initialization.
    
This is the most widely used approach as it doesn’t use synchronization.

***