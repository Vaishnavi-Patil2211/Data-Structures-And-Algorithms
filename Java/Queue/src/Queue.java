import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        int choice,x;
        Queue q =new Queue();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enqueue");
            System.out.println("dequeue");
            System.out.println("display");
            System.out.println("exit");
            System.out.println("enter your choice");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the element to be enqueue");
                    x=sc.nextInt();
                    q.enqueue(x);
                    break;
            }
        }

    }
    int max=10;
    int front=-1;
    int rare=-1;
    int[] arr=new int[max];


    void enqueue (int x){
        if(rare==max-1){
            System.out.println("queue is full");
            return;
        }
        if(front== -1){
            front=0;

        }
        rare++;
        arr[rare]=x;
    }


    int dequeue(){
        if(front== -1){
            System.out.println("Queue is empty");
            return -1;

        }
        int x=arr[front];
        front++;
        if(front>rare){
            front=rare=-1;
        }
        return x;
    }
    int front(){
        if(front== -1){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    void display(){
        if(front == -1){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<rare;i++){
            System.out.println(arr[i] + " ");
        }
    }
}


















