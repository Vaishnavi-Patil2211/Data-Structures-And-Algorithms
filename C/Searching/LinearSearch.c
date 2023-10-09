#include<stdio.h>
void main(){
	int n,num[50],i,loc=-1,data;
	printf("How many Data You Want to Insert: ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter a Number: ");
		scanf("%d",&num[i]);
	}
	printf("Enter a Search Number: ");
	scanf("%d",&data);
	i=0;
	while(loc==-1 && i<=n-1){
		if(num[i]==data)
			loc=i;
		i++;
	}
	if(loc==-1)
		printf("Search is Unsuccessful");
	else
		printf("Search is Successful at Location = %d",loc);
}