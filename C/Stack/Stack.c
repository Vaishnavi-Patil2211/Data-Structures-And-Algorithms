// Implementing the Stack Operation in C
#include<stdio.h>
void push();
void pop();
void display();
int stack[3],max=3,tos=-1;
void main(){
	top:
	printf("\n\n***Option***\n1. PUSH Data onto Stack\n2. POP Data from Stack\n3. Display the Data of Stack\n\nEnter Your Option(1,2,3): ");
	int n;
	scanf("%d",&n);
	switch(n){
		case 1:
			push();
			goto top;
		case 2: 
			pop();
			goto top;
		case 3:
			display();
			goto top;
		default:
			break;
	}
}
void push(){
	if(tos==(max-1))
		printf("OVERFLOW");
	else{
		tos++;
		printf("Enter the Number: ");
		scanf("%d",&stack[tos]);
		printf("%d is PUSH to Stack.",stack[tos]);	
	}		
}
void pop(){
	if(tos==-1)
		printf("UNDERFLOW");
	else{
		printf("%d is POP from Stack.",stack[tos]);
		tos--;
	}
}
void display(){
	if(tos==-1)
		printf("Stack is Empty.");
	else{
	int i;
	printf("Data on Stack: ");
	for(i=0;i<=tos;i++)
		printf("\t%d",stack[i]);
	}	
}
