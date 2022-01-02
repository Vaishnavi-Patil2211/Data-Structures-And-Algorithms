package assignment2;

import java.util.Scanner;

class Publication {
    String title;
    int copies, price;

    void saleCopy() {
    }

}

class Book extends Publication {

    void saleCopy() {
        price = 250;
        System.out.println("Total sale:  " + copies * price);
    }

    void orderCopies() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter copies:  ");
        copies = scan.nextInt();
    }
}

class Magazine extends Publication {


    void saleCopy() {
    }

    void orderQty() {
    }

    void currentIssue() {
    }

    void receiveIssue() {
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.orderCopies();
        b.saleCopy();
    }
}