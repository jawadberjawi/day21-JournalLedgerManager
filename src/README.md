# 📊 Journal & Ledger Manager (Java Accounting Project)

This Java console application allows users to view and filter accounting transactions using multiple criteria. It is part of a modular accounting system built step-by-step to simulate real-world finance workflows.

---

## ✅ Features

- 📚 **Simple Ledger View** – shows a summary of all transactions (ID, description, amount)
- 🔍 **Multi-Criteria Filtering** – filter by:
    - Transaction Status (Approved, Pending, Rejected)
    - Created By (person who recorded the entry)
    - Minimum Amount
- 👨‍💻 Fully interactive through Java `Scanner`
- 🧱 Built using clean OOP structure with reusable classes

---

## 🧱 Technologies Used

- Java 17+
- IntelliJ IDEA (or any IDE)
- LocalDate from `java.time`
- `ArrayList`, `Scanner`

---

## 🧩 How It Works

### 🔸 Main Class:
- Provides the main menu:
    - Option 1: View simple ledger
    - Option 2: Apply multi-filter

### 🔸 Transaction Class:
- Represents each accounting entry
- Includes fields like:
    - `transactionID`, `date`, `description`, `amount`, `type`, `createdBy`, `status`
- Includes a `display()` method for clean output

### 🔸 JournalLedgerManager Class:
- Handles all logic for filtering and printing
- Allows combining filters for real use cases (e.g., show all approved transactions by Jawad with amount > 500)

---

## 📸 Sample Output

```
📊 Welcome to Journal & Ledger Manager
1. View Simple Ledger
2. Filter Transactions
Choose an option: 2

📚 Multi-Filter Options:
1. Filter by Status
2. Filter by Created By
3. Filter by Min Amount
Enter the numbers of filters you want (e.g. 1,2): 1,2
Enter Status (Approved / Pending / Rejected): Approved
Enter Created By: Jawad

📋 Filtered Transactions:
📌 Transaction ID: T001
📝 Description: Laptop Purchase
💵 Amount: 1200.0
...
```

---

## 🔗 Project Goals

This project is part of a 10-step roadmap to build a full accounting system from scratch using Java. It focuses on:
- Practicing object-oriented design
- Building user-friendly console systems
- Preparing for real-world developer interviews

---

## 👨‍💻 Author

**Jawad Berjawi**  
🔗 [LinkedIn](https://www.linkedin.com/in/jawad-berjawi-8558ab370)  
💻 [GitHub](https://github.com/jawadberjawi)

---

## 🏗️ Future Plans

- Add transaction input (from Project 1)
- Export filtered results to file
- Integrate with full accounting system
- Migrate to Spring Boot + MySQL
