package Colecciones;
import java.util.*;

public class DVD implements Comparable<DVD>
{

    private String Titulo;
    private String Genero;
    private String Protagonista;
    private String Director;

    // constructor Default
    public void DVD()
    {
    }

    // DVD
    public DVD (String titulo)
    {
        this.Titulo = titulo;
    }

    public DVD (String titulo, String genero)
    {
        this (titulo);
        this.Genero = genero;
    }

    public DVD (String titulo, String genero, String protagonista)
    {
        this(titulo, genero);
        this.Protagonista = protagonista;
    }
    public DVD (String titulo, String genero, String protagonista, String director)
    {
        this(titulo, genero, protagonista);
        this.Director = director;
    }

    @Override
    public String toString() {
        return "\n|------------------------------------------------------------------|\n|   Titulo:       |  "+ getTitulo()+ "\n|------------------------------------------------------------------|\n|   Genero:       |  "+ getGenero()+ "\n|------------------------------------------------------------------| \n|   Protagonista: |  "+getProtagonista()+"\n|------------------------------------------------------------------|";
    }

    @Override
    public int compareTo(DVD o) {
        return Titulo.compareTo(o.Titulo);
    }


    //--- get y set de titulo
    public String getTitulo()
    {
        return Titulo;
    }

    public void setTitulo(String titulo)
    {
        this.Titulo = titulo;
    }
    //--- get y set genero
    public String getGenero()
    {
        return Genero;
    }

    public void setGenero(String genero)
    {
        Genero = genero;
    }
    //--- get y set de protaonista
    public String getProtagonista()
    {
        return Protagonista;
    }

    public void setProtagonista(String protagonista)
    {
        Protagonista = protagonista;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }
}
