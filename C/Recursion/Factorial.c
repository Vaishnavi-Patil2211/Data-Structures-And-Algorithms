#include<stdio.h>
int fact(int n){
	if(n==1|| n==0)
		return 1;
	else
		return n*fact(n-1);
}
void main(){
	int num;
	printf("Enter the Number for Factorial: ");
	scanf("%d",&num);
	printf("Factorial = %d",fact(num));
}