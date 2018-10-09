package Colecciones;
import java.util.Comparator;

public class OrdenamientoPorProtagonista implements Comparator<DVD>
{
    @Override
    public int compare(DVD o1, DVD o2) {
        return o1.getProtagonista().compareTo(o2.getProtagonista());
    }
}
