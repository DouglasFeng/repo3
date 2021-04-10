package c4;

public class HSDIS {
    int a=1;
    static int b=2;

    public int sum(int c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        new HSDIS().sum(3);
    }
}
