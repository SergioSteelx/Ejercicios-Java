package primeraclase;

public abstract class Vehiculo {

    private Integer numLlantas;

    public Integer getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(Integer numLlantas) {
        this.numLlantas = numLlantas;
    }

    public abstract void lavarVehiculo();
}

