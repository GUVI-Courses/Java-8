import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        System.out.println("Welecome to the Mini Calculator");

        while(keepRunning){
            System.out.println("Enter the number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Choose an Operation: +,-,*,/,%");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator){
                case '+':
                    result = add(num1,num2);
                    System.out.println("Result" + result);
                    break;
                case '-':
                    result = subtract(num1,num2);
                    System.out.println("Result " + result);
                    break;
                case '*':
                    result = multiply(num1,num2);
                    System.out.println("Result " + result);
                    break;
                case '/':
                    if(num2!=0){
                        result = divide(num1,num2);
                        System.out.println("Result " + result);
                        break;
                    }
                case '%':
                    result = num1 % num2;
                    System.out.println("Result " + result);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }


            System.out.println("Do you want to perform another operation? (yes/no) ");
            String answer = sc.next();

            if(!answer.equalsIgnoreCase("yes")){
                keepRunning = false;
                System.out.println("Thankyou for using the calculator");
            }

        }

        sc.close();

    }

    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }
}
