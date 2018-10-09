package Colecciones;


public class MainParaColecciones {

    public static void main(String[] args)
    {
        DVD dvd = new DVD("Titan AE","Animación, Ciencia ficción, Aventura, Acción","Cale Tucker");

        System.out.println("Titulo: "+ dvd.getTitulo());
        System.out.println("Genero: " + dvd.getGenero());
        System.out.println("Protagonista: "+ dvd.getProtagonista());

    }
}
