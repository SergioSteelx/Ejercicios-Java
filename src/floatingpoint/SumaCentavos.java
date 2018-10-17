package floatingpoint;

import java.math.BigDecimal;

public class SumaCentavos
{
    public static void main(String[] args)
    {

        BigDecimal unCentavobigDecimal = new BigDecimal("0.01");
        BigDecimal sumaBigDecimal = unCentavobigDecimal.add(unCentavobigDecimal).add(unCentavobigDecimal)
                .add(unCentavobigDecimal)
                .add(unCentavobigDecimal)
                .add(unCentavobigDecimal);
        System.out.println(sumaBigDecimal);
        double unCentavo = 0.01;
        double suma = unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo;
        System.out.println(suma);
    }
}
