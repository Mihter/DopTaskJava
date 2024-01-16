import java.util.Random;

public class RandomNum//ответственет за получение рандомного числа и хранит его единственную версию
{
    public static final Integer NUM_NUMS = 9999;//правая грпница рандомного числа от 0 до 9999
    final String RANDOM;//рандомное число
    public RandomNum()
    {
        RANDOM = getRandomNum();
    }
    private static String getRandomNum()
    {
        Random rnd = new Random();
        Integer random = rnd.nextInt(NUM_NUMS);
        return String.format("%04d", random);
    }

    public String getNumber()//позволяет получать другим классам доступ к значению поля RANDOM
    {
        return RANDOM;
    }
}
