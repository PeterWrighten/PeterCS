#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
using namespace std;
class Quicksort
{
public:
    int partition(vector<int>& nums, int lo, int hi)
    {
        int i = lo;
        int j = hi + 1;
        while(1)
        {      
            while(nums[lo] > nums[++i])
                if(i == hi)     break;
            while(nums[lo] < nums[--j])
                if(j == lo)     break;
            
            if( i >= j )    break;
            swap(nums[i], nums[j]);

        }
        swap(nums[lo], nums[j]);
        return j;
        
    }
    void sort(vector<int>& nums, int lo, int hi)
    {
        if(lo >= hi)    return;
        int mid = partition(nums, lo, hi);
        sort(nums, lo, mid - 1);
        sort(nums, mid + 1, hi);
    }

    
};

int main()
{
    vector<int> nums;
    Quicksort q;
    while(1)
    {
        string tmp;
        cout<<"Input number: "<<endl;
        cin>>tmp;
        if(!tmp.compare("quit"))   break;
        nums.push_back(stoi(tmp));
    }
    cout<<"---------------------------------"<<endl;
    q.sort(nums, 0, nums.size() - 1);
    for(auto itr = nums.begin(); itr != nums.end(); itr++)
    {
        cout<< *itr <<endl;
    }
}