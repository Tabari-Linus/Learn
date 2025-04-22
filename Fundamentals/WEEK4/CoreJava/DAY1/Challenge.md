**Challenge: Handling Exceptions in a Banking System**

**Scenario: Bank Transaction System**

You are developing a simple banking system where users can deposit and withdraw money. Implement **exception handling** to ensure proper error management during transactions.

**Part 1: Handling Insufficient Funds Exception**

- **Use case:** Prevent withdrawals that exceed the account balance.
- **Tasks:**
    - Create a BankAccount class with balance and methods for deposit(double amount) and withdraw(double amount).
    - Inside withdraw(), use if conditions to check if the withdrawal amount is greater than the balance.
    - If yes, throw a **custom exception** called InsufficientFundsException.
    - Handle the exception using try-catch and display a meaningful error message.

**Part 2: Handling Invalid Deposit Amount**

- **Use case:** Prevent deposits of negative or zero amounts.
- **Tasks:**
    - Inside deposit(), check if the deposit amount is **less than or equal to zero**.
    - If yes, throw an IllegalArgumentException.
    - Handle it using try-catch and display an error message.

**Part 3: Using finally to Ensure Transaction Logging**

- **Use case:** Ensure every transaction (successful or failed) is logged.
- **Tasks:**
    - Use a finally block after try-catch in both methods to print "Transaction completed."
    - This should run regardless of whether an exception occurs or not.