#include<stdio.h>
void main(){
	int n,num[100],i,j,temp,min,loc;
	printf("How Many Data You Will Insert: ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter a Number: ");
		scanf("%d",&num[i]);
	}
	for(i=0;i<n;i++){
		min=num[i];
		loc=i;
		for(j=i+1;j<n;j++){
			if(num[j]<min){
				min=num[j];
				loc=j;
			}
		}
		temp=num[i];
		num[i]=num[loc];
		num[loc]=temp;
	}
	printf("Sorted Data: \n");
	for(i=0;i<n;i++){
		printf("%d\t",num[i]);
	}
	
}