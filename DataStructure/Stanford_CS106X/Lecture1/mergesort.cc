#include<algorithm>
#include<string>
#include<iostream>
#include<vector>
using namespace std;

class Mergesort
{
public:
    void merge(int nums[], int lo, int mid, int hi)
    {
        int i = lo;
        int j = mid + 1;
        int len = hi - lo + 1;
        int k = 0;
        int *result = new int[len];
        for(k = 0; k < len; k++)
        {
            if(i > mid)  result[k] = nums[j++];
            else if(j > hi)  result[k] = nums[i++];
            else if(nums[i] < nums[j])  result[k] = nums[i++];
            else    result[k] = nums[j++];
        }
        for(i = lo, k = 0; i <= hi; i++, k++)
        {
            nums[i] = result[k];
        }
        delete []result;

    }

    void sort(int nums[], int lo, int hi)
    {
        if(lo >= hi)    return;
        int mid = lo + (hi - lo) / 2;
        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);//enchange sequence!!
    }

};

int main()
{
    int *nums;
    int n;
    int tmp;
    cout<<"How many Numbers would you wanna sort? "<<endl;
    cin>> n;
    nums = new int[n];

    for(int i = 0; i < n; i++)
    {
        cout<<"Input number: "<<endl;
        cin>> tmp;
        nums[i] = tmp;
    }

    cout<<"-----------------------------------"<<endl;
    Mergesort m;
    m.sort(nums, 0, n - 1);
    for(int i = 0; i < n; i++)
    {
        cout<< nums[i] <<endl;
    }
}