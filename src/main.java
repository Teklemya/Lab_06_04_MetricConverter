import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        double mile = 0;
        double meter = 0;
        double feet = 0;
        double inches = 0;

        System.out.print("Enter the distance in meters: " );

        if(in.hasNextDouble())
        {
            meter = in.nextDouble();
            in.nextLine();
            mile = meter * 0.00062;
            feet = meter * 3.28084;
            inches = meter * 39.3701;

            System.out.println(" Distance in feet is " + feet);
            System.out.println(" Distance in inches is " + inches);
            System.out.println(" Distance in miles is " + mile);

        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid number! ");
        }
    }
}
