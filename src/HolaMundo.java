import loops.Loops;
import primeraclase.Auto;
import primeraclase.Excepciones.PlacaInvalidaException;
import primeraclase.Motocicleta;

public class HolaMundo
{
    public static void main(String[] args) throws Exception
    {
        //------------------------- Loop -------------------------
        //------------------------- instancia de Loop -------------------------
        Loops loops = new Loops();

        //------------------------- impresion de pantalla de hola mundo -------------------------
        System.out.println("Hola mundo cruel!");
        //Vehiculo veiculo = new Vehiculo();

        //------------------------- Impresiones de loops -------------------------
        loops.iterarwhitfor();
        loops.iterarwhitwhile();
        loops.iterarwhitdowhile();
        loops.iterarwhitforeache();

        try
        {
            //------------------------- Auto -------------------------
            //------------------------- Declaracion de Auto -------------------------
            Auto auto = new Auto();
            Auto auto2 = new Auto("ULB9803");
            //Auto auto3 = new Auto("ULB98032398289378923892378927389273982738273837892373892738973429873298048390w8903wu7r9ow898394823058903489");
            Auto auto4 = new Auto("ULB98039");
            //Auto auto5 = new Auto("   98039");

            //------------------------- Impresiones a consola de Auto -------------------------
            System.out.println("Placa de auto 1: "+auto.getPlaca());
            System.out.println("llantas: "+ auto.getNumLlantas());
            auto.lavarVehiculo();
            System.out.println("Placa de auto 2: "+auto2.getPlaca());
            System.out.println("llantas: "+ auto2.getNumLlantas());
            auto2.lavarVehiculo("casa");
            //System.out.println("Placa de auto 3: "+auto3.getPlaca());
            //System.out.println("llantas: "+ auto3.getNumLlantas());
            //auto3.lavarVehiculo();
            System.out.println("Placa de auto 4: "+auto4.getPlaca());
            System.out.println("llantas: "+ auto4.getNumLlantas());
            auto4.lavarVehiculo();
            //System.out.println("Placa de auto 5: "+auto5.getPlaca());
            //System.out.println("llantas: "+ auto5.getNumLlantas());
            //auto5.lavarVehiculo();
            //------------------------- moto -------------------------
            //------------------------- Declaracion de moto -------------------------
            Motocicleta moto = new Motocicleta("ULB9388");

            //------------------------- Impresiones a consola de moto -------------------------
            System.out.println("Placa de moto: "+moto.getPlaca());
            System.out.println("llantas: "+ moto.getNumLlantas());
            moto.lavarVehiculo();



        }
        catch (PlacaInvalidaException e)
        {
            // manda mensaje  y lo lanza otra vez
            System.out.println("ocurrio un problema al crear auto :" + e.getMessage());
            throw e;
        }
        finally
        {
            //liberar recursos
        }

    }
}
