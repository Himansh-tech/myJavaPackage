package p3;

import java.util.*;
public class Mul {
    int m;
    public void mul(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first no.: ");
        int x = scan.nextInt();

        System.out.println("Enter the Second no.: ");
        int y = scan.nextInt();

        m = x*y;
        System.out.println("Product is: "+m);
        scan.close();
    }
}
