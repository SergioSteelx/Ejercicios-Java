package primeraclase;

import primeraclase.Excepciones.PlacaInvalidaException;

public class Auto extends Vehiculo
{
    private String placa;


    public Auto()
    {
        placa = "Desconocido";
        setNumLlantas(4);
    }

    public Auto(String placa) throws PlacaInvalidaException {

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
        setNumLlantas(4);
    }


    public String getPlaca()
    {
        return placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    public  void  lavarVehiculo()
    {
        System.out.println("Entrando al car wash");
    }
    public  void  lavarVehiculo(String lugar)
    {
        System.out.println("lavando coche en: "+ lugar);
    }


}
