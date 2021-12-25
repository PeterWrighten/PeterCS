# Data Structure C

Note about C syntax.

## C Syntax

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