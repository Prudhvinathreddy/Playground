#include<iostream>
using namespace std;
void ss(int n,int *a)
{
  int c=0,c1=1;
  std::cout<<c1<<"\n";
  for(int i=1;i<n;i++)
  {
    if(a[i-1]<=a[i])
    {
      c+=2;
      std::cout<<c<<"\n";
    }
    else
      std::cout<<c1<<"\n";
  }
}

  
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    std::cin>>arr[i];
  ss(n,arr);
  
}
