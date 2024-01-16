import java.io.IOException;

public class InputService //проверка ввода за счёт самописной ошибки, если ввод не верный то вылетит Exception
{
    public static String checkAndNext(String num) throws IOException {
        if (num.length() != 4)
        {
            throw new MyException("The length of the number: " + num +" is less than or more than 4 characters");

        }

        return num;
    }
}
