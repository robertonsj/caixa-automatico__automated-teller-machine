# Sistema de Caixa Automático | ATM Automated Teller Machine | Java Project
Neste simulador de caixa automático, o usuário poderá realizar operações bancárias como saques e depósitos, e visualizar o saldo da conta. 
Dados armazenados: número da conta, pin e saldo. 

## Requisitos Funcionais
- Realizar depósitos
- Realizar saques
- Visualizar saldo bancário

## Interfaces


## Explicação
1. Classe Conta: Representa uma conta bancária com os métodos depositar, sacar, 
e validar pin.
2. Classe CaixaAutomatico: Lida com as operações bancárias como iniciar sessão, 
validar usuário, e fornecer opções para consulta de saldo, deposito e saque.
3. Classe Main: Ponto de entrada do programa onde um objeto 'Conta' é criado e
passado para o objeto CaixaAutomatico, o qual depois inicia a sessão do Sistema
de Caixa Automático. 

## How to Run
- Compile and run the code into a Java IDE;
- It will use 'JOptionPane' dialogs to interact with the user for PIN validation, 
balance inquiry, deposit and withdrawal operations. 

### Basic Level Aspects:
Basic OOP Concepts:

Classes and Objects: The use of Account and ATM classes demonstrates encapsulation and basic object-oriented principles.
Methods: Basic methods for deposit, withdraw, and balance inquiry are defined and used.
Basic Java Constructs:

Control Flow: Use of if-else statements and switch-case for control flow.
Data Types: Usage of basic data types like String and double.
JOptionPane for GUI: Using JOptionPane for simple GUI interactions is straightforward and does not involve complex GUI programming.

### Intermediate Level Aspects:
Exception Handling:

The program uses simple input validation, but it doesn't yet include robust error handling or catching exceptions, which is often expected in intermediate programs.
User Interaction Loop:

The program has a loop for continuous user interaction until the user decides to exit. This requires understanding of loops and switch statements within GUI context.
Design and Structure:

The design includes separating concerns into different classes (Account and ATM), which is a step towards more modular and maintainable code.
Enhancements for Higher Levels:
To move towards an intermediate or advanced level, consider adding:

Exception Handling: Implement try-catch blocks to handle potential runtime exceptions, especially for parsing user input.
Advanced Data Structures: Use collections like List or Map to manage multiple accounts.
Persistence: Save and load account data from a file or database.
Security: Enhance security with more advanced authentication mechanisms.
Unit Testing: Implement unit tests for methods in Account and ATM classes using a testing framework like JUnit.
Error Logging: Include logging to track errors and activities using Java's logging framework.
By enhancing these aspects, the program can transition from a basic/intermediate level to a more advanced level, making it robust, secure, and ready for real-world application scenarios.
