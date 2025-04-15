**Challenge: Exploring Java Iteration Techniques**

**Scenario: Employee Data Processing**

You are developing a **Java program** to manage employee records. The goal is to explore different iteration techniques while filtering, modifying, and analyzing data efficiently.

**Part 1: Using Iterators**

- **Use case:** You need to **remove employees** who have been inactive for over a year from a List<Employee>.
- **Tasks:**
    - Define an Employee class with fields: id, name, lastActiveYear.
    - Populate an ArrayList<Employee> with sample data.
    - Use an **Iterator** to remove employees who were last active before 2023.

**Part 2: Using for-each Loop**

- **Use case:** Print employee details using a for-each loop.
- **Tasks:**
    - Iterate over the List<Employee> and print each employee's details.

**Part 3: Stream API – Filtering & Mapping**

- **Use case:** Find employees who were active in 2024 and extract their names.
- **Tasks:**
    - Use **Stream API** to filter employees where lastActiveYear == 2024.
    - Map the results to extract employee names.
    - Print the names.

**Part 4: Stream API – Aggregation**

- **Use case:** Find the most recently active employee.
- **Tasks:**
    - Use **Stream API** with .max() to find the employee with the highest lastActiveYear.
    - Print their details.