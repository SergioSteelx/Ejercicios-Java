package primeraclase;
import primeraclase.Excepciones.PlacaInvalidaException;

public class Motocicleta extends Vehiculo
{
    private String placa;


    public Motocicleta()
    {
        placa = "Desconocido";
        setNumLlantas(2);
    }
    public Motocicleta(String placa) throws PlacaInvalidaException
    {
        placa=placa.trim();

        placa = placa.replace(" ","");
        if(placa.length() == 7 || placa.length() == 8)
        {
            this.placa = placa;
        }
        else
        {
            throw new PlacaInvalidaException("Placa invalida");
        }
        setNumLlantas(2);
    }

    public String getPlaca()
        {
            return placa;
        }

    public void setPlaca (String placa)
    {
        this.placa = placa;
    }

    public void lavarVehiculo()
    {
        System.out.println("Lavando motocicleta a mano");
    }
}
