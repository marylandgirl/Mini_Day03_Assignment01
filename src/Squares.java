import java.util.Scanner;
public class Squares {
    public static void main(String[] args) {
        int numIn = 0;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter a number:");

        numIn = keyIn.nextInt();

        System.out.println("Number\tSquare");
        System.out.println("-----------\t-----------");
        for (int i = 1; i <= numIn; i++) {
            System.out.println(i + "\t \t\t" + (i*i));
        }
    }
}
