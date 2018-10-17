package Static;

public class Galleta
{



    private String Nombre;
    private String Tamanio;
    private String Color;
    private String Olor;
    private String Sabor;
    private String Relleno;
    private String Forma;
    private String grosor;
    private static  int cantidad = 0;

    //--------------------------------- constructores -----------------------------------
    public Galleta()
    {

    }

    public Galleta(String nombre)
    {
        this.Nombre = nombre;
    }

    public Galleta(String nombre,String tamanio)
    {
        this(nombre);
        this.Tamanio = tamanio;
    }


    public Galleta(String nombre,String tamanio, String color)
    {
        this (nombre,tamanio);
        this.Color = color;
    }

    public Galleta(String nombre,String tamanio, String color, String olor)
    {
        this (nombre,tamanio, color);
        Olor = olor;
    }

    public Galleta(String nombre,String tamanio, String color, String olor,String sabor)
    {
        this (nombre,tamanio, color,olor);
        this.Sabor = sabor;
    }

    public Galleta(String nombre,String tamanio, String color, String olor, String sabor, String relleno) {
       this (nombre,tamanio, color, olor, sabor);
        this.Relleno = relleno;
    }

    public Galleta(String nombre,String tamanio, String color, String olor, String sabor, String relleno, String forma) {
        this (nombre,tamanio, color, olor, sabor, relleno);
        this.Forma = forma;
    }
    public Galleta(String nombre,String tamanio, String color, String olor, String sabor, String relleno, String forma, String grosor) {
        this (nombre,tamanio, color, olor, sabor, relleno, forma);
        this.grosor = grosor;
        cantidad = cantidad + 1;
    }
    public Galleta(int cantidad, String nombre, String tamanio, String color, String olor, String sabor, String relleno, String forma, String grosor) {
        this (nombre, tamanio, color, olor, sabor, relleno, forma,grosor);
        this.cantidad = cantidad;
    }

    //-----------------------------------geters y seter de variables----------------------------------------------
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String tamanio) {
        Tamanio = tamanio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getOlor() {
        return Olor;
    }

    public void setOlor(String olor) {
        Olor = olor;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public String getRelleno() {
        return Relleno;
    }

    public void setRelleno(String relleno) {
        Relleno = relleno;
    }

    public String getForma() {
        return Forma;
    }

    public void setForma(String forma) {
        Forma = forma;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
    }
    public static int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {

        return"\n|------------------------------------------------------------------|\n" +
                "|   Numero:      |  "+ getCantidad()+ "\n" +
                "|----------------|-------------------------------------------------|\n" +
                "|   Tamaño:      |  "+ getTamanio()+ "\n" +
                "|----------------|-------------------------------------------------|\n" +
                "|   Color:       |  "+ getColor()+ "\n" +
                "|----------------|-------------------------------------------------| \n" +
                "|   Olor:        |  "+ getOlor()+"\n" +
                "|----------------|-------------------------------------------------| \n" +
                "|   Sabor:       |  "+ getSabor()+"\n" +
                "|----------------|-------------------------------------------------| \n" +
                "|   Relleno:     |  "+ getRelleno()+"\n" +
                "|----------------|-------------------------------------------------| \n" +
                "|   Forma:       |  "+ getForma()+"\n" +
                "|----------------|-------------------------------------------------| \n" +
                "|   Grosor:      |  "+ getGrosor()+"\n" +
                "|------------------------------------------------------------------| ";

    }
}
