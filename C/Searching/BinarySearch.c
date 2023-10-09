#include<stdio.h>
void main(){
	int n,num[50],i,data,beg,mid,end;
	printf("How many Data You Want to Insert: ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter a Number: ");
		scanf("%d",&num[i]);
	}
	printf("Enter a Search Number: ");
	scanf("%d",&data);
	beg=0;
	end= n-1;
	mid=(beg+end)/2;
	while(beg<=end && num[mid]!=data){
		if(data<num[mid])
			end=mid-1;
		else
			beg=mid+1;
		mid=(beg+end)/2;
	}
	if(num[mid]!=data)
		printf("Search is Unsuccessful");
	else
		printf("Search is Successful at Location = %d",mid);
}