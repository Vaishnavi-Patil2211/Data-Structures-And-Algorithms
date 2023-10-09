#include<stdio.h>
#include<math.h>
int Reverse(int num, int l){
	if(l==1)
		return num;
	else
		return ((num%10)*pow(10,l-1))+Reverse(num/10,--l);
}
void main(){
	int num,length=0,temp;
	printf("Enter the Numeber: ");
	scanf("%d",&num);
	temp=num;
	while(temp!=0){
		length++;
		temp/=10;
	}
	printf("Reversed of Number = %d",Reverse(num,length));
}