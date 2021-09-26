## Factory Method
-------------------
> The app is compiled by Ihar Koshman
***

It is a creational design pattern which talks about the creation of an object. The factory design pattern says 
that define an interface (A java interface or an abstract class) and let the subclasses decide which object to instantiate. 
The factory method in the interface lets a class defer the instantiation to one or more concrete subclasses. 
Since this design patterns talk about instantiation of an object and so it comes under the category of creational design pattern. 
If we notice the name Factory method, that means there is a method which is a factory, and in general factories are involved 
with creational stuff and here with this an object is being created. It is one of the best ways to create an object where 
object creation logic is hidden to the client. Now Let’s look at the implementation.

Implementation: 
1. Define a factory method inside an interface.
2. Let the subclass implements the above factory method and decide which object to create.

In Java constructors are not polymorphic, but by allowing subclass to create an object, we are adding polymorphic behavior 
    to the instantiation. In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what 
    to create.

***