Learning packages in java:
Took a simple example of calcultor, made 4 different folder with their java files Add, Sub, Mul, and Div with corresponding Package name p1,p2,p3 and p4.

Then we imported all the packages in our main Calculator class and made the objects for each class and then used that objects to call the function of that class.

Same things happens when we work with Scanner;
    <br>
    (1) Scannner is saved in package named util first we import the package, by doing "import java.util.Scannner;".
    <br>
    (2) Then make object of the Scanner class as Scanner sc = new Scanner(System.in);.
    <br>
    (3) Then we call different function using that object as sc.nextInt(); or sc.nextLine();.
    <br>

Structure of All files and folder is something like this:


MAKINGPACKAGE/
│
├── p1/
│   └── Add.java
├── p2/
│   └── Sub.java
├── p3/
│   └── Mul.java
└── Main.java
