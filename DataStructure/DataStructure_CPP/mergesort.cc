#include<algorithm>
#include<string>
#include<iostream>
#include<vector>
using namespace std;

class Mergesort
{
public:
    void merge(vector<int>& nums, int lo, int mid, int hi)
    {
        int i = lo;
        int j = mid + 1;
        int len = hi - lo + 1;
        int k = 0;
        vector<int> result(len);
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
        vector<int>().swap(result);

    }

    void sort(vector<int>& nums, int lo, int hi)
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
    m.sort(nums, 0, nums.size() - 1);
    for(auto itr = nums.begin(); itr != nums.end(); itr++)
    {
        cout<< *itr<<endl;
    }
}