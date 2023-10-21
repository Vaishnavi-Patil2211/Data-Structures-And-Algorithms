#include <stdio.h>

#define MAX 5

int queue[MAX];
int front = -1, rear = -1;

void enqueue(int data) {
    if ((front == 0 && rear == MAX - 1) || (rear == (front - 1) % (MAX - 1))) {
        printf("Queue is full (OVERFLOW).\n");
        return;
    } else if (front == -1) {
        front = rear = 0;
        queue[rear] = data;
    } else if (rear == MAX - 1 && front != 0) {
        rear = 0;
        queue[rear] = data;
    } else {
        rear++;
        queue[rear] = data;
    }
}

int dequeue() {
    if (front == -1) {
        printf("Queue is empty (UNDERFLOW).\n");
        return -1;
    }
    int data = queue[front];
    if (front == rear) {
        front = rear = -1;
    } else if (front == MAX - 1) {
        front = 0;
    } else {
        front++;
    }
    return data;
}

void display() {
    if (front == -1) {
        printf("Queue is empty.\n");
        return;
    }
    int i = front;
    if (front <= rear) {
        while (i <= rear)
            printf("%d\t", queue[i++]);
    } else {
        while (i < MAX)
            printf("%d\t", queue[i++]);
        i = 0;
        while (i <= rear)
            printf("%d\t", queue[i++]);
    }
    printf("\n");
}

int main() {
    int choice, data;

    while (1) {
        printf("\n***Options***\n1. Insert Data in Queue\n2. Remove Data from Queue\n3. Display Data of Queue\n4. Exit\n");
        printf("Select Your Option (1, 2, 3, 4): ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter a Data: ");
                scanf("%d", &data);
                enqueue(data);
                break;
            case 2:
                data = dequeue();
                if (data != -1)
                    printf("%d is removed from the queue.\n", data);
                break;
            case 3:
                display();
                break;
            case 4:
                return 0;
            default:
                printf("Invalid option, please try again.\n");
        }
    }
}
