#include<stdio.h>
int fib(int n){
	if(n==1)
		return 0;
	else if(n==2)
		return 1;
	else
		return fib(n-1)+fib(n-2);
}
void main(){
	int num;
	printf("Which Term Fibonacci Number You Want: ");
	scanf("%d",&num);
	printf("Fibonacci Number = %d",fib(num));
}