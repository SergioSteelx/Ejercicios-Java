package Colecciones;

public class DVD {

    private String titulo;
    private String Genero;
    private String Protagonista;

    // constructor Default
    public String dvd ()
    {
        return "DVD desconocido";
    }

    // DVD 
    public String dvd (String titulo)
    {
        return "";
    }


    public String dvd (String titulo, String genero)
    {
        return "";
    }


    public String dvd (String titulo, String genero, String protagonista)
    {
        return "";
    }

//--- get y set de titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
