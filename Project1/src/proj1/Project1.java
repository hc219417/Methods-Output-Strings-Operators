package proj1;

/**
 * @author (c) Hannah Culver, Ohio Univ Comp Sci Dept, 2022
 */

public class Project1 {

    private static void stringStuff(){
        System.out.println("\nString Stuff\n");

        String lastName = new String("Culver");
        String firstName = "Hannah";
        String fullName = firstName + " " + lastName; //shortcut for firstName.concat(" ").concat(lastName)
        System.out.println("my name is: " + fullName);
        System.out.println("I said: " + fullName.toUpperCase() + "!");

        int num = 2;
        System.out.println("\nHello\n");         // print line 1
        System.out.println(num);                 // print line 2
        System.out.println("22: " + num + num);  // print line 3
        System.out.println("4: " + (num + num)); // print line 4
    }

    private static void numberOutputStuff(){
        System.out.println("\nNumber Output Stuff\n");

        double oneThird = 1.0 / 3.0;
        System.out.println("oneThird = " + oneThird);

        System.out.println("");
        System.out.printf("%f", oneThird);
        System.out.println("");

        int a = 2;
        int b = 3;
        double x = 0.66666;
        System.out.printf("\nFraction: %d / %d = %f\n", a, b, x);

        System.out.printf("\n|%f|", oneThird);

        System.out.printf("\n|%20.2f|", oneThird);
        System.out.printf("\n|%20.12f|", oneThird);
        System.out.printf("\n|%20.20f|", oneThird);
        System.out.printf("\n|%-20.2f|", oneThird);
        System.out.printf("\n|%20.0f|", oneThird);
        System.out.printf("\n");

        System.out.printf( "\nC/C++ default: |%f|", oneThird);
        System.out.println("\nJava default : |" + oneThird + "|");
    }

    private static void headerLine(){
        System.out.printf("\n");
        System.out.printf("%12s", "a");
        System.out.printf("%12s", "b");
        System.out.printf("%12s", "a + b");
        System.out.printf("%12s", "a * b");
        System.out.printf("%12s", "a / b");
        System.out.printf("%12s", "a % b");
    }

    private static void mathLine(int a, int b){
        System.out.printf("\n");          // new line
        System.out.printf("%12d", a);     // write a
        System.out.printf("%12d", b);     // write b
        System.out.printf("%12d", a + b); // write a + b
        System.out.printf("%12d", a * b); // write a * b
        System.out.printf("%12d", a / b); // write a / b
        System.out.printf("%12d", a % b); // write a % b
    }

    private static void intMathTable(){
        System.out.println("\nInteger Math Table");
        System.out.println("");
        headerLine();
        System.out.println("");
        for (int i = 0; i <= 20; ++i){
            mathLine(i, 5);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Project 1");
        System.out.println("Hannah Culver");

        System.out.println("\nProject 1.\n");

        stringStuff();

        numberOutputStuff();

        intMathTable();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("\nBye.\n");
    }
}
