//Implemening the Linear Queue in C
#include<stdio.h>
void enqueue();
void dequeue();
void display();
int queue[5],front=-1,rear=-1,max=5;
void main(){
	top:
	printf("\n***Option***\n1.Insert Data in Queue\n2.Remove Data From Queue\n3.Display Data of Queue\n\nSelect Your Option(1,2,3): ");
	int n;
	scanf("%d",&n);
	switch(n){
		case 1:
			enqueue();
			goto top;
		case 2:
			dequeue();
			goto top;
		case 3:
			display();
			goto top;
		default:
			break;
	}
}
void enqueue(){
	if(rear==(max-1))
		printf("OVERFLOW");
	else {
		if(rear==-1)
			rear=front=0;
		else
			rear++;
		printf("Enter a Data: ");
		scanf("%d",&queue[rear]);
		printf("%d is Inserted in Queue",queue[rear]);
	}
}
void dequeue(){
	if(rear==-1)
		printf("UNDERFLOW");
	else{
		printf("%d Deleted from Queue.",queue[front]);
		if(front==rear)
			front=rear=-1;
		else 			
			front++;
	}
}
void display(){
	if(rear==-1)
		printf("Queue is Empty.");
	else{
	int i;
	printf("Data on Queue: ");
	for(i=front;i<=rear;i++)
		printf("%d\t",queue[i]);
	}
}