#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c,d,e,f;
  cin>>n;
  cin>>a>>b>>c>>d;
  switch(n)
  {
    case 1:
      e=a+c;
      f=b+d;
      cout<<e<<f<<"i";
      break;
    case 2:
      e=a-c;
      f=b-d;
      cout<<e<<"+"<<f<<"i";
      break;
    case 3:
      e=a * c - b * d;
   	  f = a * d + b * c;
      cout<<e<<f<<"i";
      break;
    default:
      cout<<"Invalid choice";
  }
}