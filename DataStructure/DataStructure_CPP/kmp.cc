#include<vector>
#include<string>
#include<iostream>
using namespace std;


        void GetNext(string pat, vector<int>& next) {
            int cur = 0, rep = - 1;
            next[0] = -1;
            while(cur < pat.length()) {
                if(rep == -1 || pat[cur] == pat[rep]) {
                    next[++cur] = ++rep;
                } else {
                    rep = next[rep];
                }
            }
        }
   
        int kmp(string pat, string txt) {
            vector<int> next(pat.length(), 0);
            GetNext(pat, next);
            int num = 0, pos = 0;
            while(num < pat.length() && pos < txt.length()) {
                if(num == -1 || pat[num] == txt[pos]) {
                    num++;
                    pos++;
                } else {
                    num = next[num];
                }
            }

            if(num == pat.length()) {
                return pos - num;
            }
            return -1;
        }


int main(void) {
    string txt = "aabaabcd";
    string pat = "cd";
    int pos = kmp(pat, txt);
    if(pos == -1) {
        cout<< "Not Found" << endl;
    } else {
        cout<< "Found in " << pos << endl;
    }
    return 0;
}