package Colecciones;

import java.util.Comparator;

public class OrdenamientoPorGenero implements Comparator <DVD>
{
    @Override
    public int compare(DVD uno, DVD dos)
    {
        return uno.getGenero().compareTo(dos.getGenero());
    }
}
