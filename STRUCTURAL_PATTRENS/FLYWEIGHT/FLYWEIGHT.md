# Flyweight
-------------------
> The repository is compiled by Ihar Koshman
***

This pattern is used to reduce the memory footprint. It can also improve performance in applications where object 
    instantiation is expensive.

Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them after creation. 
    Each time an object is requested, the factory looks up the object in order to check if it's already been created. 
    If it has, the existing object is returned – otherwise, a new one is created, stored and then returned.
    
    ====================================
    
Этот шаблон используется для уменьшения объема памяти. Это также может повысить производительность в приложениях, 
    где создание экземпляров объектов обходится дорого.

Проще говоря, шаблон flyweight основан на фабрике, которая перерабатывает созданные объекты, сохраняя их после создания. 
    Каждый раз, когда запрашивается объект, фабрика ищет объект, чтобы проверить, был ли он уже создан. Если это так, 
    возвращается существующий объект – в противном случае создается новый, сохраняется и затем возвращается.
    
***