#include<iostream>
using namespace std;
int main()
{
  int n,s;
  std::cin>>n>>s;
  int arr[n],temp=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
    temp+=arr[i];
  }
  if(temp>s)
    std::cout<<"NO";
  else
    std::cout<<"YES";
}