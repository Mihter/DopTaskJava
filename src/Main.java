import java.io.IOException;

public class Main//тело программы, включает в себя методы которые отвечают за определённые этапы игры
{
    public static void main(String[] args) throws IOException
    {
        RandomNum random = new RandomNum();//созаю число для игры
        String _random = random.getNumber();
        ConsoleInput.setRandom(_random);//передал в ввод число
        OutputService.welcome();//приветсвую и для теста показываю рандом

        ConsoleInput.printNum();//прошу ввести число
        ConsoleInput.printBullsAndCows();//вывожу число коров и быков
    }
}