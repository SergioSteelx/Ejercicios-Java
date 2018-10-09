package Colecciones;

import java.util.Comparator;

public class OrdenamientoPorDirector implements Comparator <DVD>
{
    @Override
    public int compare(DVD o1, DVD o2) {
        return o1.getDirector().compareTo(o2.getDirector());
    }
}

