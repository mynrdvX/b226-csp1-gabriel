<div align="center">

# 📱 Globe Telecom Load Registration App

### TESDA Java Programming Capstone Project

A console-based Java application simulating Globe Telecom's `*143#` USSD load registration service.

![Java](https://img.shields.io/badge/Java-8-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-8-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![TESDA](https://img.shields.io/badge/TESDA-Java%20Programming-2E7D32?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

</div>

---

## 📑 Table of Contents

- [Overview](#-project-overview)
- [Objectives](#-project-objectives)
- [Features](#-program-features)
- [Requirements](#-program-requirements)
- [How to Use](#-instructions)
- [Java Concepts Applied](#-java-concepts-applied)
- [Program Flow](#-sample-program-flow)
- [Capstone Info](#-capstone-information)
- [Developer](#-developer-information)
- [Disclaimer](#-disclaimer)

---

## 🧭 Project Overview

The **Globe Telecom Load Registration System** is a Java console-based application that simulates Globe Telecom's load registration services. The program allows users to register to various Globe promos, check their load balance, add load credits, and view their promo registration history.

The project was designed to showcase problem-solving skills and the practical application of Java programming concepts learned during the **TESDA Java Programming** training.

---

## 🎯 Project Objectives

- Apply Java programming fundamentals in a real-world inspired application
- Demonstrate understanding of menu-driven programming
- Practice using methods, parameters, and arguments
- Implement conditional statements and loops effectively
- Utilize arrays for storing program data
- Apply exception handling using try-catch blocks
- Simulate Globe Telecom's load registration workflow

---

## ✨ Program Features

| Category | Details |
|---|---|
| 📶 **USSD Validation** | Validates the `*143#` access code |
| 🎁 **Promo Categories** | Go+, GoSURF, GoUNLI, Call, Text, Call & Text Promos |
| ✅ **Subscription Confirmation** | Confirms promo details before registering |
| 💰 **Load Balance Checking** | View current balance anytime |
| 🔋 **Load Balance Reloading** | Add credits to the account |
| 🧾 **Promo Registration History** | Tracks all successful registrations |
| 🔢 **Reference Number Generation** | Random unique 6-digit reference per transaction |
| ⚠️ **Exception Handling** | Handles invalid inputs gracefully |
| 🔙 **Navigation** | Back and Exit options throughout |
| 🖥️ **UX Utilities** | Clear screen and pause functionality |

---

## 📋 Program Requirements

### 1️⃣ USSD Validation
The program must:
- Ask the user to enter the USSD code `*143#`
- Continue to the Main Menu if the code is valid
- Exit the program if the code is invalid

### 2️⃣ Main Menu
The program displays the following options:
- Go+ Promos
- GoSURF Promos
- GoUNLI Promos
- Call Promos
- Text Promos
- Call and Text Promos
- Check Balance
- Load Balance
- Promo History
- Exit

### 3️⃣ Promo Registration
Each promo contains the following information:
- Promo Name
- Price
- Validity in Days

Users are able to:
- Select a promo
- View promo details
- Confirm the subscription
- Return to the previous menu
- Exit the application

### 4️⃣ Balance Management
The program allows users to:
- Check their current load balance
- Add load credits
- Register to Globe promos
- Deduct the promo price after successful registration
- Prevent promo registration when the balance is insufficient

### 5️⃣ Promo History
The program stores all successful registrations and displays:
- Promo Name
- Promo Price
- Promo Validity
- Reference Number

> If no registrations have been made, the program displays an appropriate message.

### 6️⃣ Reference Number Generation
Every successful registration generates a unique six-digit reference number using Java's `Math.random()` method.

---

## 🚀 Instructions

<table>
<tr><td width="70">

**Step 1**

</td><td>

**Run the Program** — Execute the Java application and enter the USSD code:
```
*143#
```

</td></tr>
<tr><td>

**Step 2**

</td><td>

**Access the Main Menu**
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

</td></tr>
<tr><td>

**Step 3**

</td><td>

**Select a Promo** — Navigate to your preferred promo category and choose the desired promo.

</td></tr>
<tr><td>

**Step 4**

</td><td>

**Confirm Your Subscription** — The program displays the Promo Name, Validity, and Price:
```
[1] Subscribe
[2] Back
[3] Exit
```

</td></tr>
<tr><td>

**Step 5**

</td><td>

**Successful Registration** — If the balance is sufficient, the price is deducted, a reference number is generated, the transaction is saved to history, and the remaining balance is displayed.

</td></tr>
<tr><td>

**Step 6**

</td><td>

**Check Your Balance** — Available anytime from the Main Menu.

</td></tr>
<tr><td>

**Step 7**

</td><td>

**Load Additional Credits** — Add load by entering a valid amount.

</td></tr>
<tr><td>

**Step 8**

</td><td>

**View Promo History** — Review all successfully registered promos and reference numbers.

</td></tr>
</table>

---

## 🧠 Java Concepts Applied

<table>
<tr>
<td width="33%" valign="top">

**Fundamentals**
- Variables & Data Types
- Arithmetic Operators
- Relational Operators
- Logical Operators
- String Methods

</td>
<td width="33%" valign="top">

**Control Flow**
- Conditional Statements
- Switch Statements
- While Loops
- For Loops
- Input Validation

</td>
<td width="33%" valign="top">

**Structures & Methods**
- Single-Dimensional Arrays
- Methods, Parameters & Arguments
- Method Invocation & Return Statements
- Scanner Class
- Math Class & Random Generation
- Exception Handling (try-catch)

</td>
</tr>
</table>

---

## 🔄 Sample Program Flow

```
Start Program
      │
      ▼
Validate USSD Code
      │
      ▼
Display Main Menu
      │
      ▼
Select Promo Category
      │
      ▼
Select Promo
      │
      ▼
Subscription Confirmation
      │
      ▼
Check Load Balance
      │
      ├─────────────────┬─────────────────────┐
      ▼                                       ▼
Enough Balance                     Insufficient Balance
      │                                       │
      ▼                                       ▼
Deduct Promo Price                Display Error Message
      │
      ▼
Generate Reference Number
      │
      ▼
Save Promo History
      │
      ▼
Display Remaining Balance
      │
      ▼
Return to Main Menu
```

---

## 🏫 Capstone Information

| Field | Detail |
|---|---|
| **Capstone Title** | Globe Telecom Load Registration System |
| **Capstone Project** | Capstone 1 |
| **Course** | Java Programming |
| **Institution** | TESDA (Technical Education and Skills Development Authority) |
| **Programming Language** | Java |
| **Application Type** | Console-Based Application |

---

## 👤 Developer Information

**Developed by:** John Maynard Gabriel

---

## ⚠️ Disclaimer

> This project was developed for educational purposes as part of the TESDA Java Programming course. The Globe Telecom name and promo offerings are used solely for simulation and learning purposes and are not affiliated with or endorsed by Globe Telecom.

<div align="center">

Made with ☕ and Java

</div>
