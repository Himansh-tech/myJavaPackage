package p4;

import java.util.*;
public class Div {
    int a;
    public void div(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first no.: ");
        int x = scan.nextInt();

        System.out.println("Enter the second no.: ");
        int y = scan.nextInt();

        a = x*y;
        System.out.println("Division is: "+ a);
        scan.close();
    }
}
