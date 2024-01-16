import java.util.Random;

public class RandomNum
{
    public static final Integer NUM_NUMS = 9999;
    final String RANDOM;
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

    public String getNumber()
    {
        return RANDOM;
    }
}
