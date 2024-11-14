import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new LimitedSizeMap<>(3);

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map); // Wypisze: {1=One, 2=Two, 3=Three}

        map.put(4, "Four");
        System.out.println(map); // Wypisze: {2=Two, 3=Three, 4=Four}
    }
}