import java.io.IOException;

public class InputService //проверка ввода
{
    public static String checkAndNext(String num) throws IOException {
        if (num.length() != 4)
        {
            throw new MyException("The length of the number: " + num +" is less than or more than 4 characters");

        }



        return num;
    }
}
