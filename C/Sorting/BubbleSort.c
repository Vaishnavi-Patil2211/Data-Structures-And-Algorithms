#include<stdio.h>
void main(){
    int n,num[100],i,j,temp;
    printf("How Many Number You Want to Insert: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
    	printf("Enter a Number: ");
    	scanf("%d",&num[i]);
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(num[j]>num[j+1]){
				temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}
		}		
	}
	printf("Sorted Data: \n");
	for(i=0;i<n;i++){
		printf("%d\t",num[i]);
	}
}