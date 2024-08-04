public class GPSequenceGenerator
{
    //Scanner scanner = new Scanner(System.in);
    private int minimum, commonRation, limit;

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
        //this.minimum = Integer.parseInt(scanner.nextLine()); //obsolete

        do
        {
            this.minimum = Scan.integer("Begin.\nTarget number: ");
            if (this.minimum == 0)
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
            else if (this.limit < this.minimum)
            {
                Print.printLn("Limit is smaller than target number.\n" +
                        "Values have automatically been swapped.");
                int temp;
                temp = this.minimum;
                this.minimum = limit;
                this.limit = temp;
                break;
            }
            else break;
        } while (true);

        Print.printLn("Multiplication geometric progression list of common ratio 2:");
        generateList();
    }
    private void generateList()
    {
        if ((minimum * 2) > limit)
        {
            Print.printLn("\n" + minimum + ". End");
            //return;
        }
        else
        {
            int loopCount = 0;
            while (true)
            {
                if (loopCount == 5)
                {
                    Print.print("\n");
                    loopCount = 0;
                }
                if (((minimum * 2) == limit) || (((minimum * 2) <= limit) & ((minimum * 4) >= limit)))
                {
                    Print.print(minimum + ", " + (minimum * 2) +
                            ((minimum * 4 == limit) ?
                                    ", " + (minimum * 4) + ".\nEnd." : ".\nEnd."));
                    break;
                }
                else
                {
                    Print.print(minimum + ", ");
                    minimum *= 2;
                    loopCount++;
                }
            }
            //return;
        }
    }
    /*private boolean exitState(boolean isTrue)
    {
        this.exit = isTrue;
        return isTrue;
    }*/
}