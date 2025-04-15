**Challenge: Hands-on with Java Generics**

**Scenario: Generic Data Handler**

You are designing a **Generic Data Handler** that can store and retrieve any type of data efficiently. The goal is to create **type-safe**, **flexible**, and **reusable** classes and methods.

**Part 1: Generic Class**

- **Use case:** Create a class that can store and retrieve a value of any type.
- **Tasks:**
    - Define a **generic class** DataStore<T> that has:
        - A private field of type T.
        - Methods to **set** and **get** the value.
    - Test DataStore with different data types (Integer, String, Double).

**Part 2: Generic Method**

- **Use case:** Implement a method that swaps two elements in an array.
- **Tasks:**
    - Create a **generic method** swapElements that:
        - Takes an array and two indices.
        - Swaps the elements at those indices.
    - Test it with an **Integer array** and a **String array**.

**Part 3: Bounded Type Parameters**

- **Use case:** Create a method that finds the maximum of two numbers.
- **Tasks:**
    - Implement a **generic method** findMax<T> that:
        - Accepts two arguments of type T.
        - Restricts T to subclasses of Number (T extends Number).
        - Returns the larger of the two.
    - Test it with Integer, Double, and Float.

**Part 4: Wildcards (? extends, ? super)**

- **Use case:** Work with lists of unknown or flexible types.
- **Tasks:**
    - Implement a method sumNumbers that:
        - Accepts a **list of numbers** (List<? extends Number>).
        - Calculates and returns the **sum**.
    - Implement a method addIntegers that:
        - Accepts a **list of integers or their superclasses** (List<? super Integer>).
        - Adds a few integer values to the list.