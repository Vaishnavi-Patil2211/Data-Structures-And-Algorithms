#include<stdio.h>
int sum(int n){
	if(n==1)
		return 1;
	else
		return n+sum(n-1);
}
void main(){
	int n;
	printf("Enter How Many Term of Sum You Want: ");
	scanf("%d",&n);
	printf("Sum from 1 to %d is %d.",n,sum(n));
}