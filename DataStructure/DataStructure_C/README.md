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



## Part 2: C Syntax

### Macro(#define)

```c
#define SIZE 100
double data[SIZE];

//if you wanna implement bool in C
// 1. #include<stdbool.h>
// 2. #define bool _Bool
//    #define true 1
//    #define false 0
// 3. typedef enum{
//      true = 1, false = 0;
//    }bool;
```

### I/O About String

> 2 Functions which could output String on display.

- ```puts()```: only output string & linefeed automatically.
- ```printf()```: all output & could not linefeed.

```c
#include<stdio.h>
int main(){
    char str[] = "http";
    printf("%s\n", str);
    puts(str);
    puts("http");

}
```

> Also 2 Functions which could input Strings on display

- ```scanf()```: Divided by Space(Space is symbol). Couldn't input Space.
- ```gets()```: Only when Cargo enter could input stop.

```c
#include<stdio.h>
int main(){
    char str1[30] = {0};
    char str2[30] = {0};
    printf("Input a String: ");
    gets(str1);
    printf("Input String: ");
    scanf("%s", str2); //str2 is a address, so no need for '&'.
}
```

**In scanf("%s", str), only when str is not an address, it is necessary to add '&'.**

*fgets(buffer, buffersize, \*fstream)*

This syntax is safer than *gets()*.

*fflush(\*fstream)*, *\*fstream* is such as *stdin* or *stdout*.