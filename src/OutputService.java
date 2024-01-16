public class OutputService//вывод программы
{
    public static void infoCowsAndBulls()//вывожу кол-во коров и быков
    {
        System.out.println(String.format("%s Cows\t %s Bulls", BullsAndCow.getCows(),BullsAndCow.getBulls()));
    }
    public static void sendWin()//поздравляю с победой
    {
        System.out.println("You have won!!!");
    }
}
