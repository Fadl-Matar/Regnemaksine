import java.util.Scanner;
import java.lang.String;

public class Regnemaksine {
    public static void main(String[] args) {
        System.out.println("Indtast venligst dine værdier her:");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float f = input.nextFloat();
        String username = input.nextLine();
        input.close();

        System.out.println("Addition: " + (a+f));
        System.out.println("Subtraktion: " + (a-f));
        System.out.println("Multiplikation: " + (a*f));
        System.out.println("Division: " + (a/f));
        System.out.println("Modulus: " + (a%f));
//Muzza skal ud
        //fadl er dum

        //Hej med dig
    }
}
