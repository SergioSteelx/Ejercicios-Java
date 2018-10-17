package enumceses;

public class TestCafe
{
    public  static  void  main(String args[])
    {
        Cafe cafe = new Cafe();

        cafe.setTamañoDeCafe(TamanoCafe.MAMALON);

        System.out.println("Tu cafe esta bien " + TamanoCafe.MAMALON + " y trae "+TamanoCafe.MAMALON.getOnzas()+" onzas de harto mucho cafe con una tapita para tu cafe de tamaño "+TamanoCafe.MAMALON.getTipoTapa()+" para que no se te tire y un "+TamanoCafe.MAMALON.getLargoPopote()+" para que le tomes");
    }
}
