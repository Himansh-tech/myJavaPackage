package p2;

import java.util.*;
public class Sub {
    int d;
    public void sub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scan.nextInt();

        System.out.println("Enter Second number: ");
        int y = scan.nextInt();

        d=x-y;
        System.out.println(d);
        scan.close();
    }
}
