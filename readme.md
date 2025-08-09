# BridgeLabz-SIPP-Training

Welcome to the **BridgeLabz SIPP Training** repository! This repository contains a comprehensive collection of Java programming examples and solutions, organized into different categories to demonstrate various concepts and techniques.

## 📚 Table of Contents

- [Java Generics Examples](#java-generics-examples)
- [Java Collections Examples](#java-collections-examples)
- [Java Streams Examples](#java-streams-examples)
- [Java Exceptions Examples](#java-exceptions-examples)
- [Java Regex Examples](#java-regex-examples)
- [JUnit Testing Examples](#junit-testing-examples)
- [Other Branches](#other-branches)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)

---

## 🎯 Java Generics Examples

This section showcases advanced implementations using **Java Generics**, demonstrating type safety, reusability, and maintainability through real-world scenarios.

### Featured Projects:

| Project | Description |
|---------|-------------|
| **SmartWarehouseManagementSystem** | Implements a smart warehouse system for managing different types of items using generic storage |
| **DynamicOnlineMarketplace** | Creates a dynamic online marketplace with generic product handling and discount application |
| **MultiLevelUniversityCourseManagementSystem** | Develops a university course management system with generic course evaluations and student enrollment |
| **PersonalizedMealPlanGenerator** | Builds a personalized meal plan generator that handles various meal types using generic meal plans |
| **AIDrivenResumeScreeningSystem** | Implements an AI-driven resume screening system with generic job role and resume handling |

---

## 🔧 Java Collections Examples

This section demonstrates the implementation of various problems using **Java Collections**, showcasing the use of different collection types like List, Set, Queue, and Map.

### Collection Types Covered:

#### 📋 List Interface
- **FindFrequencyOfElements**: Count frequency of elements in a list
- **FindNthElementFromEnd**: Find the nth element from the end of a list
- **RemoveDuplicatesPreservingOrder**: Remove duplicates while maintaining order
- **ReverseList**: Reverse elements in a list
- **RotateElementsInList**: Rotate elements by a specified position

#### 🎯 Set Interface
- **CheckIfTwoSetsAreEqual**: Compare two sets for equality
- **ConvertSetToSortedList**: Convert a Set to a sorted List
- **FindSubsets**: Generate all possible subsets of a set
- **SymmetricDifference**: Find elements present in only one of the sets
- **UnionAndIntersectionOfTwoSets**: Calculate union and intersection

#### 🔄 Queue Interface
- **CircularBuffer**: Implement a circular buffer using queue
- **GenerateBinaryNumbers**: Generate binary numbers from 1 to N
- **HospitalTriageSystem**: Emergency room triage system simulation
- **ReverseQueue**: Reverse the elements of a queue
- **StackUsingQueues**: Implement a stack using two queues

#### 🗺️ Map Interface
- **FindKeyWithHighestValue**: Find the key with maximum value
- **GroupObjectsByProperty**: Group objects based on a property
- **InvertMap**: Swap keys and values in a map
- **MergeTwoMaps**: Combine two maps efficiently
- **WordFrequencyCounter**: Count word frequency in text

### Real-World Applications:

| Application | Description |
|-------------|-------------|
| **InsurancePolicyManagementSystem** | Manages insurance policies using Set implementations |
| **InsurancePolicyManagementUsingMap** | Manages insurance policies using Map implementations |
| **VotingSystem** | Implements a voting system using HashMap, LinkedHashMap, and TreeMap |
| **ShoppingCart** | Creates a shopping cart system using HashMap, LinkedHashMap, and TreeMap |
| **BankingSystem** | Implements a banking system using HashMap, TreeMap, and Queue |

---

## 🌊 Java Streams Examples

This section presents solutions to various problems using **Java I/O and Streams**, covering file handling, buffered streams, object serialization, and inter-thread communication.

### Stream Types and Examples:

#### 📁 File Handling
- **FileReadWrite.java**: Read from source file and write to destination
- **UserInputToFile.java**: Read user input from console and save to file
- **LargeFileErrorReader.java**: Efficiently read large files line by line

#### 🔄 Buffered Streams
- **BufferedStreamCopy.java**: Efficient file copy using buffered streams with performance comparison

#### 📊 Data Processing
- **CaseConverter.java**: Convert uppercase letters to lowercase in text files
- **WordCounter.java**: Count words and find top 5 most frequent words
- **StudentDataStream.java**: Store and retrieve student details using Data streams

#### 🖼️ Binary Data
- **ImageToByteArray.java**: Convert images to byte arrays and vice versa

#### 🔄 Object Serialization
- **EmployeeSerialization.java**: Serialize and deserialize Employee objects
- **Employee.java**: Employee class for serialization example

#### 🧵 Inter-Thread Communication
- **PipedStreamsCommunication/**: Demonstrates communication between threads using piped streams

---

## ⚠️ Java Exceptions Examples

This section provides comprehensive examples of exception handling in Java, covering checked exceptions, unchecked exceptions, custom exceptions, and various exception handling techniques.

### Exception Handling Examples:

| Example | Description |
|---------|-------------|
| **FileReadException** | Demonstrates handling IOException when reading a file named "data.txt". If file exists, prints its contents; if not found, displays "File not found" |
| **DivisionException** | Handles ArithmeticException for division by zero and InputMismatchException for non-numeric input. Takes two numbers from user and performs division with proper error handling |
| **InvalidAgeException** | Creates a custom InvalidAgeException for validating user age. Throws exception if age is below 18, displays "Age must be 18 or above" |
| **ArrayOperations** | Demonstrates handling ArrayIndexOutOfBoundsException and NullPointerException. Performs array operations with comprehensive error handling |
| **TryWithResources** | Uses try-with-resources to automatically close BufferedReader after reading "info.txt". Ensures proper resource cleanup and handles IOException |
| **InterestCalculator** | Demonstrates exception propagation using throws keyword. Calculates interest with validation for negative amounts and rates |
| **FinallyDemo** | Shows guaranteed execution of finally block after exception handling. Performs division with ArithmeticException handling and always prints "Operation completed" |
| **ExceptionPropagation** | Demonstrates exception propagation through multiple method calls. Shows how exceptions propagate from method1() → method2() → main() |
| **NestedTryCatch** | Uses nested try-catch blocks to handle ArrayIndexOutOfBoundsException and ArithmeticException. Performs array access and division with comprehensive error handling |
| **BankTransactionSystem** | Complete banking system with custom InsufficientBalanceException. Handles withdrawal operations with balance validation and negative amount checks |

---

## 🔍 Java Regex Examples

This section provides comprehensive examples of **Java Regular Expressions (Regex)** for string validation, extraction, and manipulation, along with practical pattern matching techniques.

### 🔐 Validation Problems

| Example | Description | Validation Rules |
|---------|-------------|------------------|
| **UsernameValidator** | Validates username format | Letters, numbers, underscores only; must start with letter; 5-15 characters |
| **LicensePlateValidator** | Validates license plate format | Two uppercase letters followed by four digits (e.g., AB1234) |
| **HexColorValidator** | Validates hex color codes | Starts with # followed by 6 hexadecimal characters |
| **IPAddressValidator** | Validates IPv4 addresses | Four groups of numbers (0-255) separated by dots |
| **CreditCardValidator** | Validates credit card numbers | Visa: starts with 4, 16 digits; MasterCard: starts with 5, 16 digits |
| **SSNValidator** | Validates Social Security Numbers | Format: XXX-XX-XXXX with proper digit validation |

### 📊 Extraction Problems

| Example | Description | Extracts |
|---------|-------------|----------|
| **EmailExtractor** | Extracts all email addresses from text | All email addresses in standard format |
| **CapitalizedWordsExtractor** | Extracts capitalized words from sentences | Words starting with uppercase letters |
| **DateExtractor** | Extracts dates in dd/mm/yyyy format | Dates matching day/month/year pattern |
| **LinkExtractor** | Extracts URLs from web page text | HTTP/HTTPS links |
| **ProgrammingLanguageExtractor** | Extracts programming language names | Known programming languages from text |
| **CurrencyExtractor** | Extracts currency values | Dollar amounts and decimal numbers |
| **RepeatingWordsFinder** | Finds repeating words in sentences | Words that appear more than once |

### 🔄 String Modification Problems

| Example | Description | Function |
|---------|-------------|----------|
| **SpaceNormalizer** | Replaces multiple spaces with single space | Normalizes whitespace in text |
| **BadWordCensor** | Censors inappropriate words | Replaces bad words with asterisks (****) |

### 🎯 Key Features

- **Beginner-friendly**: Simple, well-commented code with clear examples
- **Interactive input**: Most programs accept user input for testing
- **Test cases**: Each validator includes built-in test examples
- **Real-world patterns**: Practical regex patterns used in industry applications
- **Comprehensive coverage**: From basic validation to advanced extraction techniques

---

## 🧪 JUnit Testing Examples

This section contains a comprehensive Maven project with 13 JUnit testing problems, organized into basic and advanced categories. Each problem is implemented with beginner-friendly Java code and comprehensive test cases.

### Project Structure

```
JavaRegexAndJunit/JavaJunit/
├── src/
│   ├── main/java/com/junit/examples/
│   │   ├── Calculator.java
│   │   ├── StringUtils.java
│   │   ├── ListManager.java
│   │   ├── ExceptionHandler.java
│   │   ├── DatabaseConnection.java
│   │   ├── NumberUtils.java
│   │   ├── PerformanceTask.java
│   │   ├── FileProcessor.java
│   │   ├── BankAccount.java
│   │   ├── PasswordValidator.java
│   │   ├── TemperatureConverter.java
│   │   ├── DateFormatter.java
│   │   └── UserRegistration.java
│   └── test/java/com/junit/examples/
│       ├── CalculatorTest.java
│       ├── StringUtilsTest.java
│       ├── ListManagerTest.java
│       ├── ExceptionHandlerTest.java
│       ├── DatabaseConnectionTest.java
│       ├── NumberUtilsTest.java
│       ├── PerformanceTaskTest.java
│       ├── FileProcessorTest.java
│       ├── BankAccountTest.java
│       ├── PasswordValidatorTest.java
│       ├── TemperatureConverterTest.java
│       ├── DateFormatterTest.java
│       └── UserRegistrationTest.java
├── pom.xml
└── README.md
```

### Basic JUnit Problems (1-8)

#### 1. Calculator Class Testing
- **File**: `Calculator.java` and `CalculatorTest.java`
- **Methods**: add, subtract, multiply, divide
- **Features**: Basic arithmetic operations with exception handling for division by zero

#### 2. String Utilities Testing
- **File**: `StringUtils.java` and `StringUtilsTest.java`
- **Methods**: reverse, isPalindrome, toUpperCase
- **Features**: String manipulation with null safety

#### 3. List Operations Testing
- **File**: `ListManager.java` and `ListManagerTest.java`
- **Methods**: addElement, removeElement, getSize
- **Features**: List management with proper null checks

#### 4. Exception Handling Testing
- **File**: `ExceptionHandler.java` and `ExceptionHandlerTest.java`
- **Method**: divide (with ArithmeticException)
- **Features**: Testing exception throwing and handling

#### 5. @BeforeEach and @AfterEach Annotations
- **File**: `DatabaseConnection.java` and `DatabaseConnectionTest.java`
- **Methods**: connect, disconnect
- **Features**: Database connection lifecycle management

#### 6. Parameterized Tests
- **File**: `NumberUtils.java` and `NumberUtilsTest.java`
- **Method**: isEven
- **Features**: Testing with multiple input values using @ParameterizedTest

#### 7. Performance Testing with @Timeout
- **File**: `PerformanceTask.java` and `PerformanceTaskTest.java`
- **Method**: longRunningTask
- **Features**: Testing method execution time limits

#### 8. File Handling Testing
- **File**: `FileProcessor.java` and `FileProcessorTest.java`
- **Methods**: writeToFile, readFromFile
- **Features**: File I/O operations with proper cleanup

### Advanced JUnit Problems (1-5)

#### 1. Banking Transactions Testing
- **File**: `BankAccount.java` and `BankAccountTest.java`
- **Methods**: deposit, withdraw, getBalance
- **Features**: Banking operations with balance validation and insufficient funds handling

#### 2. Password Strength Validator Testing
- **File**: `PasswordValidator.java` and `PasswordValidatorTest.java`
- **Method**: isValidPassword
- **Features**: Password validation with rules for length, uppercase letters, and digits

#### 3. Temperature Converter Testing
- **File**: `TemperatureConverter.java` and `TemperatureConverterTest.java`
- **Methods**: celsiusToFahrenheit, fahrenheitToCelsius
- **Features**: Temperature conversion between Celsius and Fahrenheit

#### 4. Date Formatter Testing
- **File**: `DateFormatter.java` and `DateFormatterTest.java`
- **Method**: formatDate
- **Features**: Date format conversion from yyyy-MM-dd to dd-MM-yyyy

#### 5. User Registration Testing
- **File**: `UserRegistration.java` and `UserRegistrationTest.java`
- **Method**: registerUser
- **Features**: User registration with validation for username, email, and password

### How to Run the Tests

1. **Navigate to JUnit project directory**:
   ```bash
   cd JavaRegexAndJunit/JavaJunit
   ```

2. **Using Maven**:
   ```bash
   mvn test
   ```

3. **Using Maven with specific test**:
   ```bash
   mvn test -Dtest=CalculatorTest
   ```

4. **Using Maven with specific method**:
   ```bash
   mvn test -Dtest=CalculatorTest#testAdd
   ```

### Dependencies

The JUnit project uses JUnit 5 (Jupiter) with the following dependencies:
- junit-jupiter-engine: 5.9.2
- junit-jupiter-api: 5.9.2
- junit-jupiter-params: 5.9.2

### Learning Outcomes

After completing these problems, you'll understand:
- Basic JUnit test structure and assertions
- Exception testing in JUnit
- Test lifecycle management with @BeforeEach and @AfterEach
- Parameterized testing with multiple inputs
- Performance testing with @Timeout
- File I/O testing
- Complex validation testing
- Banking and business logic testing

---

## 🌿 Other Branches

This repository also contains code related to the following branches:

| Branch | Focus Area |
|--------|------------|
| **AdvanceDSA** | Advanced Data Structures and Algorithms |
| **CoreJava** | Core Java concepts and programming |
| **DSA** | Data Structures and Algorithms |
| **OOPS** | Object-Oriented Programming concepts |
| **WorkShop** | Various workshop projects and exercises |

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code with Java extension)
- Git (for cloning the repository)
- Maven (for JUnit testing project)

### Running the Examples

1. **Clone the repository**:
   ```bash
   git clone [repository-url]
   cd BridgeLabz-SIPP-Training
   ```

2. **Compile and run any example**:
   ```bash
   javac JavaStreams/BufferedStreamCopy.java
   java JavaStreams.BufferedStreamCopy
   ```

3. **Run JUnit tests**:
   ```bash
   cd JavaRegexAndJunit/JavaJunit
   mvn test
   ```

4. **Using IDE**:
   - Import the project as a Java project
   - Each example has a `main` method for independent execution
   - For JUnit tests, right-click on test classes and select "Run Tests"

---

## 📁 Project Structure

```
BridgeLabz-SIPP-Training/
├── Collections/           # Java Collections examples
├── Generics/              # Java Generics examples
├── JavaStreams/           # Java I/O and Streams examples
├── JavaExceptions/        # Java Exception handling examples
├── JavaRegexAndJunit/     # Java Regex and JUnit testing examples
│   ├── JavaJunit/         # Maven JUnit testing project
│   └── *.java             # Individual regex examples
├── out/                   # Compiled output
├── .idea/                 # IDE configuration
└── readme.md             # This file
```

---

## 🤝 Contributing

Feel free to contribute by:
- Adding new examples
- Improving existing code
- Enhancing documentation
- Reporting issues

---

## 📄 License

This project is part of the BridgeLabz SIPP Training program.

---

**Happy Coding! 🎉**