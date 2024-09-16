package p1;

import java.util.*;
public class Add{
    int s;
    public void sum(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scan.nextInt();

        System.out.println("Enter second number: ");
        int y = scan.nextInt();

        s = x+y;
        System.out.println("sum is: "+s);
        
        scan.close();
    }
}
