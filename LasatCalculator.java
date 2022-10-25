import java.util.Scanner;
public class LasatCalculator {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Lasat's Calculator");
      System.out.print("Enter the First Number: ");
      double num1 = scan.nextInt();
      System.out.print("Enter the Second Number: ");
      double num2 = scan.nextInt();
      System.out.println("0 for Addition, 1 for Subtraction, 2 for Multiplication and 3 for Division");
      
      int choice = scan.nextInt();
         switch (choice){
            case 0:
               double Add = num1+num2;
               System.out.println("= " + Add);
               break;
            case 1:
               double Minus = num1-num2;
               System.out.println("= " + Minus);
               break;
            case 2:
               double Multiply = num1*num2;
               System.out.println("= " + Multiply);
               break;
            case 3:
               double Divide = num1/num2;
               System.out.println("= " + Divide);
               break;
            default:
               System.out.println("Invalid");
               break;
      }
   }
}