import java.util.Scanner;

public class Exercice13 {

    public static void main(String[] args) {
        int x,y,z;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number:");
        x= input.nextInt();
        System.out.println("Enter a other number:");
        y= input.nextInt();
        System.out.println("Enter a last number:");
        z= input.nextInt();

        if (x>=y && x>=z) {
            System.out.println("The biggest number is: " + x);
        } else if (z>=x && z>=y) {
            System.out.println("The biggest number is: " + z);
        } else {
            System.out.println("The biggest number is: " + y);
        }
    }
}
