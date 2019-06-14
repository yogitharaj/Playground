#include <stdio.h>
int main() 
{
  int n,r,s=0,temp;
    scanf("%d%d%d",&n);
  temp=n;
    while(n>0)
    {
      r=n%10;
      s=s+(r*r*r);
      n=n/10;
      }
  if(temp==s)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}