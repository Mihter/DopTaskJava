public class Pair<T1, T2>//создаём пару в которой храним кол-во коров и быков
{
    private final T1 first;
    private final T2 second;
    public Pair(T1 _first, T2 _second)
    {
         this.first = _first;
        this.second = _second;
    }

}
