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
