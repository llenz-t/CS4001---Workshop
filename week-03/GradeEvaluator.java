import java.util.Scanner;

public class GradeEvaluator
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades");
        int grade = input.nextInt();
        
        if (grade>=40)
        {
            System.out.println("Print pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}