# Java Design Patterns Practice

## Gang of Four (GoF) Design Patterns

---

### 03-Feb-2026: Library Management System - Case Study

Implemented a comprehensive Library Management System demonstrating four fundamental GoF design patterns working together in a real-world scenario.

#### Design Patterns Implemented:

**1. Singleton Pattern** - Library Catalog
- Ensures only one instance of the catalog exists across the entire system
- Prevents inconsistencies in book inventory management
- Thread-safe implementation with synchronized getInstance()
- [View Code: LibraryCatalog.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/LibraryCatalog.java)

**2. Factory Pattern** - User Creation
- Dynamically creates different user types (Student, Faculty, Librarian) at runtime
- Encapsulates object creation logic in UserFactory
- Supports easy extension for new user types
- [View Code: UserFactory.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/UserFactory.java)
- [View Code: Student.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/Student.java)
- [View Code: Faculty.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/Faculty.java)
- [View Code: Librarian.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/Librarian.java)

**3. Observer Pattern** - Notification System
- Automatically notifies subscribed users when new books arrive in catalog
- Implements loose coupling between catalog (subject) and users (observers)
- Multiple users can subscribe/unsubscribe to notifications dynamically
- [View Code: Observer.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/Observer.java)
- [View Code: User.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/User.java)

**4. Builder Pattern** - Book Construction
- Flexible creation of Book objects with mandatory and optional attributes
- Handles complex object construction step-by-step
- Supports method chaining for readable object creation
- [View Code: Book.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/Book.java)

#### Main Application
- Integrates all four design patterns in a working system
- Demonstrates pattern interaction and real-world usage
- [View Code: LibraryApp.java](https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/blob/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library/LibraryApp.java)

---

#### Key Learning Outcomes:
- **Singleton** ensures centralized catalog management
- **Factory** provides dynamic user creation without tight coupling
- **Observer** enables automatic notification system
- **Builder** allows flexible book object construction
- Understanding how multiple patterns work together in real applications
- Designing scalable and maintainable object-oriented systems

---

### Project Structure
```
java-design-pattern-practice/
└── gcr-codebase/
    └── java_design_pattern_practice/
        └── src/
            └── com/
                └── library/
                    ├── Observer.java          (Observer Pattern Interface)
                    ├── User.java              (User Interface extending Observer)
                    ├── Student.java           (Concrete Observer)
                    ├── Faculty.java           (Concrete Observer)
                    ├── Librarian.java         (Concrete Observer)
                    ├── UserFactory.java       (Factory Pattern)
                    ├── Book.java              (Builder Pattern)
                    ├── LibraryCatalog.java    (Singleton + Observer Subject)
                    └── LibraryApp.java        (Main Application)
```

---

🔗 **Repository Link:**  
👉 https://github.com/Abhishek-Pandey-git/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/java_design_pattern_practice/src/com/library
