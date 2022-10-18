package Basic;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter p value");
        int p=in.nextInt();
        System.out.println("Enter r value");
        int r=in.nextInt();
        System.out.println("Enter t value");
        int t=in.nextInt();
        System.out.println("value of SI is: ");

      int SI=p*r*t/100;
        System.out.println(SI);
    }
}
