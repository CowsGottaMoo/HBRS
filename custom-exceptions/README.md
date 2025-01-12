# Custom Exceptions Project

This project demonstrates the creation and handling of custom exceptions in Java. It includes both checked and unchecked exceptions to illustrate their differences and how they can be used in a Java application.

## Project Structure

```
custom-exceptions
├── src
│   ├── Main.java          # Entry point of the application
│   ├── Fehler1.java      # Unchecked exception (extends RuntimeException)
│   ├── Fehler2.java      # Checked exception (extends Exception)
│   └── ExceptionTester.java # Contains methods that throw exceptions
├── .gitignore             # Specifies files to ignore by Git
└── README.md              # Documentation for the project
```

## How to Run

1. Ensure you have Java installed on your machine.
2. Navigate to the `src` directory.
3. Compile the Java files:
   ```
   javac Main.java Fehler1.java Fehler2.java ExceptionTester.java
   ```
4. Run the application:
   ```
   java Main
   ```

## Exception Handling

- `Fehler1` is an unchecked exception and does not need to be declared in method signatures.
- `Fehler2` is a checked exception and must be declared in the method signature of any method that throws it.

The `Main` class calls methods from `ExceptionTester` and handles any exceptions that may arise, ensuring that all exceptions are properly caught and managed.