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

### Ride-Hailing & Banking Applications  
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

### College Portal & E-Commerce Applications  
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
🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions

---

### Learning & Fitness Management Applications  
**Date:** 06-Jan-2026

- Building comprehensive learning and fitness tracking systems.
- Implementing virtual pet care with state management.
- Event management platform with scheduling logic.

**Projects Completed:**

**10. EduMentor – Online Tutoring Platform**
- Base Class: Person (name, email, userId)
- Derived Classes: Student, Tutor extend Person
- Interface: IBookable with bookSession(), cancelSession()
- Session class: manages tutor-student sessions
- Encapsulation: Private hourlyRate and rating
- Operators: sessionHours × hourlyRate, payment - platformFee
- Polymorphism: Different session types and rates

**Key Features:**
- Tutor management with ratings and specializations
- Session booking system
- Payment calculation with platform fees
- Constructor-based tutor initialization
- Protected rating updates

**11. FitTrack – Personal Fitness Tracker**
- Base Class: Activity (activityId, name, duration, caloriesBurned)
- Derived Classes: Running, Cycling, Swimming, Yoga
- Interface: ITrackable with recordActivity(), displayProgress()
- UserProfile class: manages user goals and activities
- Encapsulation: Private weight, age, BMI calculations
- Operators: totalCalories, distance × pace calculations
- Polymorphism: Different calorie calculation per activity type

**Key Features:**
- Activity tracking with different exercise types
- Calorie burn calculations specific to activity
- User profile with fitness goals
- Progress tracking and display
- Constructor overloading for activity creation

**12. PetPal – Virtual Pet Care App**
- Base Class: Pet (name, type, age)
- Derived Classes: Dog, Cat, Bird extend Pet
- Interface: IInteractable with feed(), play(), sleep()
- Encapsulation: Private hunger, mood, energy levels
- Operators: Increase/decrease energy and hunger
- Polymorphism: makeSound() behaves differently per pet
- Random or user-specified pet initialization

**Key Features:**
- Virtual pet adoption and care
- State management (hunger, mood, energy)
- Interactive actions (feed, play, sleep)
- Pet-specific behaviors
- Protected state modification methods

**13. EventEase – Event Management Platform**
- Base Class: Event (eventName, location, date, attendees)
- Derived Classes: BirthdayEvent, ConferenceEvent
- User class: represents event organizers
- Interface: ISchedulable with schedule(), reschedule(), cancel()
- Encapsulation: Final eventId (immutable), private pricing
- Operators: venue + services - discounts
- Polymorphism: Different scheduling behavior per event type

**Key Features:**
- Event creation with/without packages (catering, decoration)
- Cost calculation system
- Event scheduling and rescheduling
- Protected sensitive user data
- Constructor overloading for package options

🔗 **Code Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions

---

### Bookstore, Parking & Loan Management Systems  
**Date:** 07-Jan-2026

- Implementing real-world business management systems.
- Advanced OOP with user interaction and Scanner input.
- Multi-file architecture with separate classes.

**Projects Completed:**

**14. LoanBuddy – Loan Management System**
- Base Class: LoanApplication (applicant, loanType, term, interestRate)
- Derived Classes: HomeLoan, EducationLoan, PersonalLoan extend LoanApplication
- Applicant Class: name, creditScore, income, loanAmount
- Interface: Approvable with approveLoan(), calculateEmi()
- Encapsulation: Private applicant details with getter methods
- Operators: EMI calculation using compound interest formula
- Polymorphism: Different approval criteria per loan type

**Key Features:**
- Multi-loan type support (Home, Education, Personal)
- Credit score-based approval logic
- EMI calculation specific to loan type
- Interactive user input with Scanner
- Constructor-based initialization

**15. BookBazaar – Digital Bookstore System**
- Base Class: Book (title, author, price, stock)
- Derived Classes: EBook, PrintedBook extend Book
- Order Class: links user to books with quantity tracking
- Interface: IDiscountable with applyDiscount()
- Encapsulation: Stock updated only through methods
- Operators: price × quantity - discount
- Polymorphism: applyDiscount() varies by book type

**Key Features:**
- Inventory management with stock tracking
- Different discount rates (EBook 15%, PrintedBook 10%)
- Order management with multiple books
- Constructor overloading for optional offers
- Access modifiers for order status protection

**16. ParkEase – Smart Parking Management System**
- Base Class: Vehicle (vehicleNumber, ownerName, baseRate)
- Derived Classes: Car, Bike, Truck extend Vehicle
- ParkingSlot Class: slotId, isOccupied, vehicleTypeAllowed
- Interface: IPayable with calculateCharges(duration)
- Encapsulation: Slot availability modified only through methods
- Operators: (baseRate × hours) + penalty for overtime
- Polymorphism: calculateCharges() differs by vehicle type

**Key Features:**
- Real-time parking slot availability tracking
- Vehicle type-specific parking slots
- Overtime penalty calculations (Car: 8hrs, Bike: 12hrs, Truck: 6hrs)
- Capacity-based charging for trucks
- Private booking logs with public access methods

🔗 **Code Links:**  
👉 [LoanBuddy](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/loanbuddy)  
👉 [BookBazaar](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/bookbazaar)  
👉 [ParkEase](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/parkease)

---

### Day 8 – Advanced Scenario-Based OOP Projects  
**Date:** 08-Jan-2026

**17. MediStore – Pharmacy Inventory & Sales System**
- Base Class: Medicine (name, price, expiryDate, quantity)
- Derived Classes: Tablet, Syrup, Injection extend Medicine
- Interface: ISellable with sell() and checkExpiry() methods
- Encapsulation: Stock and cost details are private
- Polymorphism: checkExpiry() varies by medicine type
  - Tablet: expires on stated date
  - Syrup: expires 30 days before (liquid preservation)
  - Injection: expires 15 days before (safety)
- Operators: Total price calculation with discount support
- Access Modifiers: Private pricing logic

**Key Features:**
- Inventory management with real-time stock updates
- Expiry tracking with medicine-specific rules
- Sales transactions with stock deduction
- Different expiry behaviors for preserved vs liquid medications
- Constructor overloading for default quantities
- Interactive menu-driven system

**18. TourMate – Travel Itinerary Planner**
- Base Class: Trip (destination, budget, duration)
- Derived Classes: InternationalTrip, DomesticTrip extend Trip
- Associated Classes: Transport, Hotel, Activity
- Interface: IBookable with book() and cancel() methods
- Encapsulation: Cost breakdown hidden inside services
- Polymorphism: book() logic differs by trip type
  - InternationalTrip: includes visa charges, cancellation fees
  - DomesticTrip: simple booking, no extra charges
- Operators: total budget = hotel + transport + activities
- Constructors: Generate complete trip packages

**Key Features:**
- Trip planning with budget management
- Multiple service associations (hotel, transport, activities)
- Different booking logic for domestic vs international trips
- Visa requirement handling for international trips
- Cancellation policy (20% fee for international trips)
- Cost validation against budget before booking
- Interactive trip creation and booking system

🔗 **Code Links:**  
👉 [MediStore](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/mediaStore)  
👉 [TourMate](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/tourmate)

---
---

### Day 9 – Scenario Implementations
**Date:** 09-Jan-2026

- Implemented three scenario-based OOP programs and added them to the repository on branch `java-oops-practice`:
  - Artify – Digital Art Marketplace
    - Path: java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/artify
    - Files added: IPurchasable.java, Artwork.java, DigitalArt.java, PrintArt.java, User.java, ArtifyDemo.java
  - FoodLoop – Restaurant Ordering System
    - Path: java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/foodloop
    - Files added: IOrderable.java, FoodItem.java, VegItem.java, NonVegItem.java, Order.java, FoodLoopDemo.java
  - SkillForge – Online Learning Portal
    - Path: java-oops-practice/scenario-based-questions/scenarioBasedQuestions/src/com/scenariobasedquestion/skillforge
    - Files added: ICertifiable.java, User.java, Student.java, Instructor.java, Course.java, SkillForgeDemo.java

- 
---
