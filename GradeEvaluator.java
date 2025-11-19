import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your grade");
        float grade=sc.nextFloat();
        String isValid= (grade>=40)? "You have passed" : "You have failed";
        System.out.println(isValid);
    }
}