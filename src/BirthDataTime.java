import java.util.Scanner;

public class BirthDataTime
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         int year = 0;
         int month = 0;
         int day = 0;
         int hour = 0;
         int minute = 0;
         int lowMonth = 1;
         int highMonth = 0;

        year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your month of birth,", 1, 12);


        switch (month)
        {
            case 2:
                highMonth = 29;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
                case 12:
                highMonth = 31;
            case 4:
            case 6:
            case 8:
                case 11:
                highMonth = 30;
        }
        day = SafeInput.getRangedInt(in, "Enter your day of birth,", lowMonth, highMonth);
        hour = SafeInput.getRangedInt(in, "Enter your hour of birth,", 0, 12);
        minute = SafeInput.getRangedInt(in, "Enter your minute of birth,", 0, 59);

        System.out.println("You said you were born on " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
    }
}
