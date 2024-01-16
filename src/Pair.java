public class Pair<T1, T2>//создаём пару в которой храним кол-во коров и быков
{
    private final T1 first;
    private final T2 second;
    public Pair(T1 _first, T2 _second)
    {
         this.first = _first;
        this.second = _second;
    }

    //String getCowsAndBulls()
    //{
    //    String result = String.format("%s Cows\t %s Bulls", first,second);
    //    return result;
    //}

    //T1 getFirst()
    //{
    //    T1 cows = first;
    //    return cows;
    //}

    //T2 getSecond()
    //{
    //   T2 bulls = second;
    //    return bulls;
    //}
}
