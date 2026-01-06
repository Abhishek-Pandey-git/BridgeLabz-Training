# BridgeLabz-Training

## Week 2: Object Oriented Programming in Java
---

```
java-oops-practice/
├── gcr-codebase/
│   └── JavaOopsConcepts/
│       └── src/
├── leet-codebase/
└── scenario-based-questions/
``` 

---

### Day 1 – Introduction to OOP & Basic Concepts  
**Date:** 26-Dec-2025

- Classes and Objects fundamentals.
- Constructors and instance variables.
- Methods and encapsulation basics.
- Practiced OOP concepts with real-world scenarios.

**Programs Completed:**
- Book (library management)
- Circle (geometry calculations)
- Employee (employee management)
- Item (inventory system)
- MobilePhone (device specifications)
- BankAccount (banking operations)
- CartItem (shopping cart)
- MovieTicket (ticket booking)
- PalindromeChecker (string manipulation with OOP)
- StudentsGrades (grade management system)

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/gcr-codebase/JavaOopsConcepts

---

### Day 2 – Constructors & Access Modifiers  
**Date:** 27-Dec-2025

- Constructor types (default, parameterized, copy).
- Constructor overloading.
- Access modifiers (`public`, `private`, `protected`, default).
- Encapsulation with getters and setters.

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/gcr-codebase/JavaOopsConcepts


### Day 3 – Final, Static, and this Keyword  
**Date:** 29-Dec-2025

- final keyword usage with variables, methods, and classes.
- static keyword for variables and methods.
- this keyword to reference current object.
- Understanding static vs instance members.

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/gcr-codebase/JavaOopsConcepts

---

### Day 4 – Object Oriented Design Principles  
**Date:** 30-Dec-2025

- Object modeling and class design.
- Understanding relationships between classes.
- Designing real-world systems using OOP.
- Applied SOLID principles basics.

**Key Focus:**
- Class design and relationships
- Object modeling techniques
- Modular method design
- Code organization and structure

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/gcr-codebase/JavaOopsConcepts

---

### Day 5 – Inheritance  
**Date:** 31-Dec-2025

- Inheritance fundamentals and syntax.
- Parent-child class relationships.
- Method overriding and super keyword.
- Types of inheritance in Java.
- Understanding IS-A relationship.

**Key Concepts:**
- Extending classes with `extends` keyword
- Accessing parent class members
- Constructor chaining in inheritance
- Method overriding vs overloading
- Protected access modifier usage

**Practice Examples:**
- Base and derived class implementations
- Real-world inheritance scenarios
- Multi-level inheritance examples

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/gcr-codebase/JavaOopsConcepts

---

### Day 6 – Encapsulation, Polymorphism, Interface & Abstract Class + Scenario-Based Problems  
**Date:** 01-Jan-2026

- Encapsulation with private fields and public methods.
- Polymorphism (compile-time and runtime).
- Interface implementation and abstract classes.
- Real-world scenario-based problem solving.

**Key Concepts Covered:**
- Data hiding and encapsulation
- Method overriding for runtime polymorphism
- Interface contracts and multiple inheritance
- Abstract classes vs interfaces
- Helper methods and modular design

**Helper Methods Practice:**
- `validateUserInput()` - Input validation
- `checkLoanEligibility()` - Business logic
- `calculateDiscount()` - Mathematical operations
- Keeping methods small, focused, and reusable

**Scenario-Based Projects Completed:**

**1. Hospital Patient Management System**
- Classes: Patient, Doctor, Bill
- Interface: Payable with calculatePayment()
- Inheritance: InPatient, OutPatient extend Patient
- Polymorphism: displayInfo() for different entities
- Encapsulation: Private medicalHistory with public getSummary()

**2. Vehicle Rental Application**
- Classes: Vehicle, Bike, Car, Truck, Customer
- Interface: Rentable with calculateRent(int days)
- Inheritance: Car, Bike, Truck extend Vehicle
- Operators: baseRate × days ± surcharges
- Encapsulation: Protected vehicle attributes

**3. University Course Enrollment System**
- Classes: Student, Course, Faculty, Enrollment
- Interface: Graded with assignGrade()
- Inheritance: Undergraduate, Postgraduate extend Student
- Operators: GPA calculations
- Polymorphism: Different grading styles

**4. E-Wallet Application**
- Classes: User, Wallet, Transaction
- Interface: Transferrable with transferTo()
- Inheritance: PersonalWallet, BusinessWallet
- Encapsulation: Private balance with getBalance()
- Operators: Deductions, taxes, referral credits

**5. Smart Home Automation System**
- Classes: Appliance, Light, Fan, AC, UserController
- Interface: Controllable with turnOn(), turnOff()
- Inheritance: Device types extend Appliance
- Polymorphism: Different behaviors for each appliance
- Operators: Energy usage comparisons

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions

---

### Day 7 – Advanced Scenario-Based Problems  
**Date:** 02-Jan-2026

- Deep dive into helper methods and modular code design.
- Breaking complex logic into reusable methods.
- Real-world story-driven programming problems.

**Helper Methods Best Practices:**
- Write small, focused, single-responsibility methods
- Examples: `isPalindrome(String s)`, `removeDuplicates(List<Integer> list)`
- Improve code readability and reusability
- Better testing and debugging

**Advanced Scenario Projects:**

**Example Class Structure Practice:**
- Customer class with name, ID
- Account class with balance, accountNumber
- SavingsAccount extends Account with interestRate
- CurrentAccount extends Account with overdraftLimit

**Key Learning:**
- Story-driven problem solving approach
- Integrating all OOP concepts together
- Classes, Variables, Methods, Constructors
- Access Modifiers, Interfaces, Operators
- Complete OOP Principles implementation

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice

---

### Day 8 – Ride-Hailing & Banking Applications  
**Date:** 03-Jan-2026

- Building complete applications with multiple classes.
- Implementing business logic with OOP principles.
- Interface-driven development.

**Projects Completed:**

**6. CabbyGo – A Ride-Hailing App**
- Classes: Vehicle, Driver, Mini, Sedan, SUV
- Interface: IRideService with bookRide(), endRide()
- Inheritance: Mini, Sedan, SUV extend Vehicle
- Encapsulation: Private location, fare, rating
- Operators: baseFare + distance × rate
- Polymorphism: Different vehicle types

**Key Features:**
- Vehicle management (vehicleNumber, capacity, type)
- Driver management (name, licenseNumber, rating)
- Fare calculation system
- Ride booking and completion
- Access modifiers protecting sensitive data

**7. MyBank – Managing Customer Accounts**
- Classes: Account, SavingsAccount, CurrentAccount
- Interface: ITransaction with deposit(), withdraw(), checkBalance()
- Inheritance: Account types extend base Account
- Encapsulation: Private balance with method-only modification
- Operators: balance × interestRate / 100
- Polymorphism: Different interest calculation by account type

**Key Features:**
- Account initialization with/without opening balance
- Transaction operations (deposit, withdraw)
- Interest calculation
- Balance protection
- Constructor overloading

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions

---

### Day 9 – College Portal & E-Commerce Applications  
**Date:** 05-Jan-2026

- Building comprehensive management systems.
- Advanced polymorphism and interface implementation.
- Complex class relationships and interactions.

**Projects Completed:**

**8. CampusConnect – College Information System**
- Base Class: Person (name, email, id)
- Derived Classes: Student, Faculty extend Person
- Interface: ICourseActions with enrollCourse(), dropCourse()
- Course class: manages students and faculty lists
- Encapsulation: Private student grades
- Operators: GPA calculation from grades
- Polymorphism: printDetails() works differently for Student and Faculty

**Key Features:**
- Student enrollment and course management
- Faculty assignment to courses
- GPA calculation system
- Access control for sensitive academic data
- Constructor-based initialization

**9. SwiftCart – The Grocery Shopping App**
- Base Class: Product (name, price, category)
- Derived Classes: PerishableProduct, NonPerishableProduct
- Cart class: manages product list and totalPrice
- Interface: ICheckout with generateBill(), applyDiscount()
- Encapsulation: Protected price calculations
- Operators: price × quantity, totalPrice - coupon
- Polymorphism: Discount varies by product type

**Key Features:**
- Cart creation with/without pre-selected items
- Constructor overloading for flexibility
- Product type-based discount logic
- Protected price update (Cart access only)
- Bill generation with itemized list
- Coupon and discount application

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions

---

## 📚 Key Learnings Summary

### OOP Concepts Mastered:
- ✅ Classes & Objects
- ✅ Constructors (Default, Parameterized, Copy, Overloading)
- ✅ Encapsulation & Access Modifiers
- ✅ Inheritance (Single, Multilevel, Hierarchical)
- ✅ Polymorphism (Compile-time & Runtime)
- ✅ Interfaces & Abstract Classes
- ✅ final, static, this keywords
- ✅ Method Overriding & Overloading
- ✅ Helper Methods & Modular Design

### Scenario-Based Projects:
- ✅ Hospital Patient Management
- ✅ Vehicle Rental System
- ✅ University Course Enrollment
- ✅ E-Wallet Application
- ✅ Smart Home Automation
- ✅ CabbyGo Ride-Hailing
- ✅ MyBank Banking System
- ✅ CampusConnect College Portal
- ✅ SwiftCart E-Commerce

---

## 🚀 Next Steps
- Data Structures & Algorithms
- Collections Framework deep dive
- Exception handling
- File I/O operations
- Multi-threading basics

