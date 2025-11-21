import java.util.Scanner;

public class MathOperations
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic operators:");
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        System.out.println("For +");
        System.out.println(num1+num2);
        System.out.println("For -");
        System.out.println(num1-num2);
        System.out.println("For *");
        System.out.println(num1*num2);
        System.out.println("For /");
        System.out.println(num1/num2);
        
        System.out.println("\n for Unary operators");
        System.out.println("\n Enter a number");
        int num3= sc.nextInt();
        System.out.println("For Pre Increment");
        System.out.println(++num3);
        System.out.println("For Post Increment");
        System.out.println(num3++);
        
        System.out.println("For Relational operator");
        System.out.println("when p is 3 and q is 5");
        int p=3;
        int q=5;
        System.out.println("p>q="+(p>q));
        System.out.println("Shows false as 3 is not greater than 5");
        
        
        System.out.println("For Logical operator");
        System.out.println("When a is false and b is true under OR operation");
        boolean a=false;
        boolean b=true;
        System.out.println("a OR b ="+(a||b));
        
        System.out.println("For Ternary operator");
        System.out.println("\n Enter first number");
        int num4= sc.nextInt();
        System.out.println("\n Enter second number");
        int num5= sc.nextInt();
        String isValid= (num4==num5)? "The numbers are same" : "The numbers are different";     
        System.out.println(isValid);       
        
    }
}