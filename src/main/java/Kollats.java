class LenKollats {
    long LenPosl; // Наибольшая последовательность


    LenKollats(long First, long EndNumber) {
        //LenPosl = 0;
    }

    public long getKollats(long x) {
        long counter = 0; // счетчик
        while (x != 1) {
            if (x % 2 == 0){x = (x / 2);}// четное
            else {x = (3 * x + 1);} // не чётное
            counter++;
        }
        return counter;
    }

    public long getLen(long first, long end) {
        long number = first;
        long length = 0; // счётчик
        long maxLen = 0; // максимальная длинна

        for (;number <= end; number++) // От 1 до 1000000
        {
            length = getKollats(number);

            if (maxLen <= length) {maxLen = length;} // запись максимальных значений
        }
        return maxLen;
    }
}

class Kollats
{
    public static void main(String[] args)
    {
        long First = 1; // 1 первый элемент
        long EndNumber = 1000000; // 1000000 последний элемент
        LenKollats koll = new LenKollats(First, EndNumber);
        koll.LenPosl = koll.getLen(First, EndNumber);
        System.out.print("Длинна последовательности Коллатца от "+First+" до "+EndNumber+" = "+koll.LenPosl);
    }
}