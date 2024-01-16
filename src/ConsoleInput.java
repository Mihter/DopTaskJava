import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput //ввод консоли
{
    private static String num;
    private static String random;

    public ConsoleInput(String _num)
    {
        num = _num;
    }


    public static void printNum() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Input a number: ");
        //Scanner in = new Scanner(System.in);
        String _num = br.readLine();

        num = InputService.checkAndNext(_num);//проверяю на кол-во цифр в числе
        //num = _num;

        System.out.printf("Your number: %s \n", _num);

    }

    public static void setRandom(String _random)
    {
        random = _random;
    }

    public static String getRandom()
    {
        return random;
    }

    public static void printBullsAndCows() throws IOException {

        BullsAndCow.calcCows(random, num);
    }

}
