## Programming Assignment 2 starter code 

This starter project mainly consists of the instructor solution to Exercise 7. Feel free to use it or use your own Exercise 7 as a starting point.

The following UML class diagram shows the corresponding structure of this code:
```mermaid
classDiagram 
    direction BT
    class MenuItem {<<interface>>}
    class Comparable {<<interface>>}
    class PizzaMain
    class Pizza
    class PizzaTopping
    class PizzaSauce
    class PizzaCrust
    class MeatTopping
    class CheeseTopping
    class VeggieTopping
    class TomatoSauce
    class AlfredoSauce
    class ThinCrust
    class ThickCrust

    MenuItem --|> Comparable
    Pizza ..|> MenuItem
    PizzaTopping ..|> MenuItem
    PizzaSauce ..|> MenuItem
    PizzaCrust ..|> MenuItem
    MeatTopping --|> PizzaTopping
    CheeseTopping --|> PizzaTopping
    VeggieTopping --|> PizzaTopping
    ThinCrust --|> PizzaCrust
    ThickCrust --|> PizzaCrust
    TomatoSauce --|> PizzaSauce
    AlfredoSauce --|> PizzaSauce
    Pizza o--> "*" PizzaTopping: toppings
    Pizza o--> PizzaSauce: sauce
    Pizza o--> PizzaCrust: crust
    Pizza o--> "*" MenuItem: selectionList
    PizzaMain o--> Pizza
```

(For readability, the additional subclasses under PizzaTopping are not shown.)
