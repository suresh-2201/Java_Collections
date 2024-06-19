# Collections in Java

Java Collections Framework (JCF) is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details. The framework provides interfaces, implementations, and algorithms to work with collections of objects.<br>

Key Components:<br>

1. Interfaces:<br>

Collection: The root interface in the collection hierarchy. It includes methods for basic operations such as add, remove, size, and iterator.<br>
List: An ordered collection (sequence) that allows duplicate elements. Common implementations include ArrayList, LinkedList, Vector, and Stack.<br>
Set: A collection that does not allow duplicate elements. Common implementations include HashSet, LinkedHashSet, and TreeSet.<br>
Queue: A collection used to hold multiple elements prior to processing. Common implementations include LinkedList, PriorityQueue.<br>
Deque: A double-ended queue that allows insertion and removal of elements from both ends. Common implementations include ArrayDeque, LinkedList.<br>
Map: An object that maps keys to values, with no duplicate keys allowed. Common implementations include HashMap, LinkedHashMap, TreeMap, and Hashtable.<br><br>

2. Implementations:<br>

ArrayList: A resizable array implementation of the List interface. It allows random access to elements and is efficient for indexed access but slower for insertions and deletions in the middle of the list.<br>
LinkedList: A doubly linked list implementation of the List and Deque interfaces. It allows for efficient insertions and deletions but slower random access.<br>
HashSet: A hash table-based implementation of the Set interface. It does not maintain any order of elements.<br>
LinkedHashSet: Similar to HashSet but maintains the insertion order.<br>
TreeSet: A NavigableSet implementation based on a red-black tree. It maintains elements in a sorted order.<br>
HashMap: A hash table-based implementation of the Map interface. It does not maintain any order of keys.<br>
LinkedHashMap: Similar to HashMap but maintains the insertion order of keys.<br>
TreeMap: A NavigableMap implementation based on a red-black tree. It maintains keys in a sorted order.<br>
PriorityQueue: An implementation of the Queue interface that sorts elements according to their natural order or by a Comparator provided at queue construction time.<br><br>

3. Algorithms:<br>

The Collections class provides static methods for various algorithms such as sorting, searching, shuffling, and reversing. These algorithms operate on collections and return the result.<br><br>

4. Utility Classes:<br>

Collections: Provides static methods for operating on collections, such as sort, shuffle, reverse, and binarySearch.<br>
Arrays: Provides static methods for operating on arrays, such as sort, copyOf, binarySearch, and asList.
5. Iterator:<br>

An interface for traversing elements in a collection. The Iterator interface provides methods like hasNext(), next(), and remove().<br><br>

6. Stream API:<br>

Introduced in Java 8, the Stream API allows for functional-style operations on collections. It supports operations like filtering, mapping, and reducing.<br><br>

* Usage:<br>

** Data Storage: Managing groups of related objects.<br>
** Sorting and Searching: Performing efficient operations on collections of data.<br>
** Queue Operations: Managing tasks in a first-in-first-out (FIFO) manner.<br>
** Set Operations: Handling unique elements and performing mathematical set operations.<br>