package Colecciones;
import java.util.*;



public class Ejercicio
{
    public static void main(String[] args)
    {
        List<DVD> dvds = ListaDVD();

        for (DVD dvd:dvds)
        {
            System.out.println(dvd);
        }

        Collections.sort(dvds);
        System.out.println("\n\n--------------------------------------------------------------------\n");
        for (DVD dvd:dvds)
        {

            System.out.println(dvd);
        }

        OrdenamientoPorGenero ordenamientoPorGenero = new OrdenamientoPorGenero();

        Collections.sort(dvds, ordenamientoPorGenero);
        System.out.println("\n\n--------------------------------------------------------------------\n");
        for (DVD dvd:dvds)
        {

            System.out.println(dvd);
        }

        OrdenamientoPorProtagonista ordenamientoPorProtagonista = new OrdenamientoPorProtagonista();

        Collections.sort(dvds, ordenamientoPorProtagonista);
        System.out.println("\n\n--------------------------------------------------------------------\n");
        for (DVD dvd:dvds)
        {

            System.out.println(dvd);
        }

        OrdenamientoPorDirector ordenamientoPorDirector = new OrdenamientoPorDirector();

        Collections.sort(dvds, ordenamientoPorDirector);
        System.out.println("\n\n--------------------------------------------------------------------\n");
        for (DVD dvd:dvds)
        {

            System.out.println(dvd);
        }
    }

    public static List<DVD> ListaDVD ()
    {

        DVD chihiro = new DVD("El viaje de Chihiro","Aventura, Fantasía, Drama","Chihiro","Un vato");
        DVD indiana_jones = new DVD("Indiana Jones y la arca perdida","Aventuta, Historico","Indiana Jones","Un vato");
        DVD todopoderoso = new DVD("Todopoderoso","Comedia","Bruce Nolan","Un vato");
        DVD anillos = new DVD("El señor de los Anillos: Las 2 torres","","Frodo","Un vato");
        DVD tesoro = new DVD("La leyenda del tesoro Perdido","Aventura, Thriller","Benjamin Franklin Gates","Un vato");
        DVD futuro = new DVD("Volver al futuro","Ciencia ficción, Aventuras, Comedia","Marty McFly","Un vato");
        DVD walle = new DVD("Wall•E","Ciencia Ficción","Wall•E","Un vato");
        DVD MIIB = new DVD("Hombres de Negro","Acción, Aventura, Ciencia ficción, Comedia","Agente J","Un vato");
        DVD avatar = new DVD("Avatar","Ciencia ficción, Aventura Acción, Fantástico, Animación","Jake Sully","Un vato");
        DVD bestia = new DVD("El niño y la bestia","Acción, Aventuras, Fantasía","Ren","Un vato");
        DVD totoro = new DVD("Mi vecino Totoro","Animación, infantil","Satsuki Kusakabe y Mei Kusakabe","Un vato");
        DVD starwars = new DVD("Star Wars","Space Opera, épica","Anakin Skywalker","Un vato");

        List<DVD> dvds = new ArrayList<DVD>();
        dvds.add(chihiro);
        dvds.add(indiana_jones);
        dvds.add(todopoderoso);
        dvds.add(anillos);
        dvds.add(tesoro);
        dvds.add(futuro);
        dvds.add(walle);
        dvds.add(MIIB);
        dvds.add(avatar);
        dvds.add(bestia);
        dvds.add(totoro);
        dvds.add(starwars);




        return dvds;
    }
}
