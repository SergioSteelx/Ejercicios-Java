package Colecciones;
import java.util.*;
//import java.util.Map.Entry;
public class ListSetMapTest
{
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<>();
        lista.add("Israel");
        lista.add("Dann");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");

        Set<String> set = new HashSet<>();

        set.add("Israel");
        set.add("Dann");
        set.add("Serch");
        set.add("Josman");
        set.add("Gera");
        set.add("Josman");
        set.add("Gera");

        Map<String,String> mapa = new HashMap<>();
        mapa.put("Isra","Israel Segundo");
        mapa.put("Dann","Dann HErnadez");
        mapa.put("Serch","Sergio Rivera");
        mapa.put("Josman","Jose manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");
        mapa.put("Josman","Jose manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");


        for (String Nickname:lista)
        {
            System.out.println("El nickname es: "+ Nickname + " sacado de una lista");
        }
        System.out.println("----------------------------------------------------------");
        for (String Nickname:set)
        {
            System.out.println("El nickname es: "+ Nickname + " sacado de un Set");
        }
        System.out.println("----------------------------------------------------------");
        for (Map.Entry<String,String> entry : mapa.entrySet())
             {
            System.out.println("El nickname es: "+ entry.getKey() + " para " + entry.getValue()+", y fue sacado de un Mapa");
        }
        System.out.println("----------------------------------------------------------");
        System.out.println(new ListSetMapTest().hashCode());
    }

}
