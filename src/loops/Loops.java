package loops;

import java.util.ArrayList;


    //------------------------- Este es un for -------------------------
public class Loops {
    public void iterarwhitfor()
    {
        for (int i = 0; i <= 10; ++i)
        {
            System.out.println("Dentro de la iteracion del ciclo for " + i);
        }

    }
    //------------------------- Este es un do while -------------------------
    public void iterarwhitwhile()
    {
        int i = 0;
        while(i<=10)
        {
            System.out.println("Dentro de la iteracion del ciclo while " + ++i);
        }
    }
    public void iterarwhitdowhile()
    {
        int i = 4;
        do
        {
            System.out.println("Dentro de la iteracion del ciclo do while " + ++i);
        }while(i == 0);
    }
    public void iterarwhitforeache()
    {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for(Integer numero : numeros)
        {
            System.out.println("Dentro de la iteracion del ciclo foreache " + numero);


    }
    }
}
