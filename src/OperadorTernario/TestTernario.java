package OperadorTernario;

import java.util.ArrayList;

public class TestTernario
{
    public static void main(String args[])
    {

        ArrayList<String> lista = new ArrayList<>();

        lista = validaracceso(14,16,19,20,10,23);

        for(String i:lista)
        {
            System.out.println(i);
        }

    }

    public static ArrayList<String> validaracceso(Integer... x)
    {
        ArrayList<String> lista = new ArrayList<>();

        for(int i:x)
        {/*
            if (i<= 17)
            {
                lista.add( "tu edad es "+ i +" por lo tanto tu acceso es : Denegado");
            }
            else
            {
                lista.add( "tu edad es "+ i +" por lo tanto tu acceso es : Consedido");
            }
            */
            lista.add( (i<= 17) ? "tu edad es " + i + " por lo tanto tu acceso es : Denegado" :  "tu edad es "+ i +" por lo tanto tu acceso es : Consedido");

        }
        return lista;
    }
}
