import java.io.IOException;

public class BullsAndCow //смотрим сколько быков и коров в вновь введённом числе
{
    private static Integer cows;
    private static Integer bulls;

    static Pair<Integer, Integer> calcCows(String a, String b) throws IOException
    {
        Integer nBulls = 0, nCows = 0;

        StringBuilder a_builder = new StringBuilder(a);
        StringBuilder b_builder = new StringBuilder(b);

        for (int i = 0; i < a.length(); ++i)
        {
            if (a.charAt(i) == b.charAt(i))
            {
                nBulls++;
                a_builder.setCharAt(i, ' ');
                b_builder.setCharAt(i, ' ');
            }
        }
        a = a_builder.toString();
        b = b_builder.toString();
        for (int i = 0; i < a.length(); ++i)
        {
            if (a.charAt(i) == ' ')
                continue;
            int countLeft = countBetween(a.charAt(i), a, 0, i);
            int countInComputerNumber = countBetween(
                    a.charAt(i), b, 0, b.length());
            if (countInComputerNumber != 0
                    && countLeft < countInComputerNumber)
                nCows++;
        }
        cows = nBulls;
        bulls = nCows;
        isWin(nBulls);
        return new Pair<Integer, Integer>(nBulls, nCows);
    }
    static int countBetween(char what, String where,
                            int from, int to) {
        int count = 0;
        for (int i = from; i < to; ++i) {
            if (where.charAt(i) == what)
                count++;
        }
        return count;
    }

    static void isWin(Integer nBulls) throws IOException
    {

        if (nBulls ==4)
        {
            OutputService.infoCowsAndBulls();
            OutputService.sendWin();
        }
        else
        {
            OutputService.infoCowsAndBulls();
            ConsoleInput.printNum();
            ConsoleInput.printBullsAndCows();
        }
    }

    static Integer getCows()
    {
        return cows;
    }
    static Integer getBulls()
    {
        return bulls;
    }

}
