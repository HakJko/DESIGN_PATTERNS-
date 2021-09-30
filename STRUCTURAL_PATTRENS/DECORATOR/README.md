# Decorator
-------------------
> The repository is compiled by Ihar Koshman
***

The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the 
    behavior of other existing objects within the same class. We use inheritance to extend the behavior of the class. 
    This takes place at compile-time, and all the instances of that class get the extended behavior.

- Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, 
    there is no change to the original class.
- The decorator design pattern is a structural pattern, which provides a wrapper to the existing class.
- Decorator design pattern uses abstract classes or interfaces with the composition to implement the wrapper.
- Decorator design patterns create decorator classes, which wrap the original class and supply additional functionality 
    by keeping the class methods’ signature unchanged.
- Decorator design patterns are most frequently used for applying single responsibility principles since we divide the 
    functionality into classes with unique areas of concern.
- The decorator design pattern is structurally almost like the chain of responsibility pattern.

***