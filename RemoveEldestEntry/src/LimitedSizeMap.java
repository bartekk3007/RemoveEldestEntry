import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedSizeMap<K, V> extends LinkedHashMap<K, V>
{
    private final int maxSize;

    public LimitedSizeMap(int maxSize)
    {
        super(maxSize, 0.75f, true); // true ustawia mapę w tryb LRU (Least Recently Used)
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size() > maxSize; // Usuwa najstarszy wpis, gdy rozmiar mapy przekracza maxSize
    }
}