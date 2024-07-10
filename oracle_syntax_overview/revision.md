## Lesson: Language Basics

[Java official Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)

Objects store their state in fields. However, the Java programming language also uses the term "variable" as well.

This section discusses this relationship, plus variable naming rules and conventions, basic data types (primitive types, character strings, and arrays), default values, and literals.

an `object` stores its `state` in `fields`.
```java
int cadence = 0;
int speed = 0;
int gear = 1;
```

`In the Java programming language, the terms "field" and "variable" are both used; this is a common source of confusion among new developers, since both often seem to refer to the same thing.`

---
### What Is an Object?

Objects are key to understanding object-oriented technology.
Real-world objects share two characteristics: They all have `state` and `behavior`

|SNo| Entity | State | Behaviour |
|-|-|-|-|
|1|Dog|name, color, breed, hungry|barking, fetching, wagging tai|
|2|Bicycles|current gear, current pedal cadence, current speed|changing gear, changing pedal cadence, applying brake|

_You may also notice that some objects, in turn, will also contain other objects._

### <p style="text-align: center;">A software object.</p>

![A software object.](images/software_obj.bmp)

Software objects stores its `state` in `fields` (variables in some programming languages) and exposes its `behavior` through `methods` (functions in some programming languages).

> Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication. Hiding internal state and requiring all interaction to be performed through an object's methods is known as `data encapsulation` — a fundamental principle of object-oriented programming.


`we are basically talking about functions/methods which relate to Behaviour of object and variable/fields which relate to the state of the object`

![Bicycle](images/concepts-bicycleObject.gif)

example fo a bicylce

> Bundling code into individual software objects provides a number of benefits, including:
    
1. `Modularity`: The source code for an object can be written and maintained independently of the source code for other objects. Once created, an object can be easily passed around inside the system.
2. `Information-hiding`: By interacting only with an object's methods, the details of its internal implementation remain hidden from the outside world.
3. `Code re-use`: If an object already exists (perhaps written by another software developer), you can use that object in your program. This allows specialists to implement/test/debug complex, task-specific objects, which you can then trust to run in your own code.
4. `Pluggability and debugging ease`: If a particular object turns out to be problematic, you can simply remove it from your application and plug in a different object as its replacement. This is analogous to fixing mechanical problems in the real world. If a bolt breaks, you replace it, not the entire machine.

---


>The static keyword is used to represent the class member. It is basically used with methods and variables to indicate that it is a part of the class, not the object. On the other hand, the final keyword is used to proclaim a constant variable and to bind the user from accessing a method, variable, or class.

The Java programming language defines the following kinds of variables:

1. `Instance Variables (Non-Static Fields)`: Technically speaking, objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as `instance variables` because their values are unique to `each instance of a class` (to each object, in other words); the currentSpeed of one bicycle is independent from the currentSpeed of another.

2. `Class Variables (Static Fields)`: A class variable is any field declared with the `static modifier`; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. A field defining the number of gears for a particular kind of bicycle could be marked as static since conceptually the same number of gears will apply to all instances. The code `static int numGears = 6`; would create such a static field. Additionally, the keyword `final` could be added to indicate that the number of gears will never change.
3. `Local Variables`: Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field (for example, int count = 0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared — which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; `they are not accessible from the rest of the class`.
4. `Parameters`: You've already seen examples of parameters, both in the Bicycle class and in the main method of the "Hello World!" application. Recall that the signature for the main method is `public static void main(String[] args)`. Here, the `args` variable is the parameter to this method. The important thing to remember is that `parameters are always classified as "variables" not "fields"`. `This applies to other parameter-accepting constructs` as well (such as constructors and exception handlers). 

### **Difference between variables and fields**
| Variables | Fields |
|-|-|
|Variables and fields are both used to store data, but they serve different purposes and contexts. Variables are general-purpose containers for storing data values, and they can have different scopes such as local, global, or block-scoped, depending on where they are defined and how they are used within a program. Variables can be used in functions, blocks, or throughout the entire program, with their lifetime tied to their scope.|Fields, on the other hand, are a specific type of variable associated with classes and objects in object-oriented programming. Fields are used to store the state or properties of an object and are scoped to the class or the instance of the object. While all fields are variables, not all variables are fields; fields are specific to the structure and state management of classes.|


> When discussing fields and variables. If we are talking about `"fields in general"` (excluding local variables and parameters), `we may simply say "fields"`. If the discussion applies to `"all of the above"`, we may simply say `"variables"`. If the context calls for a distinction, we will use `specific terms` (static field, local variables, etc.) as appropriate. You may also occasionally see the term `"member"` used as well. A `type's fields, methods, and nested types` are collectively called its members.

## Naming
The rules and conventions for naming your variables can be summarized as follows:

1. Variable names are` case-sensitive`. A variable's name can be any `legal identifie`r — an unlimited-length sequence of Unicode letters and digits, beginning with a letter, the dollar sign "$", or the underscore character "_". The convention, however, is to always begin your variable names with a letter, not "$" or "_". White space is not permitted.
2. Subsequent characters may be letters, digits, dollar signs, or underscore characters. Conventions (and common sense) apply to this rule as well. When choosing a name for your variables, use full words instead of cryptic abbreviations. Doing so will make your code easier to read and understand. In many cases it will also make your code self-documenting; fields named cadence, speed, and gear, for example, are much more intuitive than abbreviated versions, such as s, c, and g. Also keep in mind that the name you choose must not be a keyword or reserved word.
3. If the name you choose consists of only `one word`, spell that word in `all lowercase letters`. If it consists of `more than one word`, capitalize the first letter of each subsequent word. The names `gearRatio` and currentGear are prime examples of this convention. If your variable stores a constant value, `such as static final int NUM_GEARS = 6`, the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. By convention, the underscore character is never used elsewhere.
