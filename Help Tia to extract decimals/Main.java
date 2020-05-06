#include<iostream>
#include<string>
int main() 
{
  std::string fnum;
  int flag=0;
  std::cin>>fnum;
  std::cout<<"Floating part is : ";
  for(int i=0;i<fnum.length();i++)
  {
    if(flag==1)
      std::cout<<fnum.at(i);
    else
    {
      if(fnum.at(i)=='.')
        flag=1;
    }
  }

}