#include<iostream>
#include<cmath>
using namespace std;

int main(){
	string s1 = "Mar";
	s1 += "ty";
	s1.append(" Stepp");
	s1.erase(3, 2);
	s1[3] = 'o';
	cout << s1<<endl;
}
