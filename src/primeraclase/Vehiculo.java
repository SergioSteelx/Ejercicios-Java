package primeraclase;

public abstract class Vehiculo
{
    // variable privada
    private Integer numLlantas;


    // getter de de una clase absstracta
    public abstract void lavarVehiculo();

    public Integer getNumLlantas()
    {
        return numLlantas;
    }

    //setter de una clase abstracta
    public void setNumLlantas(Integer numLlantas)
    {
        this.numLlantas = numLlantas;
    }

}


