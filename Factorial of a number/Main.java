#include <stdio.h>
int main() 
{
  int n,fact=1,c,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
    fact=fact*i;
  printf("%d",fact);
	return 0;
}