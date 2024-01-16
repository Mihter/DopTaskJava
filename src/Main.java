import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        RandomNum random = new RandomNum();//созаю число для игры
        String _random = random.getNumber();
        ConsoleInput.setRandom(_random);//передал в ввод число
        ConsoleInput.welcome();//приветсвую

        ConsoleInput.printNum();//прошу ввести число
        ConsoleInput.printBullsAndCows();//вывожу число коров и быков
    }
}