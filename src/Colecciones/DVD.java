package Colecciones;

public class DVD {

    private String Titulo;
    private String Genero;
    private String Protagonista;

    // constructor Default
    public void DVD ()
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

//--- get y set de titulo
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
    //--- get y set genero
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
    //--- get y set de protaonista
    public String getProtagonista() {
        return Protagonista;
    }

    public void setProtagonista(String protagonista) {
        Protagonista = protagonista;
    }
}
