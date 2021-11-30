#include<algorithm>
#include<string>
#include<iostream>
#include<vector>
using namespace std;

class Mergesort
{
public:
    void merge(vector<int>& nums, vector<int>& result, int lo, int mid, int hi)
    {
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++)
        {
            if(i > mid)  result[k] = nums[j++];
            else if(j > hi)  result[k] = nums[i++];
            else if(nums[i] < nums[j])  result[k] = nums[i++];
            else    result[k] = nums[j++];
        }

    }

    void sort(vector<int>& nums, vector<int>& result, int lo, int hi)
    {
        if(lo >= hi)    return;
        int mid = lo + (hi - lo) / 2;
        sort(result, nums, lo, mid);
        sort(result, nums, mid + 1, hi);
        merge(nums, result, lo, mid, hi);//enchange sequence!!
    }

};

int main()
{
    vector<int> nums;
    while(1)
    {
        string tmp;
        cout<<"Input number: "<<endl;
        cin>>tmp;
        if(!tmp.compare("quit"))    break;
        nums.push_back(stoi(tmp));
    }

    cout<<"-----------------------------------"<<endl;
    Mergesort m;
    vector<int> result(nums.size());
    m.sort(nums, result, 0, nums.size() - 1);
    for(auto itr = result.begin(); itr != result.end(); itr++)
    {
        cout<< *itr<<endl;
    }
}