import java.util.Scanner;

public class Rickshaw
{
    public static void main(String[]args)
    {
        float total;
        float TotalAfterDiscount;
        float distance;
        float mins;
        String local;
        String night;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter distance(km): "); 
        distance = scanner.nextFloat();            // distance
        System.out.println("Enter time(mins): ");
        mins = scanner.nextFloat();                // mins
        
        scanner.nextLine();
        
        System.out.println("Are you local? (Y/N): ");
        local = scanner.nextLine();                // local (Y/N)
        System.out.println("Is it nighttime? (Y/N): ");
        night = scanner.nextLine();                // night (Y/N)
        
        float KmCharge = 10f;
        float BaseCharge = 25f;
        float MinCharge = 2f;
        
        float NightSurcharge = night.equals("Y") ?0.05f :0.0f;
        float LocalDiscount = (local.equals("Y") && distance>5) ?0.05f :0.0f;         

        float Initial = BaseCharge + (distance * KmCharge) + (mins * MinCharge);
        float After_Night_Surcharge = Initial + (Initial * NightSurcharge);
        TotalAfterDiscount = After_Night_Surcharge - (After_Night_Surcharge * LocalDiscount);

        System.out.println();
        System.out.println("Your total is: Rs."+TotalAfterDiscount);
             
    }
}