import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        GPSequenceGenerator pAG = new GPSequenceGenerator();

        Print.printLn("Interactive Geometric Progression Sequence Generator (IGPSG)\n" +
                "Version 1.1.0 by Henrique.\n" +
                "This is a multiplication geometric progression list generator, of common ratio 2.");

        pAG.start();
    }
}