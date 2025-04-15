**Challenge: Sorting and Searching in Employee Records**

**Scenario: Employee Data Management**

You are developing a Java program to manage employee records. Your goal is to implement **sorting and searching** techniques using Java’s **Collections API**, Comparable, and Comparator.

**Part 1: Sorting Employees Using Comparable**

- **Use case:** Sort employees by **ID (ascending order)**.
- **Tasks:**
    - Define an Employee class with fields: id, name, salary.
    - Implement Comparable<Employee> to sort employees by id.
    - Populate a List<Employee> with sample data and use Collections.sort().
    - Print the sorted list.

**Part 2: Sorting Employees Using Comparator**

- **Use case:** Sort employees by **salary (descending order)**.
- **Tasks:**
    - Create a separate Comparator<Employee> class for salary-based sorting.
    - Use Collections.sort(list, comparator) to sort by salary.
    - Print the sorted list.

**Part 3: Searching Employees Using Collections.binarySearch()**

- **Use case:** Find an employee by **ID** using **binary search**.
- **Tasks:**
    - Ensure the list is sorted by id (as binary search requires sorted data).
    - Use Collections.binarySearch() to find an employee by id.
    - Print the search result (found or not found).