# C++ STL Study

## Iterator

```cpp
#include<vector>
#include<iostream>
using namespace std;

int main(){
    vector<int> data(10);
    for(vector<int>::iterator it = data.begin(); it != data.end(); it++){
        cout<< *it <<endl;
    }
}
```

In C++ 11, it could be rewrited as:

```cpp
int main(){
    vector<int> data(10);
    for(auto it : data){
        cout<< it <<endl;
    }
}
```

