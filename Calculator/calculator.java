import java.util.*;

public class calculator {
    public static void main(String[] args) {
        int n1, n2, n3, cal, quotient, remainder;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        n1 = r.nextInt();
        System.out.print("Enter the Second number: ");
        n2 = r.nextInt();
        
        System.out.println("Select Operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.print("Enter Operation Number: ");
        n3 = r.nextInt();
        
        if (n3 == 1) {
            cal = n1 + n2;
            System.out.println("Sum of two numbers: " + cal);
        } else if (n3 == 2) {
            cal = n1 - n2;
            System.out.println("Difference of two numbers: " + cal);
        } else if (n3 == 3) {
            cal = n1 * n2;
            System.out.println("Product of two numbers: " + cal);
        } else if (n3 == 4) {
            if (n2 != 0) {  
                quotient = n1 / n2;
                remainder = n1 % n2;
                System.out.println("Quotient of two numbers: " + quotient);
                System.out.println("Remainder of two numbers: " + remainder);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation selection.");
        }

        r.close(); 
    }
}

