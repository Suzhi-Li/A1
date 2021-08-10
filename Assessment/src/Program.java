import java.util.Scanner;
public class Program
{
    public static void main (String[] arg)
    {
        System.out.println("This program is a temperature translate system.");
        System.out.println("It will translate Celsius to Fahrenheit or Fahrenheit to Celsius.");
        Scanner Scan = new Scanner(System.in);
        double temperature_number;
        String temperature_unit;
        System.out.println("Please enter a temperature (e.g, 10.0 C or 20.0 F):");
        temperature_number = Scan.nextDouble();
        temperature_unit = Scan.next();
        switch (temperature_unit)
        {
            case "C":
            case "c":
                double result = temperature_number * (9.0/5) + 32;
                System.out.printf("The converted temperature is %4.2f F.",result );
                break;
            case "F":
            case "f":
                double result_3 = (temperature_number - 32)*(5.0/9);
                System.out.printf("The converted temperature is %4.2f C.",result_3);
                break;
            default:
                System.out.println("You should follow the example.");
        }
    }
}
