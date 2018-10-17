package enumceses;

public enum TamanoCafe {
    CHICO(8),
    MEDIANO(10),
    GRANDE(16),
    JUMBO(20),
    MAMALON(30)
    {
        public String getTipoTapa()
        {
            return "Chingon";
        }
    };



    private int onzas;


    TamanoCafe(int onzas)
    {
        this.onzas = onzas;

    }


    public int getOnzas() {
        return onzas;
    }

    public String getTipoTapa()
    {
        return "Grandecillo";
    }

    public String getLargoPopote()
    {
        return "popotazo";
    }
}
