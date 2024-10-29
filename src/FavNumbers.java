import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInt = 0;
        double favDouble = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "Enter an favorite integer: ");
        System.out.println("Your favorite integer is " + favInt);
        favDouble = SafeInput.getDouble(in, "Enter an favorite double: ");
        System.out.println("Your favorite double is " + favDouble);
    }
}
