import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String ssn, ucid, menuChoice = "";
        String SSNRx = "^\\d{3}-\\d{2}-\\d{4}$";
        String UCIDnumRx = "^(M|m)\\d{5}";
        String menuRx = "^[OoSsVvQq]$";

        ssn = SafeInput.getRegExString(in, "Enter your SSN", SSNRx);
        System.out.println("You said your ssn is " + ssn);
        ucid = SafeInput.getRegExString(in, "Enter your UCID", UCIDnumRx);
        System.out.println("You said your UCID is " + ucid);
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", menuRx);
        System.out.println("You said your menu choice is " + menuChoice);




    }
}
