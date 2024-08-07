# Sistema de Caixa Automático | ATM Automated Teller Machine | Java Project
Neste simulador de caixa automático, o usuário poderá realizar operações bancárias como saques e depósitos, e visualizar o saldo da conta. 
Dados armazenados: número da conta, pin e saldo. 

## Requisitos Funcionais
- Realizar depósitos
- Realizar saques
- Visualizar saldo bancário

## User Interfaces
Interfaces de interação do usuário.
### Input Pin
![Input Pin](inputPin.png)
### Options Menu
![Options Menu](optionsMenu.png)

## How to Run
- Compile and run the code into a Java IDE;
- It will use 'JOptionPane' dialogs to interact with the user for PIN validation,
balance inquiry, deposit and withdrawal operations. 

### Basic OOP Concepts:
- The use of Account and ATM classes demonstrates encapsulation and basic object-oriented principles;
- Basic methods for deposit, withdraw, and balance inquiry are defined and used;
- Use of if-else statements and switch-case for control flow;
- Usage of basic data types like String and double;
- Using JOptionPane for simple GUI interactions is straightforward and does not involve complex GUI programming.

### Intermediate Level Aspects:
- The program has a loop for continuous user interaction until the user decides to exit. This requires understanding of loops and switch statements within GUI context.
- The design and structure includes separating concerns into different classes (Account and ATM), which is a step towards more modular and maintainable code.

### Enhancements for Higher Levels
- Implement try-catch blocks to handle potential runtime exceptions, especially for parsing user input;
- Use collections like List or Map to manage multiple accounts;
- Persistence: Save and load account data from a file or database;
- Security: Enhance security with more advanced authentication mechanisms.
- Unit Testing: Implement unit tests for methods in Account and ATM classes using a testing framework like JUnit.
- Error Logging: Include logging to track errors and activities using Java's logging framework.
By enhancing these aspects, the program can transition from a basic/intermediate level to a more advanced level, making it robust, secure, and ready for real-world application scenarios.

### Creating a Class to Format Double Data Types
Creating a class in Java to format double data types can be useful for ensuring consistent display of numeric values, such as controlling the number of decimal places, using specific locale settings, or applying custom formatting patterns. 

1. Constructors:
* Default constructor: Initializes the formatter with a default pattern ("#.##").
* Custom pattern constructor: Allows specifying a custom pattern for formatting.
* Locale constructor: Allows specifying a locale for formatting.

2. Methods:
* format(double value): Formats the given double value using the current formatter settings.
* setPattern(String pattern): Changes the formatting pattern if the current formatter supports patterns.
* setLocale(Locale locale): Changes the locale for the formatter, useful for locale-specific formatting.

#### Usage:
* The DoubleFormatter class can format double values according to different patterns and locales.
* You can dynamically change the formatting pattern or locale using the provided methods.
This class provides a flexible way to handle the formatting of double values in various ways, which can be particularly useful in applications where numeric formatting needs to be consistent and customizable.

