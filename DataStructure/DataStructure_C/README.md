# Data Structure C

This Course is almost based on [The Algorithm Design Manual](https://www3.cs.stonybrook.edu/~skiena/373/videos/).


# Note

## Part 1: Dictionary/Dynamic Set Operation

Perhaps the most important class of data structures maintain a set of items, indexed by keys.

- Search(S,k) - A query that, given a set S and a key k, returns a pointer x to an element in S such that key[x] = k, or nil if no such element belong to S.

- Insert(S,x) - A modifying operation that augments the set S with the element x.

- Delete(S, x) - Given a pointer x to an element in the set S, remove x from S. Observe we are given a pointer to an elemnt x, not a key.

- Min(S), Max(S) - Returns the element of the totally ordered set S which has the smallest(largest) key.

- Logical Predecessor(S, x), Successor(S, x) - Given an element x whose key is from a totally ordered set S, returns the next smallest (largest) element in S, or NIL if x is the maximum(minimum) element.

1. Binary Tree
