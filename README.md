## WEEK 3 - DATA STRUCTURE AND ALGORITHMS

### Day 1 (02-Jan-2026): LinkedList Implementation

**Topics Covered:**
- Singly Linked List
- Doubly Linked List
- Circular Linked List

**Projects Implemented:**

#### Singly Linked List
1. **Student Record Management System**
   - [StudentRecord.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/StudentRecord.java) - Student data model
   - [StudentLinkedList.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/StudentLinkedList.java) - Custom linked list implementation
   - [StudentRecordManager.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/StudentRecordManager.java) - CRUD operations
   - [StudentRecordDemo.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/StudentRecordDemo.java) - Demo class

2. **Inventory Management System**
   - [InventoryItem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/InventoryItem.java) - Item data model
   - [InventoryLinkedList.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/InventoryLinkedList.java) - Custom linked list
   - [InventoryManagementSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/InventoryManagementSystem.java) - Demo class

3. **Social Media Network**
   - [User.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/User.java) - User data model
   - [SocialMediaNetwork.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/SocialMediaNetwork.java) - Network implementation
   - [SocialMediaSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/singlylinkedlist/SocialMediaSystem.java) - Demo class

#### Doubly Linked List
1. **Text Editor with Undo/Redo**
   - [TextEditorUndoRedo.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/TextEditorUndoRedo.java) - Doubly linked list implementation
   - [TextEditorSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/TextEditorSystem.java) - Demo class

2. **Movie Management System**
   - [Movie.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/Movie.java) - Movie data model
   - [MovieDoublyLinkedList.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/MovieDoublyLinkedList.java) - Custom doubly linked list
   - [MovieManagementSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/MovieManagementSystem.java) - Demo class

3. **Library Management System**
   - [Book.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/Book.java) - Book data model
   - [LibraryDoublyLinkedList.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/LibraryDoublyLinkedList.java) - Custom doubly linked list
   - [LibraryManagementSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/doublylinkedlist/LibraryManagementSystem.java) - Demo class

#### Circular Linked List
1. **Task Scheduler System**
   - [Task.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/Task.java) - Task data model
   - [TaskCircularLinkedList.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/TaskCircularLinkedList.java) - Circular linked list implementation
   - [TaskScheduler.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/TaskScheduler.java) - Demo class

2. **Round Robin Scheduling System**
   - [Process.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/Process.java) - Process data model
   - [RoundRobinScheduler.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/RoundRobinScheduler.java) - Scheduler implementation
   - [RoundRobinSchedulingSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/RoundRobinSchedulingSystem.java) - Demo class

3. **Online Ticket Reservation System**
   - [Ticket.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/Ticket.java) - Ticket data model
   - [TicketReservationSystem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/TicketReservationSystem.java) - Circular queue implementation
   - [OnlineTicketReservation.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linkedlist/circularlinkedlist/OnlineTicketReservation.java) - Demo class

**Key Concepts Learned:**
- Node structure and traversal
- Insertion and deletion operations
- Bidirectional navigation in doubly linked lists
- Circular traversal and round-robin scheduling
- Real-world applications of linked lists

---

### Day 2 (03-Jan-2026): Stack, Queue, HashMap and Hashing Functions

**Topics Covered:**
- Stack and Queue Operations
- HashMap Implementation
- Hashing Functions
- Problem Solving with Stack, Queue, and HashMap

**Problems Solved:**

#### Stack & Queue Problems
1. **Queue Using Stacks**
   - [Q1_QueueUsingStacks.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/stackqueue/Q1_QueueUsingStacks.java)
   - Implemented queue operations using two stacks
   - Time Complexity: O(1) amortized for enqueue and dequeue

2. **Sort Stack Using Recursion**
   - [Q2_SortStackRecursion.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/stackqueue/Q2_SortStackRecursion.java)
   - Recursive approach to sort stack without using extra data structures
   - Time Complexity: O(n²)

3. **Stock Span Problem**
   - [Q3_StockSpanProblem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/stackqueue/Q3_StockSpanProblem.java)
   - Calculate span of stock prices using stack
   - Time Complexity: O(n)

4. **Sliding Window Maximum**
   - [Q4_SlidingWindowMaximum.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/stackqueue/Q4_SlidingWindowMaximum.java)
   - Find maximum in each sliding window using deque
   - Time Complexity: O(n)

5. **Circular Tour Problem**
   - [Q5_CircularTourProblem.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/stackqueue/Q5_CircularTourProblem.java)
   - Find starting point for circular tour of petrol pumps
   - Time Complexity: O(n)

#### HashMap & Hashing Problems
1. **Zero Sum Subarrays**
   - [Q1_ZeroSumSubarrays.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/hashmap/Q1_ZeroSumSubarrays.java)
   - Find all subarrays with sum equal to zero using HashMap
   - Uses cumulative sum and HashMap for O(n) solution

2. **Pair with Given Sum**
   - [Q2_PairWithGivenSum.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/hashmap/Q2_PairWithGivenSum.java)
   - Find pairs in array that sum to target using complement lookup
   - Time Complexity: O(n) with HashMap

3. **Longest Consecutive Sequence**
   - [Q3_LongestConsecutiveSequence.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/hashmap/Q3_LongestConsecutiveSequence.java)
   - Find longest consecutive sequence in unsorted array
   - Uses HashSet for O(n) time complexity

4. **Custom HashMap Implementation**
   - [Q4_CustomHashMap.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/hashmap/Q4_CustomHashMap.java)
   - Built HashMap from scratch with separate chaining
   - Implemented put, get, remove, and resize operations
   - Hash function and collision handling

5. **Two Sum Problem**
   - [Q5_TwoSum.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stackqueuehashmap/hashmap/Q5_TwoSum.java)
   - Return indices of two numbers that add up to target
   - HashMap-based O(n) solution

**Key Concepts Learned:**
- Stack operations: push, pop, peek
- Queue operations: enqueue, dequeue
- Deque for sliding window problems
- HashMap internal working and collision resolution
- Hashing functions and hash code generation
- Separate chaining for collision handling
- Time-space tradeoff in problem solving
- Amortized time complexity analysis
- Cumulative sum technique with HashMap

---

### Day 3 (06-Jan-2026): Sorting Techniques

**Topics Covered:**
- Bubble Sort, Insertion Sort, Selection Sort
- Merge Sort, Quick Sort, Heap Sort
- Counting Sort
- Time and space complexity analysis

**Problems Solved:**

1. **Bubble Sort - Student Marks**
   - [Q1_BubbleSortStudentMarks.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q1_BubbleSortStudentMarks.java)
   - Time Complexity: O(n²), Space: O(1)

2. **Insertion Sort - Employee IDs**
   - [Q2_InsertionSortEmployeeIDs.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q2_InsertionSortEmployeeIDs.java)
   - Time Complexity: O(n²), Space: O(1)

3. **Merge Sort - Book Prices**
   - [Q3_MergeSortBookPrices.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q3_MergeSortBookPrices.java)
   - Time Complexity: O(n log n), Space: O(n)

4. **Quick Sort - Product Prices**
   - [Q4_QuickSortProductPrices.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q4_QuickSortProductPrices.java)
   - Time Complexity: O(n log n) average, Space: O(log n)

5. **Selection Sort - Exam Scores**
   - [Q5_SelectionSortExamScores.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q5_SelectionSortExamScores.java)
   - Time Complexity: O(n²), Space: O(1)

6. **Heap Sort - Job Applicant Salaries**
   - [Q6_HeapSortSalary.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q6_HeapSortSalary.java)
   - Time Complexity: O(n log n), Space: O(1)

7. **Counting Sort - Student Ages**
   - [Q7_CountingSortStudentAges.java](dsa-practice/gcr-codebase/dsaPractice/src/com/sorting/Q7_CountingSortStudentAges.java)
   - Time Complexity: O(n + k), Space: O(k)

---

### Day 4 (07-Jan-2026): StringBuffer, FileReader and Search Algorithms

**Topics Covered:**
- StringBuilder vs StringBuffer
- FileReader and InputStreamReader
- Linear Search Algorithm
- Binary Search Algorithm

**Programs Implemented:**

#### StringBuffer Practice
1. [ReverseString.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/stringbuffer/ReverseString.java) - Reverse string using StringBuffer
2. [RemoveDuplicateCharacters.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/stringbuffer/RemoveDuplicateCharacters.java) - Remove duplicate characters from string
3. [ConcatenateMultipleStrings.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/stringbuffer/ConcatenateMultipleStrings.java) - String concatenation performance
4. [CompareStringBuilderStringBuffer.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/stringbuffer/CompareStringBuilderStringBuffer.java) - Performance comparison

#### FileReader Practice
1. [ReadFileLineByLine.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/filereader/ReadFileLineByLine.java) - Read text file line by line
2. [CountWordOccurrenceInFile.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/filereader/CountWordOccurrenceInFile.java) - Count word occurrences in file
3. [ConvertByteToCharacterStream.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/filereader/ConvertByteToCharacterStream.java) - Byte to character stream conversion
4. [ReadConsoleWriteToFile.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/filereader/ReadConsoleWriteToFile.java) - Console input to file writer
5. [ChallengeCompareAll.java](dsa-practice/gcr-codebase/dsaPractice/src/com/stringbufferfilereader/filereader/ChallengeCompareAll.java) - Performance comparison challenge

#### Linear Search
1. [SearchFirstNegativeNumber.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/linearsearch/SearchFirstNegativeNumber.java) - Find first negative in array
2. [SearchWordInSentences.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/linearsearch/SearchWordInSentences.java) - Search word in sentence array
3. [ChallengeLinearAndBinarySearch.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/linearsearch/ChallengeLinearAndBinarySearch.java) - Linear vs Binary performance

#### Binary Search
1. [FindRotationPoint.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/binarysearch/FindRotationPoint.java) - Rotation point in sorted array
2. [FindPeakElement.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/binarysearch/FindPeakElement.java) - Peak element in array
3. [SearchIn2DMatrix.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/binarysearch/SearchIn2DMatrix.java) - 2D matrix search
4. [FindFirstAndLastOccurrence.java](dsa-practice/gcr-codebase/dsaPractice/src/com/linearandbinary/binarysearch/FindFirstAndLastOccurrence.java) - First and last occurrence

**Key Concepts Learned:**
- Thread-safe vs non-thread-safe string operations
- File I/O with character and byte streams
- Linear search: O(n) time complexity
- Binary search: O(log n) time complexity
- 2D matrix search optimization

---

### Day 5 (08-Jan-2026): Algorithm Runtime Analysis

**Topics Covered:**
- Big O Notation and Time Complexity Analysis
- Comparative Performance Testing
- Search Algorithm Efficiency
- Sorting Algorithm Comparison
- String Operations Performance
- File I/O Performance
- Recursive vs Iterative Approaches
- Data Structure Search Comparison

**Programs Implemented:**

1. **Search Algorithm Comparison**
   - [SearchComparison.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/SearchComparison.java)
   - Linear Search O(N) vs Binary Search O(log N)
   - Performance tested on datasets: 1K, 10K, 1M elements
   - Result: Binary search significantly faster for large datasets

2. **Sorting Algorithm Comparison**
   - [SortingComparison.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/SortingComparison.java)
   - Bubble Sort O(N²) vs Merge Sort O(N log N) vs Quick Sort O(N log N)
   - Tested on: 1K, 10K, 100K elements
   - Result: Bubble sort impractical for large data, Quick sort fastest

3. **String Concatenation Performance**
   - [StringConcatenation.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/StringConcatenation.java)
   - String O(N²) vs StringBuilder O(N) vs StringBuffer O(N)
   - Tested: 1K, 10K, 100K operations
   - Result: StringBuilder fastest, String unusable for large ops

4. **File Reading Efficiency**
   - [FileReadingComparison.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/FileReadingComparison.java)
   - FileReader vs InputStreamReader performance
   - File sizes: 1MB, 10MB, 50MB
   - Result: InputStreamReader more efficient for large files

5. **Fibonacci Computation**
   - [FibonacciComparison.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/FibonacciComparison.java)
   - Recursive O(2^n) vs Iterative O(N)
   - Tested: Fib(10), Fib(20), Fib(30), Fib(40)
   - Result: Recursive impractical for n>40, iterative highly efficient

6. **Data Structure Search Performance**
   - [DataStructureSearch.java](dsa-practice/gcr-codebase/dsaPractice/src/com/algoruntimeanalysis/DataStructureSearch.java)
   - Array O(N) vs HashSet O(1) vs TreeSet O(log N)
   - Dataset sizes: 1K, 100K, 1M elements
   - Result: HashSet fastest, TreeSet maintains order

**Key Concepts Learned:**
- Time complexity analysis and measurement
- Space-time tradeoffs in algorithms
- Practical performance vs theoretical complexity
- Exponential growth in recursive algorithms
- Hash-based vs tree-based data structures
- Choosing right algorithm for dataset size
- Amortized analysis in string operations

### Day 6 (10-Jan-2026): Scenario-Based DSA Applications

**Topics Covered:**
- Real-world data structure implementations
- HashMap + LinkedList combination
- Doubly LinkedList + Stack for navigation
- Circular LinkedList for round-robin systems

**Scenario-Based Projects Implemented:**

#### 1. BookShelf - Library Organizer System
**Data Structures Used:** HashMap + LinkedList
**Location:** [bookshelf](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/)

**Components:**
- [Book.java](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/Book.java) - Book data model
- [BookNode.java](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/BookNode.java) - LinkedList node
- [BookList.java](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/BookList.java) - Custom LinkedList with add/remove operations
- [Library.java](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/Library.java) - HashMap-based genre catalog
- [LibrarySystem.java](dsa-practice/scenario-based/dsaScenariBased/src/com/bookshelf/LibrarySystem.java) - Demo application

**Features:**
- Genre-wise book organization using HashMap
- Dynamic book insertion/deletion using LinkedList
- Efficient book borrowing and returning
- Catalog display by genre

#### 2. BrowserBuddy - Tab History Manager
**Data Structures Used:** Doubly LinkedList + Stack
**Location:** [broswerbuddy](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/)

**Components:**
- [TabNode.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/TabNode.java) - Doubly LinkedList node
- [BrowserHistory.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/BrowserHistory.java) - Forward/backward navigation
- [StackNode.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/StackNode.java) - Stack node
- [ClosedTabStack.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/ClosedTabStack.java) - Closed tabs management
- [Browser.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/Browser.java) - Main browser logic
- [BrowserBuddy.java](dsa-practice/scenario-based/dsaScenariBased/src/com/broswerbuddy/BrowserBuddy.java) - Demo application

**Features:**
- Page visit tracking with doubly linked list
- Back and forward navigation
- Closed tab storage using stack (LIFO)
- Reopen recently closed tabs
- Memory-efficient tab management

#### 3. AmbulanceRoute - Emergency Patient Navigation
**Data Structures Used:** Circular LinkedList
**Location:** [ambulance](dsa-practice/scenario-based/dsaScenariBased/src/com/ambulance/)

**Components:**
- [HospitalUnit.java](dsa-practice/scenario-based/dsaScenariBased/src/com/ambulance/HospitalUnit.java) - Circular LinkedList node
- [CircularRoute.java](dsa-practice/scenario-based/dsaScenariBased/src/com/ambulance/CircularRoute.java) - Circular route management
- [AmbulanceRoute.java](dsa-practice/scenario-based/dsaScenariBased/src/com/ambulance/AmbulanceRoute.java) - Demo application

**Features:**
- Circular hospital unit routing (Emergency  Radiology  Surgery  ICU  Emergency)
- Find nearest available unit using circular traversal
- Unit availability tracking
- Dynamic unit removal for maintenance
- Patient redirection in circular path

**Key Concepts Learned:**
- Combining multiple data structures for complex problems
- HashMap for O(1) lookup with LinkedList for ordering
- Doubly LinkedList for bidirectional traversal
- Stack for LIFO operations (closed tabs)
- Circular LinkedList for round-robin scheduling
- Real-world application design patterns
- Memory-efficient pointer-based navigation

---

### Day 7 (12-Jan-2026): Advanced Scenario-Based DSA Problems

**Topics Covered:**
- Queue + HashMap + PriorityQueue
- Doubly LinkedList navigation systems
- Stack-based undo/redo mechanisms
- Circular LinkedList + Queue combinations

**Scenario-Based Projects:** [scenario-based](dsa-practice/scenario-based/dsaScenariBased/src/com/)

1. **CallCenter** - Customer Queue Manager (Queue + HashMap + PriorityQueue)
2. **TrainCompanion** - Compartment Navigation System (Doubly LinkedList)
3. **TextEditor** - Undo/Redo Functionality (Stack)
4. **TrafficManager** - Roundabout Vehicle Flow (Circular LinkedList + Queue)

---

### Day 8 (13-Jan-2026): Complex Scenario-Based DSA Projects

**Topics Covered:**
- Singly Linked List for delivery tracking
- Stack + HashMap for exam navigation
- Queue + HashMap for checkout systems

**Projects Implemented:** [scenario-based](dsa-practice/scenario-based/dsaScenariBased/src/com/)

1. **[SmartCheckout](dsa-practice/scenario-based/dsaScenariBased/src/com/smartcheckout/)** - Multi-Counter Checkout System
   - Queue-based customer management
   - HashMap cart implementation
   - Store inventory tracking with HashMap

2. **[ParcelTracker](dsa-practice/scenario-based/dsaScenariBased/src/com/parcelTracker/)** - Delivery Chain Management
   - Singly Linked List for stage tracking
   - Custom checkpoints and timestamps
   - Lost/missing parcel handling

3. **[ExamProctor](dsa-practice/scenario-based/dsaScenariBased/src/com/examproctor/)** - Online Exam Review System
   - Stack-based navigation tracking
   - HashMap for answer storage
   - Auto-scoring function with polymorphism

---

### Day 9 (15-Jan-2026): Sorting Algorithms - Scenario-Based Applications

**Topics Covered:**
- Merge Sort, Insertion Sort, Bubble Sort, Quick Sort
- Real-world sorting scenarios
- Algorithm selection based on data characteristics

**Projects Implemented:** [scenario-based](dsa-practice/scenario-based/dsaScenariBased/src/com/)

1. **[ZipZipMart](dsa-practice/scenario-based/dsaScenariBased/src/com/zipzipmart/)** - Sales Reporting System (Merge Sort)
   - Sorts sales by date and amount
   - Efficient O(n log n) performance

2. **[ExamCell](dsa-practice/scenario-based/dsaScenariBased/src/com/examcell/)** - Student Rank Generator (Merge Sort)
   - Merges scores from multiple test centers
   - State-level rank list generation

3. **[RoboWarehouse](dsa-practice/scenario-based/dsaScenariBased/src/com/robowarehouse/)** - Shelf Loading Robot (Insertion Sort)
   - Dynamic package insertion by weight
   - Maintains sorted order for balance

4. **[CinemaHouse](dsa-practice/scenario-based/dsaScenariBased/src/com/cinemahouse/)** - Movie Time Sorting (Bubble Sort)
   - Simple showtime scheduling
   - Ideal for small datasets

5. **[CropMonitor](dsa-practice/scenario-based/dsaScenariBased/src/com/cropmonitor/)** - Sensor Data Ordering (Quick Sort)
   - Fast sorting of drone sensor data
   - Timestamp-based partitioning

6. **[HospitalQueue](dsa-practice/scenario-based/dsaScenariBased/src/com/hospitalqueue/)** - Emergency Priority System
   - Patient queue management

7. **[EventManager](dsa-practice/scenario-based/dsaScenariBased/src/com/eventmanager/)** - Event Scheduling System
   - Event organization and management

8. **[SmartShelf](dsa-practice/scenario-based/dsaScenariBased/src/com/smartshelf/)** - Inventory Management
   - Product tracking and organization

---
