package Basic;

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str=in.next();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);


        }
        if(str.equals(rev)){
            System.out.println("palandrome");
        }else{
            System.out.println("not palandrome");
        }

    }
}
