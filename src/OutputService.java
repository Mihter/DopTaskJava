public class OutputService//ответственнен за вывод строк программы(повторяющихся/единичных)
{
    public static void welcome()
    {
        String rand = ConsoleInput.getRandom();//текущи строки нужны только для теста
        System.out.println("Welcome in Bull Cow Game!!!");
        System.out.printf("Random number: %s \n", rand);//в них я просто для себя указываю какое число, чтобы протестить как ведёт себя программа
    }
    public static void infoCowsAndBulls()//вывожу кол-во коров и быков
    {
        System.out.println(String.format("%s Cows\t %s Bulls", BullsAndCow.getCows(),BullsAndCow.getBulls()));
    }
    public static void sendWin()//поздравляю с победой
    {
        System.out.println("You have won!!!");
    }
}
