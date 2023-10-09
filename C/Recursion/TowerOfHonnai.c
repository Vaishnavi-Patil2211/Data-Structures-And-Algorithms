#include<stdio.h>
//int a=0;
void TOH(int n, char BEG[3], char AUX[3],char END[3]){
	if(n>0){
		TOH(n-1,BEG,END,AUX);
		printf("Move From %s to %s.\n",BEG,END);
		TOH(n-1,AUX,BEG,END);
//		a++;
	}
}
void main(){
	int n;
	printf("Enter the Number of Disk: ");
	scanf("%d",&n);
	TOH(n,"BEG","AUX","END");
//	printf("Total Setps = %d\n",a);
}