package EjemploSwitchOAlgoAsi;

public class TestSwitch
{
    public static void main(String args[])
    {
        int whololo = 16030210;

        switch (whololo)
        {
            case 1:
                for(int i =0;i<=1;i++) {
                    System.out.println("whololo");
                }
            break;

            case 2:
                for(int i =0;i<=2;i++)
                {System.out.println("whololo");}
            break;

            case 3:
                for(int i =0;i<=3;i++)
                {System.out.println("whololo");}
            break;
            default:
                int j =    16030206;
                whololo = whololo -j;

                for(int i =0;i<=whololo;i++)
                {
                    System.out.println("whololo");
                }
            break;

        }


        //color :V

        Color naranja = Color.AZUL;

        switch (naranja)
        {
            case AZUL:

                    System.out.println("el color es: whololo en azul");

                break;

            case ROJO:

                System.out.println("el color es: whololo en rojo");
                break;

            case VERDE:

                System.out.println("el color es: whololo en verde");
                break;
            default:
                int j =    16030206;
                whololo = whololo -j;

                for(int i =0;i<=whololo;i++)
                {
                    System.out.println("whololo");
                }
                break;

        }
    }
}
