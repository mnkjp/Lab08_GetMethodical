import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsuis = SafeInput.getRangedDouble(in, "Enter a celsuis temperature", -100.0, 100.0);
        double farenheit = SafeInput.CtoF(celsuis);
        boolean done = false;


            System.out.printf("%-10s %-10s%n", "Fahrenheit", "Celsius");
            System.out.println("-----------------------");
            System.out.printf("%-10s %-10s%n", farenheit, celsuis);
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = SafeInput.CtoF(celsius);
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);










    }

    }






}
