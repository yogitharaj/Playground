#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 int main(void) 
 {
    int num, sum=0, firstDigit, lastDigit;
    scanf("%d", &num);
    lastDigit = num % 10;
    firstDigit = num;
    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;
  sum = firstDigit + lastDigit;
   printf("%d", sum);
    return 0;
}