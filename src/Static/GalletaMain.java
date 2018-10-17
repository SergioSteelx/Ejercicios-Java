package Static;
import java.util.*;


public class GalletaMain
{
    public static void main(String[] args)
    {
        Galleta galletas = new Galleta();
        List<Galleta> galleton = Listagalleta();

        for (Galleta galleta:galleton)
        {
            System.out.println(galleta);
            //System.out.println(galletas.getCantidad());


        }

    }
    public static List<Galleta> Listagalleta ()
    {

        Galleta chocolate = new Galleta("triki-trakes","Chica", "Negro", "chocolate", "chocolate", "Sin Relleno", "Cuadrada", "medio");
        Galleta Naranja = new Galleta("Polovornes","Chica", "Amarilla", "chocolate", "chocolate", "Sin Relleno", "Cuadrada", "medio");
        Galleta Limon = new Galleta("Piruetas","Chica", "Amarilla", "chocolate", "chocolate", "Sin Relleno", "Cuadrada", "medio");
        Galleta vainilla = new Galleta("Marias","Chica", "Amarilla", "Vainilla", "Vainilla", "Sin Relleno", "Cuadrada", "medio");
        Galleta conChispas = new Galleta("Chokis","Chica", "Amarilla con chispas de chocolate", "chocolate", "chocolate", "Sin Relleno", "Cuadrada", "medio");
        Galleta chocolateBlanco = new Galleta("Marloleado","Chica", "Marmol", "Chocolate", "Chocolate", "Cuadrada", "medio");
        Galleta Avena = new Galleta("Quaker","Chica", "Amarilla", "Vainilla", "Avena", "Sin Relleno", "Cuadrada", "medio");
        Galleta DobleChocolate = new Galleta("Chokis Chocolaton","Chica", "Cafe", "chocolate", "chocolate", "Con Relleno", "Cuadrada", "medio");
        Galleta Arandano = new Galleta("Quaker-A","Chica", "Amarilla", "Vainilla", "Arandano", "Sin Relleno", "Cuadrada", "medio");
        Galleta Canela = new Galleta("Ricanela","Chica", "Cafe", "Canela", "Canela", "Sin Relleno", "Cuadrada", "medio");
        Galleta animalitos = new Galleta("Animalitos","Chica", "Amarilla", "Vainilla", "Chocolate", "Sin Relleno", "Animal", "medio");
        Galleta fresa = new Galleta("Florentinas","Chica", "Rosa", "Fresa", "Fresa", "Sin Relleno", "Cuadrada", "medio");
        Galleta piruetas = new Galleta("Piruetas","Chica", "Amarilla", "Limon", "Limon", "Con Relleno", "Cuadrada", "medio");
        Galleta oreo = new Galleta("Oreo","Chica", "Amarilla", "chocolate", "chocolate", "Con Relleno", "Cuadrada", "medio");


        List<Galleta> dvds = new ArrayList<Galleta>();
        dvds.add(chocolate);
        dvds.add(Naranja);
        dvds.add(Limon);
        dvds.add(vainilla);
        dvds.add(conChispas);
        dvds.add(chocolateBlanco);
        dvds.add(Avena);
        dvds.add(DobleChocolate);
        dvds.add(Arandano);
        dvds.add(Canela);
        dvds.add(animalitos);
        dvds.add(fresa);
        dvds.add(piruetas);
        dvds.add(oreo);

        return dvds;
    }
}
