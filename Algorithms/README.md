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
