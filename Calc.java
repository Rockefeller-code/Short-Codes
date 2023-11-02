import java.util.Scanner;
public class Calc {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        Numbers Obj = new Numbers();
        System.out.println("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        int result = Obj.add(num1,num2);

        System.out.println("Result = "+ result);

        input.close();
    }
}
