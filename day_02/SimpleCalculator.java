import java.util.*;
class SimpleCalculator {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int result = 0;
    char operator;

    System.out.println("Enter first number ");
    int num1 = sc.nextInt();
    
    System.out.println("Enter Second number ");
    int num2 = sc.nextInt();

    System.out.println("Enter an operator (+, -, *, /) ");
    operator = sc.next().charAt(0);

    switch(operator) {
         case '+':
                result = num1 + num2;
                break;

        case '-':
                result = num1 - num2;
                break;

        case '*':
                result = num1 * num2;
                break;

        case '/':
                 result = num1 / num2;
                 break;

        default :
                System.out.println("Invalid Operator");           
    }

    System.out.println("Result = " + result);
    

    }
}