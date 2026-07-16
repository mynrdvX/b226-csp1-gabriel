# Capstone 1 – Globe Telecom Load Registration System

## TESDA Java Programming Capstone Project

This project is submitted as **Capstone 1** for the **Java Programming Course under TESDA (Technical Education and Skills Development Authority)**. It demonstrates the application of the fundamental Java programming concepts discussed throughout the course by developing a menu-driven console application inspired by Globe Telecom's *143# USSD services.

---

## Project Overview

The Globe Telecom Load Registration System is a Java console-based application that simulates Globe Telecom's load registration services. The program allows users to register to various Globe promos, check their load balance, add load credits, and view their promo registration history.

The project was designed to showcase problem-solving skills and the practical application of Java programming concepts learned during the TESDA Java Programming training.

---

## Project Objectives

The objectives of this project are to:

* Apply Java programming fundamentals in a real-world inspired application.
* Demonstrate understanding of menu-driven programming.
* Practice using methods, parameters, and arguments.
* Implement conditional statements and loops effectively.
* Utilize arrays for storing program data.
* Apply exception handling using try-catch blocks.
* Simulate Globe Telecom's load registration workflow.

---

## Program Features

The application includes the following features:

* USSD Code Validation (*143#)
* Globe Promo Categories

  * Go+ Promos
  * GoSURF Promos
  * GoUNLI Promos
  * Call Promos
  * Text Promos
  * Call and Text Promos
* Promo Subscription Confirmation
* Load Balance Checking
* Load Balance Reloading
* Promo Registration History
* Random Reference Number Generation
* Exception Handling for Invalid Inputs
* Back and Exit Navigation Options
* Clear Screen and Pause Functionality

---

## Program Requirements

### 1. USSD Validation

The program must:

* Ask the user to enter the USSD code `*143#`.
* Continue to the Main Menu if the code is valid.
* Exit the program if the code is invalid.

---

### 2. Main Menu

The program displays the following options:

* Go+ Promos
* GoSURF Promos
* GoUNLI Promos
* Call Promos
* Text Promos
* Call and Text Promos
* Check Balance
* Load Balance
* Promo History
* Exit

---

### 3. Promo Registration

Each promo contains the following information:

* Promo Name
* Price
* Validity in Days

Users are able to:

* Select a promo.
* View promo details.
* Confirm the subscription.
* Return to the previous menu.
* Exit the application.

---

### 4. Balance Management

The program allows users to:

* Check their current load balance.
* Add load credits.
* Register to Globe promos.
* Deduct the promo price after successful registration.
* Prevent promo registration when the balance is insufficient.

---

### 5. Promo History

The program stores all successful registrations and displays:

* Promo Name
* Promo Price
* Promo Validity
* Reference Number

If no registrations have been made, the program displays an appropriate message.

---

### 6. Reference Number Generation

Every successful registration generates a unique six-digit reference number using Java's `Math.random()` method.

---

## Instructions

### Step 1 – Run the Program

Execute the Java application and enter the following USSD code:

```
*143#
```

---

### Step 2 – Access the Main Menu

Select one of the available options:

```
[1] Go+ Promos
[2] GoSURF Promos
[3] GoUNLI Promos
[4] Call Promos
[5] Text Promos
[6] Call N Text Promos
[7] Check Balance
[8] Load Balance
[9] Promo History
[10] Exit
```

---

### Step 3 – Select a Promo

Navigate to your preferred promo category and choose the desired promo.

---

### Step 4 – Confirm Your Subscription

The program displays the following information:

* Promo Name
* Validity
* Price

Available options:

```
[1] Subscribe
[2] Back
[3] Exit
```

---

### Step 5 – Successful Registration

If the current load balance is sufficient:

* The promo price is deducted.
* A six-digit reference number is generated.
* The transaction is stored in the Promo History.
* The remaining load balance is displayed.

---

### Step 6 – Check Your Balance

Users may check their remaining load balance at any time from the Main Menu.

---

### Step 7 – Load Additional Credits

Users may add load credits by entering a valid amount.

---

### Step 8 – View Promo History

Users may review all successfully registered promos and their corresponding reference numbers.

---

## Java Concepts Applied

This project demonstrates the following Java programming concepts:

* Variables and Data Types
* Scanner Class
* Arithmetic Operators
* Relational Operators
* Logical Operators
* Conditional Statements (if-else)
* Switch Statements
* While Loops
* For Loops
* Single-Dimensional Arrays
* String Methods
* Math Class
* Random Number Generation
* Methods
* Parameters and Arguments
* Method Invocation
* Return Statements
* Exception Handling (try-catch)
* Input Validation

---

## Sample Program Flow

```
Start Program
      |
      v
Validate USSD Code
      |
      v
Display Main Menu
      |
      v
Select Promo Category
      |
      v
Select Promo
      |
      v
Subscription Confirmation
      |
      v
Check Load Balance
      |
      +------------------------+
      |                        |
      v                        v
Enough Balance          Insufficient Balance
      |                        |
      v                        v
Deduct Promo Price      Display Error Message
      |
      v
Generate Reference Number
      |
      v
Save Promo History
      |
      v
Display Remaining Balance
      |
      v
Return to Main Menu
```

---

## Capstone Information

* Capstone Title: Globe Telecom Load Registration System
* Capstone Project: Capstone 1
* Course: Java Programming
* Institution: TESDA (Technical Education and Skills Development Authority)
* Programming Language: Java
* Application Type: Console-Based Application

---

## Developer Information

* Developed by: John Maynard Gabriel

---

## Disclaimer

This project was developed for educational purposes as part of the TESDA Java Programming course. The Globe Telecom name and promo offerings are used solely for simulation and learning purposes and are not affiliated with or endorsed by Globe Telecom.
