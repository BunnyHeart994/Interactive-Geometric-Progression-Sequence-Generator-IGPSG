import java.util.*;
import java.lang.*;

public class Format
{
    public static void formatSO(String string, Object object)
    {
        Formatter formatter = new Formatter();
        Object obj = formatter.format(string, object);
        Print.print(obj);
    }
    public static void formatLnSO(String string, Object object)
    {
        Formatter formatter = new Formatter();
        Object obj = formatter.format(string, object);
        Print.printLn(obj);
    }
}
