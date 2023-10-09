#include<stdio.h>
void main(){
	int num[100],n,ptr,i,j,temp;
	printf("How Many Data You Will Insert: ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter a Number: ");
		scanf("%d",&num[i]);
	}
	for(i=0;i<n;i++){
		temp=num[i];
		ptr=i-1;
		while(temp<num[ptr]&&ptr>=0){
			num[ptr+1]=num[ptr];
			ptr--;
		}
		num[ptr+1]=temp;
	}
		printf("Sorted Data: \n");
	for(i=0;i<n;i++){
		printf("%d\t",num[i]);
	}
}