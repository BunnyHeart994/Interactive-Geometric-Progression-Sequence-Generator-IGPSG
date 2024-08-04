import java.util.*;
import java.lang.*;

public class Scan
{
    //private static int scannedInt;
    //private static String scannedString;

    public static int integer(String text) //Scan and return Integer
    {
        Print.print(text);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
    public static String string(String text) //Scans and return String
    {
        Print.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
