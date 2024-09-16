import java.util.*;
import p1.Add;
import p2.Sub;
import p3.Mul;
import p4.Div;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create object of classes from different packages
        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();

        System.out.println("Enter choice  1. Add 2. Subtract 3. Multiply 4.Divide");
        
        int t = sc.nextInt();

        switch (t) {
            case 1:
                a.sum();
                break;
            
            case 2:
                s.sub();
                break;

            case 3:
                m.mul();
                break;

            case 4:
                d.div();
                break;
        }
        sc.close();
    }
}