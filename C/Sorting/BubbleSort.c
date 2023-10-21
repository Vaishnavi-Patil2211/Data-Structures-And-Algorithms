#include <stdio.h>

void bubbleSort(int num[], int n) {
    if (n == 1) {
        return;
    }

    // Perform a single pass of Bubble Sort
    for (int i = 0; i < n - 1; i++) {
        if (num[i] > num[i + 1]) {
            // Swap num[i] and num[i + 1]
            int temp = num[i];
            num[i] = num[i + 1];
            num[i + 1] = temp;
        }
    }

    // Recursive call for the remaining elements
    bubbleSort(num, n - 1);
}

int main() {
    int n, num[100];
    printf("How Many Numbers You Want to Insert: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter a Number: ");
        scanf("%d", &num[i]);
    }

    bubbleSort(num, n);

    printf("Sorted Data:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t", num[i]);
    }

    return 0;
}
