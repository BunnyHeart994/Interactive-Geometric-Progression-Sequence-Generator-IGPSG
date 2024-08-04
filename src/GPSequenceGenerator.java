public class GPSequenceGenerator
{
    private int minimum, commonRatio, limit;

    public void start()
    {
        minimum = 0;
        limit = 0;
        Print.printLn("Instructions:\n\tYou'll be asked to input 3 numbers separately, " +
                "the first must be the one at which the\n\t" +
                "progression list should start; the second (the common ration), " +
                "the one by which all resulting numbers must be multiplied by;\n\t" +
                "and the third is a limit for the sequence, at which it'll end before, or at it.\n\t" +
                "If you input a second number that's bigger than the first, \n\t" +
                "it'll automatically be treated as the first, so don't worry about that.\n");
        askInput();
    }
    private void askInput()
    {
        do
        {
            this.minimum = Scan.integer("Begin.\nMinimum: ");
            if (this.minimum == 0)
            {
                Print.printLn("Zero is not valid. Try another one.");
            }
            else break;
        } while (true);
        do
        {
            this.commonRatio = Scan.integer("Common ratio: ");
            if (this.commonRatio == 0)
            {
                Print.printLn("Zero is not valid. Try another one.");
            }
            else break;
        } while (true);

        do
        {
            this.limit = Scan.integer("Limit: ");
            if (this.limit == 0)
                Print.printLn("Zero is not valid. Try another number:");
//            else if (this.limit < this.minimum)
//            {
//                Print.printLn("Limit is smaller than target number.\n" +
//                        "Values have automatically been swapped.");
//                int temp;
//                temp = this.minimum;
//                this.minimum = limit;
//                this.limit = temp;
//                break;
//            }
            else break;
        } while (true);

        Print.printLn("Multiplication geometric progression list of common ratio " +
                commonRatio + ":");
        generateList();
    }
    private void generateList()
    {
        if ((minimum * commonRatio) > limit)
        {
            Print.printLn("\n" + minimum + ". End");
        }
        else
        {
            int loopCount = 0;
            while (true)
            {
                if (loopCount == 10)
                {
                    Print.print("\n");
                    loopCount = 0;
                }
                if (((minimum * commonRatio) == limit) || (((minimum * commonRatio) <= limit) & ((minimum * (Math.pow(commonRatio, 2))) >= limit)))
                {
                    Print.print(minimum + ", " + (minimum * commonRatio) + (((minimum * Math.pow(commonRatio, 2)) == limit) ? ", " + (minimum * (Math.pow(commonRatio, 2))) + ".\nEnd." : ".\nEnd."));
                    break;
                }
                else
                {
                    Print.print(minimum + ", ");
                    minimum *= commonRatio;
                    loopCount++;
                }
            }
        }
    }
    /*private boolean exitState(boolean isTrue)
    {
        this.exit = isTrue;
        return isTrue;
    }*/
}