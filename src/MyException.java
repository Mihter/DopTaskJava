import java.io.IOException;

public class MyException extends IllegalArgumentException//самописная Exception
{
    public MyException(String errorMessage)//позволяет вывести текст ошибки
    {
        super(errorMessage);
    }
}
