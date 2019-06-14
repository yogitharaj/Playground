#include<stdio.h>
int main()
{
  int num,fd,ld,c;
  scanf("%d",&num);
  fd=num/100;
  ld=num%10;
  
  c=fd+ld;
  printf("%d",c);
  
 
}