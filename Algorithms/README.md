# Algorithms Powered By Princeton

**[Standard Lib](https://introcs.cs.princeton.edu/java/stdlib/)**

# Lecture 1: Union-Find

>The implementation of algo is [here](https://github.com/PeterWrighten/Peter_CS/tree/main/Algorithms/week1).

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

**Stack**
- ```push()```: Tail is NULL

**Implementation**

- Resizing Array

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

**JAVA's Generic**

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

**Iterator**



**Data Structure: Bag**

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