# Algorithms

**[Standard Lib](https://introcs.cs.princeton.edu/java/stdlib/)**

# Overview

| Topic | Data Structure & Algorithms |
|:--:|:--:|
|Data types|**Resizing Array, Linked List;** Stack, Queue, Bag, Union-find, Priority Queue|
|Sort| **Array, BinaryHeap;** Quicksort, Mergesort, Heapsort|
|Search|**BST, Red-Black BST, HashTable**|
|Graphs|BFS, DFS, Prim, Kruskal, Dijkstra|
|Strings|Radix Sorts, Tries, KMP, Regexps, Data Compression|
|Advanced| B-Trees, Suffix Array, Maxflow|

# Todo List

## Week 1: QuickUnion

- [x] Quickfind
- [x] Quickunion
- [ ] **Percolate**

## Week 2: Stack & Queue

- [x] Stack
- [x] Queue
- [ ] Ring Buffer
- [x] Bag:LinkedList
- [x] Bag: ResizingArray
- [ ] Queue_Resizing array
- [ ] **Randomized Queue**
- [ ] **Dequeue**
- [ ] Dijkstra

## Week 3: Sort

- [x] InsertionSort
- [x] SelectionSort
- [x] Shellsort
- [x] Mergesort: TopDown
- [ ] Mergesort: improvement
- [x] Mergesort: Bottomup
- [ ] **Collinear Points**
- [x] QuickSort
- [ ] QuickSelect
- [ ] 3-Way Quicksort 
- [x] Priority Queue
- [ ] **8 Puzzle**
- [x] Binaryheap
- [x] Heapsort
- [ ] [Option] Event-driven simulation
- [ ] Binomial Heap

### Appendix: Non-Comparison Sort

- [ ] Bucket Sort
- [ ] Counting Sort
- [ ] Radix Sort
- [ ] Intro Sort

## Week 4: Search: Table & Tree

- [ ] Sequential Search: Unordered 
- [ ] Binary Search: Ordered
- [x] Binary Search Tree
- [ ] [Option] 2-3 Tree
- [ ] Red-Black BSTs: A Derivative of 2-3 Tree
- [ ] [Option] B-Trees: Another Derivative of 2-3 Tree
- [ ] AVL Tree
- [ ] 1d Range Search
- [ ] Line Segment intersection
- [ ] **Kd Tree: Computer Graphics**
- [ ] Interval Search Trees
- [ ] Segment Trees
- [ ] Hash Table:Seperate Chainning
- [ ] Hash Table: Linear Probing
- [ ] Hash Table: Rehashing

### Application

- [ ] Exception Filter: WhiteList & BlackList
- [ ] Dictionary LookUp
- [ ] File Indexing
- [ ] Sparse Vectors

## Week 5: Graph & Search

- [x] Graph API
- [ ] Depth-First Search
- [ ] Breadth-First Search


# Lecture 1: Union-Find

>The implementation of algo is [here](https://github.com/PeterWrighten/Peter_CS/tree/main/Algorithms/).

Union Find could be modelized as a dynamic connectivity problem.

**Model Union Find**

- public class Union Find
- union(p, q): connect p and q
- find(p, q): find whether p-q is connected.

**Idea**

- Reflexive: p is connected to p.
- Symmetric: if p-q is connected, also q-p.
- Transmitive: if p-q, q-r, thus p-r.

- connected components.

## Quick Find

Connected node i's ```id[i]``` are all equal.

```java
 public boolean find(int p, int q){
	 return id[p] == id[q];
 }
```

|algo|init|union|find|
|:--:|--:|--:|--:|
|quick find| N  | N  | 1  |



## Quick Union

**Interpreter**

- ```id[i]``` is i's parent.
- root of i is ```id[id[...id[i]...]]```

```union(p,q) => id[root(p)] = root(q);```

## Quick Union+

**Weighten quick union**

It could avoid the worst case.

use ```sz[i]``` in union.

```O() < lgN```

**Paths compression**

use ```id[i] = id[id[i]]``` in ```root()```.

```O() < N + MlgN```<- Proved by Tjan, and I would discuss about it in my blog later.

|algo|init|union|find|
|:--:|--:|--:|--:|
|quick union(worst)| N  | N  | N  |
|quick union+ |  N | N+MlgN  | N+MlgN  |

# Lecture 2: The Analysis of Algorithms

**Reasons to analyze algorithms**

1. Predict performance.
2. Compare algorithms.
3. Provide guarantees.
4. Understand theoretical basis.

**Scientific Method**

1. Observe some feature of the nature world.
2. Hypothesize a model that is consistent with the observation.
3. Predict events using the hypothesis.
4. Verify the predictions by making further observations.
5. Validate by repeating until the hypothesis and observations.

**Observation**

```java
Stopwatch();//Princeton STL
```

**Mathematic Model**

$$RunningTime = Frequency \times Cost$$


> Simplifying the calculations

* Cost Model
Use some basic operation as a proxy for running time.

* Tilde Notation
Estimate running time (or memory) as a function of input size N.

Ignore lower order terms.
- when N is large, terms are negligible.
- when N is small, we don't care.

Estimate as Discrete Math Model:

$$\sum_N i = \int_0^N xdx = \sim N^2$$
$$\sum_N\sum_N\sum_N i= \int_0^N (\int_0^z (\int_0^yxdx)dy)dz = \sim N^4$$

**Order-of-growth**

The small set of functions:

$1, \log N, N, NlogN, N^2, N^3,$ and $2^N$

suffices to describe ordered-of-growth of typical algorithms.

![1636101405640](/assets/1636101405640.jpg)

* Common order-of-growth classifications

|Order of Growth|Name|Typical code framework|description|example|
|:--:|:--:|--:|--:|--:|
|1   |  Constant |  ```a += b``` | statement  | add two numbers  |
|$\log N$   | Logarithmic  | ```while(N > 1){N = N / 2;...}```  |  divide in half | BinarySearch  |
| N  |  Linear | ```for(i = 0; i < N){...;}```  | loop  | find max/min   |
|$N\log N$   |  Linearithmic |  mergesort | divide and conquer  |  mergesort |
|$N^2$   | Quadratic  | double loop  |  double loop | check all pairs  |
|$N^3$   | Cubic  |  triple loop | triple loop  |  check all triples |
|$2^N$   | exponential  | combinatorial search  | exhaustive search  |  check all subsets |


**Theory of Algorithms**

|Upper Bound(Big Oh)|
|:--:|
|**Optimal Algo(Tilde Notation, Big theta)**   |
|**Lower Bound(Big Omega)**   |

**Memory**

> Typical memory usage for objects in Java

* Object overhead. 16 bytes
* Reference. 8 bytes
* Padding. Each object uses a multiple of 8 bytes.

> Typical Memory usage summary

>Total memory usage for a data type value:

* Primitive type: 4 bytes for int, 8 bytes for double,...
* Object reference: 8 bytes.
* Array: 24 bytes + memory for each array entry
* Object: 16 bytes + memory for each instance variable + 8 bytes if inner class(for pointer to enclosing class)
* Padding: round up to multiple of 8 bytes.

>Shallow memory usage: Don't count referenced objects.

>Deep memory usage: If array entry or instance variable is a reference, add memory(recursively) for referenced object.


# Lecture 3: Stacks and Queues

## Stack
- ```push()```: Tail is NULL

### Implementation

>Resizing Array --> Space Efficiency

>Linked-List --> Time Efficiency

- Resizing Array

>Resize stragedy:
1. When N == s.length, double;
2. When N == s.length/4, half;
3. s.length / 4 < N < s.length; 

* Point: 

1. push()
```java
public void push(T item){
	if(N == s.length){
		resize(2 * s.length);
	}
	s[N++] = item;
}
```

2. pop()

```java
public String pop(){
	String item = s[--N];
	s[N] = null;
	if( N > 0 && N < s.length/4){
		resize(s.length / 2);
	}
	return item;

}
```

3. resize()

```java
public void resize(int cap){
	String[] copy = new String[cap];
	for(int i = 0; i < s.length; i++){
		copy[i] = s[i];
	}
	s = copy;
}
```


- Linked List

* Point:

1. push(item): 

```java
public void push(T item){
	Node oldtop = top;
	top.item = item;
	top.next = oldtop;

}

```
2. pop()

```java
public void pop(){
	top = top.next;
}

```

## Queue

**Idea:**

1. 2 Nodes: first & last
2. if(IsEmpty()): (At least one node left)

* Enqueue(): first = last;
* Dequeue(): last = first;



## JAVA's Generic

Sort of similar with C++'s Template.

E: Element in Set
T: Class

```java

public class Demo{
	public static <E> void print(E[] array){
		for( E element : array){
			System.out.println("%s", element);
		}

	}

	punlic static void main(String[] args){
		Integer[] intArray = {1, 2, 3};
		Double[] doubleArray = {1.1, 2.2, 3.4};
		//
	   
	}
		
	
}


```

**Good Code has Zero Cast.**

> Primitives all have Wrapper Type.
**i.e.:** int has a wrapper type called Integer

>AutoBoxing: Automatic cast between primitives and wrappers

>Syntactic Sugar: Behind-the-scenes casting

## Java's API

```java
import java.util.List;
import java.util.ArrayList;//resizing array
import java.util.LinkedList;//linked list
import java.util.Stack;
import java.util.Queue;
```

Main Application: Adding items to a collection and iterating.

```java
public class Bag<item> implements Iterable<item>{
	Bag();
	void add(item x);
	int size();
	Iterable<item>  iterator();
}
```

**Dijkstra's Two Stack Algorithms**

1. Left Parenthesis: Ignore
2. Right Parenthesis: Operate
3. Value: push into value stack
4. Operator: push into operator stack


**Syntax Memo**

```java
s[N++] = 10;

//equal to

s[N] = 10;
N += 1;

/****************/

s[++N] = 10;

//equal to

N += 1;
s[N] = 10;
```

# Lecture 4: Sort

## Element Sort

**Two useful abstractions**

- Helper functions: Refer to data through compares and exchanges.
- Less: Is item v less than w?
- Exchange: Swap item in array a[] at index i with the one at index j.

**compareTo()**

- Totality
- Transitivity
- Antisymmetry

**Selection Sort**

- In iteration i, Find index *min* of smallest remaining entry.
- swap a[min] and a[i].
- O(n^2)
- Defect: It's a waste of time for partially-sorted array.

**Insertion Sort**

- In iteration i, swap a[i] with each larger entry to its left.
- Partially-sorted array: O(N)--> (Because N(inv) < cN;  N(Exchange) = N(inv), N(inv) < N(Compare) < N(inv) + N - 1)
- Random array: O(N^2)

**Shell Sort(Insertion sort)**

- h-sort: First, define increment; Second, insertionsort every h increments.

```java
while( h > 0 )//change increment
{
	for( int i = h; i < size; i++)
	{
		for( int j = i; j >= h; j -= h)
		{
			if(a[j] > a[j - h])
			{
				swap(j, j - h);
			}
		}
		
	}
	h = h / 3;
}

```

>Why insertion sort?

- Big increments => small subarray
- Small increments => nearly in order

> Which increment sequence to use?

**Problem**

1. Why increment h = 3h + 1 ?
2. Why O(N^3/2) ?


**Shuffling**

- In iteration i, pick integer *r* between 0 and i uniformly at random, swap a[i] and a[r].

**Convex Hull**

- Graham Scan

## MergeSort

**Divide and Conquer**

1. Recurrence(Extra Space)

- Divide array into two halves.
- Recursively sort each half.
- Merge two halves.

2. Bottom-up

- Pass through array, merging subarrays of size 1.
- Repeat for subarrays of size 2, 4, 8...


## Quicksort

**Basic Plan**

- Shuffle the array
- Partition so that, for some j
  1. Entry a[j] is in place.
  2. No larger entry to the left of j
  3. No smaller entry to the right of j
- Sort each piece recursively

**Partition**

>Repeat until i and j pointers cross

- Scan i from left to right so long as (a[i] < a[lo]).
- Scan j from right to left so long as (a[j] > a[lo]).
- Exchange a[i] with a[j].

>When pointers cross

- Exchange a[lo] with a[j].

**Dijkstra 3-Way Quicksort**



### Java's sort

- Tuned QuickSort for Primitives, Tuned MergeSort for objects.

```java
import java.util.Arrays;

Arrays.sort(a);

```


### JAVA Syntax

> Implement "swap" func in JAVA

1. Definite out of  Method(in the class)
2. Definite in obj(```int[], String[]```)

# Lecture 5: Priority queue

>Collection: 

Insert and delete items.
  
>Delete:

- Stack: Remove the item most recently added
- Queue: Remove the item least recently added
- Randomized Queue: Remove a random item
- Priority queue: Remove the largest(or Samllest) item

>Priority Queue

- Unordered: Insert: O(1), Delmax: O(N), Max: O(N)
- Ordered: 	Insert: O(N), Delmax: O(1), Max: O(1)
  
## Binary Heap

- Binary Tree & Parents >(<) Children

**Basic Plan**

- Swim(int children)
- Sink(int Parent)

## Non Comparison Sort

- Radix Sort
- Counting Sort
- Bucket Sort

### Radix Sort

### Counting Sort

### Bucket Sort

# Lecture 6: Search & Symbol Table

**Symbol Table**

Key-value pair abstraction.

- Insert a value with specified key.
- Given a key, search for the corresponding value.

**Convention**

- Values are not null.
- Method ```get()``` returns ```null``` if key not present.
- Method ```put()``` overwrites old value with new value.

**Intended Consequences**

- Easy to implement ```contains()```
- Can implement lazy version of ```delete()```.

- Equal (x.equal(y)(PS: Non-Null)) for objects

## Elementary Table

> Only 1 to 1

- Associative array Abstractions


> Sequential search in a linked list

**Symbol Table** <-- Also Known as key-value pair abstraction.

In computer science, a symbol table is a data structure used by a language translator such as a compiler or interpreter, where each identifier(or symbol) in a program's source code is associated with information relating to its declaration or appearance in the source. In other words, the entries of a symbol table store the information related to the entry's corresponding symbol.

## Binary Search Trees




## 2-3 Tree and Red-Black Tree (The Derivative of 2-3 Tree)[Weak Balance]

In there, I just wanna talk about Red Black Tree.

**Basic Idea**

- Rotate left: Right child Red.
- Rotate Right: Left child & left-left grandchild Red.
- Flip Red: Both sides of children Red.

**Problem**

  Red Black Tree and 2-3 Tree only support **insert and search** functions which could guarantee the balance. The deletion machanism is implemented by **Hibbard deletion**, which tends to make balance crash.

## AVL Tree [Rough Balance]

- Evaluate Tree's Balance.

> Recursive Definition

N.Height equals: 

1. if N is a leaf: 

```1 + max(N.left.Height, N.right.Height)```

```cpp

class Node{
	int data;
	Node* parent;
	Node* left;
	Node* right;
	int Height;
}

```

**AVL Property**

AVL trees maintain the following property:

For all nodes N, 

```|N.left.Height - N.right.Height| <= 1```

**Implementation**

```cpp
AVLInsert(k, R) {
	insert(k, R);
		
	rebalance(R);

}
```

## Geometric Application of BST

**1d Range Search**

>Unordered Array: 

Range Count & Search: O(N) <-- Sequential Search

> Ordered Array:

Range Count & Search: O(logN) <-- Binary Search for ```lo``` & ```hi```.



### Line Segment Intersection

> Sweep-Line Analysis 

**Sweep vertical line from left to right.**

- x-Coordinates define events.
- h-segment(left endpoint): insert y-coordinate into BST.
- h-segment(right endpoint): remove y-coordinate from BST.
- v-segment: range search for interval of y-endpoints.


### Kd Tree: Video Game

> Space partitioning trees

- Partitioning Nodes by direction of Segments(Vertical or Horizonal).

### Interval Search Trees

**Basic Idea**

- Left Endpoint is Key.


### Rectangle Intersection Search: Microprocessor Design




## Hash Table

Hash Table is other type of Symbol Table implementation which is distinct with BSTs.

### Uniform Hash Assumptions

Each key is equally likely to hash to an integer between 0 and M-1.

### Hash Functions 

**JAVA Implementation: ```hash()``` & ```hashCode()```**

1. "31x + y" Rule

### Hash Collision

#### Seperate Chainning

#### Linear Probing

##### Rehashing



> Hash Table & BSTs API in JAVA

1. Hash Table: ```java.util.HashMap```, ```java.util.IdentityHashMap```
2. Red-Black Tree: ```java.util.TreeMap```, ```java.util.TreeSet```


# Lecture 7: Graph & Search

**Some Graph-Processing Problems**

- Path. Is there a path between ```s``` and ```t``` ?
- Shortest path. What is the shortest path between ```s``` and ```t``` ?
- Cycle. Is there a cycle in the graph ?
- Euler tour. Is there a cycle that uses each edge exactly once ?
- Hamilton tour. Is there a cycle that uses each vertex exactly once?
- Connectivity. Is there a way to connect all of the vertices ?
- MST. What is the best way to connect all of the vertices ?
- Biconnectivity. Is there a vertex whose removal disconnects the graph ?
- Planarity. Can you draw the graph in the plane with no crossing edges ?
- Graph isomorphism. Do two adjacency lists represent the same graph ?

## Graph API

```java
public class Graph {
	Graph(int V); // Create an empty graph with V vertices. 

	Graph(In in); // Create a graph from input stream 

	void addEdge(int v, int w); // add an edge v-w
	
	Iterable<Integer> adj(int v); // vertices adjacent to v 

	int V(); // number of vertices.

	int E(); // number of edges.

	String toString(); // String representation.	

	public static void main(String[] args) {
		In in = new In(args[0]);
		Graph G = new Graph(in);

		for(int v = 0; v < G.V(); v++) {
			for(int w: G.adj(v)) {
				StdOut.println(v + "-" + w):
			}
		}
	}

}
```

## Graph-Processing Algorithms 

- **Design Pattern For Graph Processing**

Decouple graph data type from graph processing. 

- Create a Graph object.
- Pass the Graph to a graph-processing routine.
- Query the graph-processing routine for information.

> API: Paths

```java
public class Paths {
	Paths(Graph G, int s);
	boolean hasPathTo(int v);
	Iterable<Integer> pathTo(int v);
}

```


### Depth-First Search(Put unvisited vertices on a stack)

- Goal: Systematically search through a graph.
- Idea: Mimic Maze Exploration.

```
DFS(to visit a vertex v)
----------------------------
Marked v as visited.

Recursively visit all unmarked vertices w adjacent to v.
```

- Typical application: 

Find all vertices connected to a given source vertex;

Find a path between two vertices.

### Breadth-First Search(Put unvisited vertices on a queue)

- Shortest path(Bellman-Ford): Find path from s to t that uses fewest number of edges.


```
BFS(From source vertex s)
------------------------------
Put s onto a FIFO queue, and mark s as visited;

Repeat until the queue is empty:
 - remove the least recently added vertex v;
 - add each of v's unvisited neighbors to the queue, and mark them as visited.
```

> **JAVA Syntax Memo**
> -> About Iterable<T> & Iterator<T>

```java
public interface Iterable<T> {
	Iterator<T> iterator();
}

public interface Iterator<T> {
	boolean hasNext();
	T next();
	void remove(); // Generally ignored
}
```

Interface like this is convenient to definite ReversedIterator & Iterator in sequential data structures.

**Summary**

- In Java Containers, all Subclass of Collection would use ```Iteratable``` interface to implement ```for each``` functions.

![picture 1](../images/123f02da696f17a016a6e4d6df8f7c96edf488d3b87dbff3f5a1737ca102daa6.png)  


```java

public class demo<T> implements Iterable<T> {
	//...
	@Override
	public Iterator<T> itreator() {
		return new demoIterator();
	}

	private class demoIterator implements Iterator<T> {
	
		private int current = 0; 

		@Override
		public boolean hasNext() {
			return current != 0;
		}

		@Override 
		public T next() {
			return demo[current++];
		}


	}

}
```

- Generic Array: When you wanna initialize a generic array, you should use mandatory casting like that:

```java
Bag<Integer>[] adj = (Bag<Integer>[]) new Object[V];
//Unchecked type casting; Not safe 
```

