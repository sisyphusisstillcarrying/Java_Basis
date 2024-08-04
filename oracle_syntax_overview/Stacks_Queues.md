
# Data Structures: Stacks and Queues in Java

## Table of Contents
- [Data Structures: Stacks and Queues in Java](#data-structures-stacks-and-queues-in-java)
  - [Table of Contents](#table-of-contents)
  - [Stacks](#stacks)
    - [Stack Concept](#stack-concept)
    - [Stack Array Implementation](#stack-array-implementation)
    - [Stack Linked List Implementation](#stack-linked-list-implementation)
    - [Java's Built-in Stack](#javas-built-in-stack)
    - [Stack Common Operations](#stack-common-operations)
    - [Stack Time Complexities](#stack-time-complexities)
    - [Stack Use Cases](#stack-use-cases)
    - [Advanced Stack Concepts](#advanced-stack-concepts)
  - [Queues](#queues)
    - [Queue Concept](#queue-concept)
    - [Queue Array Implementation](#queue-array-implementation)
    - [Queue Linked List Implementation](#queue-linked-list-implementation)
    - [Java's Built-in Queue](#javas-built-in-queue)
    - [Queue Common Operations](#queue-common-operations)
    - [Queue Time Complexities](#queue-time-complexities)
    - [Queue Use Cases](#queue-use-cases)
    - [Advanced Queue Concepts](#advanced-queue-concepts)
  - [Comparison](#comparison)

## Stacks

### Stack Concept

A stack is a Last-In-First-Out (LIFO) data structure where elements are added and removed from the same end, called the top. It follows the principle that the last element added to the stack will be the first one to be removed.

### Stack Array Implementation

```java
public class ArrayStack<T> {
    private T[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            resize();
        }
        stack[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack[top];
        stack[top--] = null;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newStack = (T[]) new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
```

### Stack Linked List Implementation

```java
public class LinkedStack<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
```

### Java's Built-in Stack

Java provides a built-in `Stack` class in the `java.util` package. However, it's generally recommended to use `Deque` interface implementations like `ArrayDeque` for stack operations due to better performance.

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class JavaStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.pop());  // Outputs: 3
        System.out.println(stack.peek()); // Outputs: 2
    }
}
```

### Stack Common Operations

1. `push(item)`: Add an item to the top of the stack
2. `pop()`: Remove and return the top item from the stack
3. `peek()`: Return the top item without removing it
4. `isEmpty()`: Check if the stack is empty
5. `size()`: Return the number of items in the stack

### Stack Time Complexities

| Operation | Array-based | Linked List-based |
|-----------|-------------|-------------------|
| push()    | O(1)*       | O(1)              |
| pop()     | O(1)        | O(1)              |
| peek()    | O(1)        | O(1)              |
| isEmpty() | O(1)        | O(1)              |
| size()    | O(1)        | O(1)              |

* Amortized O(1) for array-based implementation due to occasional resizing.

### Stack Use Cases

1. Function call stack in programming languages
2. Undo/Redo operations in text editors
3. Expression evaluation and syntax parsing
4. Backtracking algorithms (e.g., maze solving, game tree exploration)
5. Browser history (back button functionality)

### Advanced Stack Concepts

1. **Min Stack**: A stack that supports push, pop, top, and retrieving the minimum element in constant time.
2. **Stack using Queues**: Implementing a stack using two queues.
3. **Infix to Postfix Conversion**: Using a stack to convert infix expressions to postfix notation.
4. **Balanced Parentheses**: Checking for balanced parentheses in an expression using a stack.

## Queues

### Queue Concept

A queue is a First-In-First-Out (FIFO) data structure where elements are added at one end (rear) and removed from the other end (front). It follows the principle that the first element added to the queue will be the first one to be removed.

### Queue Array Implementation

```java
public class ArrayQueue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == queue.length) {
            resize();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newQueue = (T[]) new Object[queue.length * 2];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }
}
```

### Queue Linked List Implementation

```java
public class LinkedQueue<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
```

### Java's Built-in Queue

Java provides the `Queue` interface in the `java.util` package. A common implementation is `LinkedList`.

```java
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        System.out.println(queue.poll());  // Outputs: 1
        System.out.println(queue.peek());  // Outputs: 2
    }
}
```

### Queue Common Operations

1. `enqueue(item)` or `offer(item)`: Add an item to the rear of the queue
2. `dequeue()` or `poll()`: Remove and return the front item from the queue
3. `peek()`: Return the front item without removing it
4. `isEmpty()`: Check if the queue is empty
5. `size()`: Return the number of items in the queue

### Queue Time Complexities

| Operation | Array-based | Linked List-based |
|-----------|-------------|-------------------|
| enqueue() | O(1)*       | O(1)              |
| dequeue() | O(1)        | O(1)              |
| peek()    | O(1)        | O(1)              |
| isEmpty() | O(1)        | O(1)              |
| size()    | O(1)        | O(1)              |

* Amortized O(1) for array-based implementation due to occasional resizing.

### Queue Use Cases

1. Task scheduling in operating systems
2. Breadth-First Search algorithm in graph traversal
3. Print job spooling
4. Handling of requests on a single shared resource (e.g., printer, CPU)
5. Buffering for data streams

### Advanced Queue Concepts

1. **Priority Queue**: A queue where elements have associated priorities and are dequeued based on their priority.
2. **Circular Queue**: An efficient array implementation where the queue wraps around to the beginning of the array.
3. **Double-ended Queue (Deque)**: A queue that allows insertion and deletion at both ends.
4. **Blocking Queue**: A queue that supports operations that wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element.

## Comparison

| Feature     | Stack                   | Queue                   |
|-------------|-------------------------|-------------------------|
| Order       | Last-In-First-Out (LIFO)| First-In-First-Out (FIFO)|
| Insert      | Push (at top)           | Enqueue (at rear)       |
| Remove      | Pop (from top)          | Dequeue (from front)    |
| Access      | Top element             | Front element           |
| Applications| Undo/Redo, Parsing      | Task Scheduling, BFS    |

Both stacks and queues are fundamental data structures used in various algorithms and applications, each with its unique characteristics and use cases. Understanding their properties and implementations is crucial for efficient problem-solving in computer science and software development.
